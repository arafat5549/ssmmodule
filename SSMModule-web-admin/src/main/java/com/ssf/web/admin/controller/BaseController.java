package com.ssf.web.admin.controller;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.ArrayUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssf.common.myPage.enums.MyPagePerLengthEnum;
import com.ssf.common.vo.enums.DeleteFlagEnum;
import com.ssf.sys.model.SysUser;

public class BaseController<T extends Serializable> {

	
	
	@RequestMapping(value = "/list")
	public ModelAndView list(ModelAndView model, HttpServletRequest request) {
		System.out.println("list--------------");
		RequestMapping rm = this.getClass().getAnnotation(RequestMapping.class);
		String moduleName = "";
		if (rm != null) {
			String[] values = rm.value();
			if (ArrayUtils.isNotEmpty(values)) {
				moduleName = values[0];
			}
		}
		if (moduleName.endsWith("/")) {
			moduleName = moduleName.substring(0, moduleName.length() - 1);
		}
		
		model.addObject("moduleName", moduleName);
		model.addObject("deleteFlagEnum", DeleteFlagEnum.values());
		model.addObject("myPagePerLengthEnum", MyPagePerLengthEnum.values());
		
		model.setViewName(moduleName + "/list");
		
		System.out.println(moduleName);
		
		return model;
	}
	
	@RequestMapping(value = "/add")
	public ModelAndView add(ModelAndView model, HttpServletRequest request) {

		RequestMapping rm = this.getClass().getAnnotation(RequestMapping.class);
		String moduleName = "";
		if (rm != null) {
			String[] values = rm.value();
			if (ArrayUtils.isNotEmpty(values)) {
				moduleName = values[0];
			}
		}
		if (moduleName.endsWith("/")) {
			moduleName = moduleName.substring(0, moduleName.length() - 1);
		}
		
		model.addObject("moduleName", moduleName);
		
		model.setViewName(moduleName + "/add");
		
		return model;
	}
	
}
