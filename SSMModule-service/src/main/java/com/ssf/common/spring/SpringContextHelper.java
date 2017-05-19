package com.ssf.common.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 获取Spring上下文对象
 * 
 * @author wyy
 *
 */
@Component
public class SpringContextHelper implements ApplicationContextAware{

	private static ApplicationContext applicationContext; // Spring应用上下文环境

	@Value("${redis.avaliable}")
	private boolean redisAvaliable;
	
    /*
     * 实现了ApplicationContextAware 接口，必须实现该方法；
     *通过传递applicationContext参数初始化成员变量applicationContext
     */

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    	SpringContextHelper.applicationContext = applicationContext;
    }



    public static ApplicationContext getApplicationContext() {
           return applicationContext;
           
           //applicationContext.getBean(PropertyPlaceholderConfigurer.class).p
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) throws BeansException {
           return (T) applicationContext.getBean(name);
    }
    
    public boolean getRedisAcaliable(){
    	return false;
    }
    //public void 
}
