package com.ssf.service;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssf.model.Brand;


public class BrandServiceTest {

	private IBrandService service;
	//@Before
    public void prepare() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-*.xml");
        service = (IBrandService) ctx.getBean("brandService");
    }
	
	//@Test
	public void selectListByMapTest() {
		List<Brand> ret = service.selectListByMap(null);
		System.out.println("测试selectListByMap："+ret);
	}
}
