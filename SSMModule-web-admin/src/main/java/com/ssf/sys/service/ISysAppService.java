package com.ssf.sys.service;

import java.util.List;
import java.util.Map;

import com.ssf.sys.model.SysApp;
import com.ssf.common.myPage.MyPageView;

/**
 * 
 $ {className} 模块 接口
 * 
 * @author wang
 *
 */
public interface ISysAppService {

    //读取部分
    
	int selectCountByMap(Map<Object, Object> map);
	/**
	 * 根据参数过滤结果集<p>
	 * 
	 *  用法例子(分页效果):<br>
	 *  Map<Object,Object> map = new HashMap<Object, Object>();<br>
	 * 	Page page = new Page(0, 10);<br>
	 * 	map.put("page", page);<br>
	 * 	map.put("databaseId","mysql");//分页时候记得指定数据库集合<br>
	 * 
	 * @param map
	 * @return
	 */
	List<SysApp> selectListByMap(Map<Object, Object> map);

	List<SysApp> listPage(int offset,int limit,Map<Object, Object> map);

	SysApp selectByPrimaryKey(Integer id);
    
    //写部分
    /**
	 * 删除操作(注意会直接删除数据,物理删除)
	 * @param id
	 * @return
	 */
    int deleteByPrimaryKey(Integer id);
    
	/**
	 * 根据ids数组，逻辑删除对象(逻辑删除 置delete标志位)
	 * @param deleteFlag 要设置的delete标志位 0普通 1删除
	 * @param ids 
	 * @return
	 */
	int deleteLogicByIds(Integer deleteFlag, Integer[] ids);
	
	int insert(SysApp record);

	int insertSelective(SysApp record);

	int updateByPrimaryKeySelective(SysApp record);

	int updateByPrimaryKey(SysApp record);
    
    
     /**
     * 获取分页实体信息部分
     * @param map	参数传递，封装部分过滤参数
     * @return
     */
    MyPageView<SysApp> generateMyPageViewVO(Map<Object, Object> map);
}
