package com.ssf.web.admin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssf.common.myPage.MyPageView;
import com.ssf.common.utils.StringUtilss;
import com.ssf.common.vo.mybatis.pagination.Page;
import com.ssf.sys.model.SysUser;
import com.ssf.sys.service.ISysUserService;

@Controller
@RequestMapping("sys/user/")
public class SysUserController extends BaseController<SysUser>{

	public static void main(String[] args) {
		System.out.println("--------------------------------");
		SysUserController web = new SysUserController();
		web.list(new ModelAndView(), null);
	}
	
	@Resource(name="sysUserService")
	private ISysUserService sysUserService;
	/**
	 * 封装参数部分
	 * @param request
	 * @return
	 */
	protected MyPageView<SysUser> decorateCondition(HttpServletRequest request) {
		
		String currentPageStr = request.getParameter("currentPage");
		if(StringUtilss.isEmpty(currentPageStr)) {
			currentPageStr = "1";
		}
		
		String recordPerPageStr = request.getParameter("recordPerPage");
		if(StringUtilss.isEmpty(recordPerPageStr)) {
			recordPerPageStr = "10";
		}

		int beginInt = Integer.parseInt(currentPageStr) >=1 ? Integer.parseInt(currentPageStr) : 1;
		
		Page page = new Page((beginInt - 1)*Integer.parseInt(recordPerPageStr), Integer.parseInt(recordPerPageStr));
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("page", page);
		
		//TODO 搜索条件添加
		MyPageView<SysUser> pageView = sysUserService.generateMyPageViewVO(map);
		
		return pageView;
	}
	
	@Override
	public ModelAndView list(ModelAndView model, HttpServletRequest request) {

		super.list(model, request);
		
		//MyPageView<SysUser> pageView = decorateCondition(request);
		//model.addObject("pageView", pageView);

		return model;

	}
}
