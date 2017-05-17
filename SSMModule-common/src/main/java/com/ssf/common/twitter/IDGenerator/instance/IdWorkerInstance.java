package com.ssf.common.twitter.IDGenerator.instance;

import com.ssf.common.twitter.IDGenerator.IdWorker;
import com.ssf.common.utils.IdWorkerPropertiesUtilss;

public class IdWorkerInstance {
	
	private IdWorkerInstance() {
		
	}

	private static final IdWorker idWorker = new IdWorker(IdWorkerPropertiesUtilss.getWorkerId(), IdWorkerPropertiesUtilss.getDatacenterId());
	
	private static IdWorker getInstance() {
		return idWorker;
	}
	
	public static Long getId() {
		return getInstance().nextId();
	}
	
	public static String getIdStr() {
		return getInstance().nextId() + "";
	}
}
