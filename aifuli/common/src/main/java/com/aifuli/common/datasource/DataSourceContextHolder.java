package com.aifuli.common.datasource;

/**
 *
 * <p>Title:DataSourceContextHolder</p>
 * <p>Description:操作线程安全变量里的数据源名称</p>
 * <p>Company:www.ideabinder.com</p>
 * @author stone
 * @date 2016年5月20日
 */
public class DataSourceContextHolder {

    private static final ThreadLocal contextHolder = new ThreadLocal<>();

    public static void setDataSourceName(String dataSourceName){
        contextHolder.set(dataSourceName);
    }

    public static String getDataSourceName(){

        return (String) contextHolder.get();
    }

    public static void clearDataSourceType(){
        contextHolder.remove();
    }
}

