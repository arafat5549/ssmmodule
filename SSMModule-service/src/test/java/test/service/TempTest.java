package test.service;

import java.util.Map;

import com.google.common.collect.Maps;
import com.ssf.common.vo.mybatis.pagination.Page;

public class TempTest {

	public static void main(String[] args) {
		Map<Object, Object> map = Maps.newHashMap();
		Page page =new Page(0,10);
		map.put("name", "wang");
		map.put("page", page);
		System.out.println(map.toString());
		
		String cache_key = "selectListByMap|" + map;
	}
}
