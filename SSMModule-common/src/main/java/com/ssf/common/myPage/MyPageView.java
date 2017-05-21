package com.ssf.common.myPage;

import java.io.Serializable;
import java.util.List;

/**
 * 分页组件 
 * @author alexgaoyh
 *
 * @param <T>
 */
public class MyPageView<T> implements Serializable {  
    /** 分页数据 **/  
    private List<T> records;  
    /** 页码开始索引和结束索引 **/  
    private MyPageIndex pageindex;  
    /** 总页数 **/  
    private long totalpage = 1;  
    /** 每页显示记录数，默认12 **/  
    private int recordPerPage=12;  
    /** 当前页 **/  
    private int currentpage = 1;  
    /** 总记录数 **/  
    private long totalrecord;  
    /** 页码数量，默认10 **/  
    private int pagecode = 10;  
    /** 获取记录的开始索引 **/  
    public int getStartRecordIndex() {  
        return (this.currentpage-1)*this.recordPerPage;  
    }  
    public int getPagecode() {  
        return pagecode;  
    }  
  
    public void setPagecode(int pagecode) {  
        this.pagecode = pagecode;  
    }  
    /** 
     * 构造函数 
     * @param recordPerPage 每页显示的记录数 
     * @param currentpage 当前页 
     */  
    public MyPageView(int recordPerPage, int currentpage) {  
        this.recordPerPage = recordPerPage;  
        this.currentpage = currentpage;  
    }  
    /** 
     * 构造函数 
     * @param recordPerPage 每页显示的记录数 
     * @param currentpage 当前页 
     * @param pagecode 页码数量 
     */  
    public MyPageView(int recordPerPage, int currentpage,int pagecode) {  
        this.recordPerPage = recordPerPage;  
        this.currentpage = currentpage;  
        this.pagecode=pagecode;  
    }  
      
    public void setQueryResult(MyQueryResult<T> qr){  
        setTotalrecord(qr.getTotalrecord());  
        setRecords(qr.getResultlist());  
    }  
      
    public long getTotalrecord() {  
        return totalrecord;  
    }  
    public void setTotalrecord(long totalrecord) {  
        this.totalrecord = totalrecord;  
        //总记录数变化时，要重新计算总页码和页码开始，结束索引  
        setTotalpage(this.totalrecord%this.recordPerPage==0? this.totalrecord/this.recordPerPage : this.totalrecord/this.recordPerPage+1);  
    }  
    public List<T> getRecords() {  
        return records;  
    }  
    public void setRecords(List<T> records) {  
        this.records = records;  
    }  
    public MyPageIndex getPageindex() {  
        return pageindex;  
    }  
    public long getTotalpage() {  
        return totalpage;  
    }  
    public void setTotalpage(long totalpage) {  
        this.totalpage = totalpage;  
        this.pageindex = MyPageIndex.getPageIndex(pagecode, currentpage, totalpage);  
    }  
    public int getRecordPerPage() {  
        return recordPerPage;  
    }  
    public int getCurrentpage() {  
        return currentpage;  
    }  
    
	/**
	 *  封装 分页数据实体信息
	 * @param recordPerPage	每页多少条数据
	 * @param currentPage	当前页数
	 * @param totalCount	总共多少条数据
	 * @param list	当前页数的数据
	 * @return
	 */
	public static <T extends Serializable> MyPageView<T> generaterMyPageView(int recordPerPage, int currentPage, int totalCount, List<T> list) {
		MyPageView<T> pageView = new MyPageView<T>(recordPerPage, currentPage);
		MyQueryResult<T> qr = new MyQueryResult<T>(list, totalCount);
		pageView.setQueryResult(qr);
		return pageView;
	}
}  