package com.ssf.common.myPage;

import java.io.Serializable;
import java.util.List;

/**
 * 查询结果 
 * @author alexgaoyh
 *
 * @param <T>
 */
public class MyQueryResult<T> implements Serializable {
	private List<T> resultlist;
	/**
	 * 页面看到的总记录数 默认情况下=resultlist.size(),也可自行指定
	 */
	private long totalrecord;//

	public List<T> getResultlist() {
		return resultlist;
	}

	public void setResultlist(List<T> resultlist) {
		this.resultlist = resultlist;
	}

	public long getTotalrecord() {
		return totalrecord;
	}

	public void setTotalrecord(long totalrecord) {
		this.totalrecord = totalrecord;
	}

	public MyQueryResult(List<T> resultlist, long totalrecord) {
		super();
		this.resultlist = resultlist;
		this.totalrecord = totalrecord;
	}

}