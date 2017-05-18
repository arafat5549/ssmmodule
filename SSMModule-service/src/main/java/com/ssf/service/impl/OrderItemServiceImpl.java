package com.ssf.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssf.service.IOrderItemService;

import com.ssf.dao.OrderItemDao;
import com.ssf.model.OrderItem;

/**
 * 
 * IOrderItemService 接口实现类
 *
 * @author wang
 */
@Service(value = "orderItemService")
public class OrderItemServiceImpl implements IOrderItemService {

	@Resource(name = "orderItemDao")
	private OrderItemDao mapper;

	@Override
	public int selectCountByMap(Map<Object, Object> map) {
		return mapper.selectCountByMap(map);
	}

	@Override
	public List<OrderItem> selectListByMap(Map<Object, Object> map) {
		return mapper.selectListByMap(map);
	}

	@Override
	public OrderItem selectByPrimaryKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	//
	@Override
	public int deleteByPrimaryKey(Long id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	@Override
	public int deleteLogicByIds(Integer deleteFlag, Integer[] ids) {
		return mapper.deleteLogicByIds(deleteFlag, ids);
	}

	@Override
	public int insert(OrderItem record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(OrderItem record) {
		return mapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderItem record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderItem record) {
		return mapper.updateByPrimaryKey(record);
	}
}
