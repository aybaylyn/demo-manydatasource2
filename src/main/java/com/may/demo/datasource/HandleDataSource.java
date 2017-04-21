package com.may.demo.datasource;

/**
 * Created by May on 4/20/17.
 * <p>
 * 处理数据源
 */
public class HandleDataSource {

    public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDataSource(String datasource) {
        holder.set(datasource);
    }

    public static String getDataSource() {
        return holder.get();
    }
}
