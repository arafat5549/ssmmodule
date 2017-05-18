package com.ssf.utils;

import java.util.HashMap;
import java.util.Map;


import com.ssf.common.vo.mybatis.pagination.Page;

/**
 * 分页工具类
 * 
 * @author wyy
 *
 */
public class PageUtil {

	public static Map<Object,Object> getPageParamMap()
	{
		return new HashMap<Object, Object>();
	}
	
	public static Map<Object , Object> getPageParamMap(int offset,int limit){
		return  getPageParamMap(null, offset, limit);
	}
	
	public static Map<Object , Object> getPageParamMap(HashMap<Object, Object> paramMap,int offset,int limit){
		if(paramMap==null){
			paramMap = new HashMap<Object, Object>();
		}
		Page page = new Page(offset, limit);
		paramMap.put("page", page);
		paramMap.put("databaseId","mysql");
		return paramMap;
	}
	
	
}
