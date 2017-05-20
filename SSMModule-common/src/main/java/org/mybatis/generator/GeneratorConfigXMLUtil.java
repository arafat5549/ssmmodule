package org.mybatis.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.CloneUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springside.modules.utils.io.URLResourceUtil;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.ssf.common.utils.StringUtilss;
import com.ssf.common.utils.XmlParserUtilss;

/**
 * 读取数据库 生成所有table标签
 * 源文件:  src/main/resources/generatorConfig.xml
 * 生成文件: src/main/resources/generatorConfigBak.xml
 * 
 */
public class GeneratorConfigXMLUtil {
	
	/*
	@SuppressWarnings("rawtypes")
	public static void convertXmlStrToObjectTest(Properties props,String dbName,String dbType,String src,String out) throws SAXException, IOException, CloneNotSupportedException {
		
		InputStream is = URLResourceUtil.asStream("classpath://"+src);
		
		Document document = XmlParserUtilss.getDocument(is);
		deleteXmlNotation(document.getRootElement());
		
		List list = document.selectNodes("//table");
		Iterator  iter = list.iterator(); 
		Element ele =null;
        while (iter.hasNext()) 
        {  
        	ele = (Element) iter.next();   
        }  
        //生成所有table节点
        List<String> tableNames = DataBasePopulator.getTableNames(props,dbName,dbType);
        for (String tname : tableNames) {
			//System.out.println(tname);
			Element newele = (Element) CloneUtils.clone(ele); 
			String base = StringUtilss.toCamelCase(tname.replace(TABLE_PREFIX, ""));
			base = StringUtils.capitalize(base);
			newele.addAttribute("mapperName", base +"Dao");
			newele.addAttribute("tableName",  tname);
			newele.addAttribute("domainObjectName", base);
			newele.addAttribute("alias", tname);  
	        
	        ele.getParent().add(newele);
		}
        ele.getParent().remove(ele);
	
        
        String outpath = URLResourceUtil.asFile("classpath:"+out).toString();
		File outFile = new File(outpath);
		OutputFormat format = OutputFormat.createPrettyPrint();  
        format.setEncoding("UTF-8");//根据需要设置编码  
		XMLWriter writer = new XMLWriter(new FileWriter(outFile),format);  
        writer.write(document);  
        writer.close();  
        System.out.println("生成Generator配置文件:"+outpath);
	}
	*/
	
	private static Element selectElement(String name,Document document){
		List list = document.selectNodes(name);
		Iterator  iter = list.iterator(); 
		Element ele =null;
        while (iter.hasNext()) 
        {  
        	ele = (Element) iter.next();   
        }  
        return ele;
	}
	
	private static void generteConfigBase(List<String> tableNames,String src,String out,String pName,String mName) throws IOException, CloneNotSupportedException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException{
		InputStream is = URLResourceUtil.asStream("classpath://"+src);
		
		Document document = XmlParserUtilss.getDocument(is);
		//System.out.println(document.asXML()); 
		deleteXmlNotation(document.getRootElement());
		
		Element ele = selectElement("//table",document);
        //生成所有table节点
        for (String tname : tableNames) {
			Element newele = (Element) CloneUtils.clone(ele);
			
			String base = StringUtils.capitalize(StringUtilss.toCamelCase(tname));
			newele.addAttribute("mapperName", base +"Dao");
			newele.addAttribute("tableName",  tname);
			newele.addAttribute("domainObjectName", base);
			newele.addAttribute("alias", tname);  
	        ele.getParent().add(newele);
		}
        ele.getParent().remove(ele);
        
        if(!StringUtils.isBlank(mName)){
        	Element element = selectElement("//javaModelGenerator",document);
        	element.addAttribute("targetPackage", mName);
        }
        if(!StringUtils.isBlank(pName)){
        	Element element = selectElement("//sqlMapGenerator",document);
        	element.addAttribute("targetPackage", pName);
            System.out.println(pName);
            
        	Element element2 = selectElement("//javaClientGenerator",document);
        	element2.addAttribute("targetPackage", pName);
        }
        
        
        //String name = Resources.getResourceURL(out).toString();//getResourceAsFile(out).toString();
        System.out.println(out);
        String outpath = URLResourceUtil.asFile(out).getAbsolutePath();;//URLResourceUtil.asFile("classpath://"+out).toString();
		File outFile = new File(outpath);
		if(!outFile.exists())
		{
			outFile.getParentFile().mkdirs();
		}
		
		OutputFormat format = OutputFormat.createPrettyPrint();  
        format.setEncoding("UTF-8");//根据需要设置编码  
		XMLWriter writer = new XMLWriter(new FileWriter(outFile),format);  
        writer.write(document);  
        writer.close();  
        System.out.println("生成Generator配置文件:"+outpath);
	}
    /** 
     * 去掉注释 
     */  
    @SuppressWarnings("unchecked")
	private static void deleteXmlNotation(Element ele){  
        Iterator<Node>nodes = ele.nodeIterator();  
        List<Node> rmNodes=new ArrayList<Node>();  
        //循环收集可以删除的节点  
        while(nodes.hasNext()){  
            Node subNode=nodes.next();  
            if(subNode.getNodeType()==Node.COMMENT_NODE){   
                rmNodes.add(subNode);  
               // rmNodes.add(nodes.next());  
            }  
        }  
        //删除收集到的节点  
        for(Node node:rmNodes){  
            ele.remove(node);  
        }  
        //递归，处理下级节点  
        Iterator<Element>eleIt= ele.elementIterator();  
        while(eleIt.hasNext()){  
            deleteXmlNotation(eleIt.next());  
        }
    }
	
    
    public static Multimap<String, String> getTableMultimap(List<String> tableNames,List<String> prefixs){
    	String regex = "";
		if(prefixs != null)
			regex = "("+Joiner.on("|").join(prefixs)+")";
		
		Pattern pattern = Pattern.compile(regex);
		Multimap<String, String> multimap = ArrayListMultimap.create();
		for (String tname : tableNames)  
		{
			String base = tname;
			Matcher macther = pattern.matcher(tname);
			String find = "";
			if(macther.find())
			{
				find = macther.group();
				tname = tname.replace(find, "");
			}
			String packageName = (find).replace("_", ".");
			multimap.put(packageName, base);
		}
		return multimap;
    }
    /**
	 * 读取数据库 生成所有table标签<p>
	 * 
	 * 源文件:  src/main/resources/generatorConfig.xml<p>
	 * 生成文件: src/main/resources/generatorConfigBak.xml<p>
	 * 
	 * @param dbName 数据库名称
	 * @param dbType 数据库类型 (支持mysql和oracle) 默认为"mysql"
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws InstantiationException 
     * @throws IllegalAccessException 
	 */
	public static List<String> generateConfigXML(List<String> tableNames,List<String> prefixs,String src,String myBussinessPackage,String myModelPackage) throws IOException, CloneNotSupportedException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException{
		//String src = "generatorConfig.xml";
		//List<String> tableNames = Lists.newArrayList("sys_pix_user","sys_product","rp_account_check_batch","pms_menu","pix_account","demo");
		//String myBussinessPackage = "com.ssf.dao";
		//String myModelPackage = "com.ssf.model";
		//List<String> prefixs = Lists.newArrayList("rp_","pms_","sys_");//也就是包名
		
		List<String> configs =  Lists.newArrayList();
		
//		String regex = "";
//		if(prefixs != null)
//			regex = "("+Joiner.on("|").join(prefixs)+")";
//		
//		Pattern pattern = Pattern.compile(regex);
//		Multimap<String, String> multimap = ArrayListMultimap.create();
//		for (String tname : tableNames)  
//		{
//			String base = tname;
//			Matcher macther = pattern.matcher(tname);
//			String find = "";
//			if(macther.find())
//			{
//				find = macther.group();
//				tname = tname.replace(find, "");
//			}
//			String packageName = (find).replace("_", ".");
//			multimap.put(packageName, base);
//		}
		
		Multimap<String, String> multimap = getTableMultimap(tableNames,prefixs);
		
		int srcidx = src.lastIndexOf(".");
		String outBaseName =  src.substring(0,srcidx);
		for (String key : multimap.keySet()) {
			int idx = myBussinessPackage.lastIndexOf(".");
			String pName = myBussinessPackage.substring(0,idx)+"." + key+"."+myBussinessPackage.substring(idx+1);
			pName = Joiner.on(".").join(Splitter.on(".").omitEmptyStrings().split(pName));
			
			String mName = myModelPackage.substring(0,idx)+"." + key+"."+myModelPackage.substring(idx+1);
			mName = Joiner.on(".").join(Splitter.on(".").omitEmptyStrings().split(mName));
			
			String out = outBaseName+"Bak.xml";
			if(prefixs != null){
				out = outBaseName+"_"+key+"xml";
				if(key.equals("")){
					out = outBaseName+"_"+key+".xml";
				}
				out = "generator/"+out;	
				configs.add(out);
			}
			else{
				configs.add(out);
			}
			out = "src/main/resources/"+  out;
		    generteConfigBase((List<String>)multimap.get(key), src, out ,pName,mName);
		}
		
		return configs;
	}

//	public static void main(String[] args) {
//		 try {
//			generateConfigXML();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch (CloneNotSupportedException e) {
//			e.printStackTrace();
//		}
//	}
	
}
