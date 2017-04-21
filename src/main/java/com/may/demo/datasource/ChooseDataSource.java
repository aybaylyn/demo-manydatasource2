package com.may.demo.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by May on 4/20/17.
 */
public class ChooseDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {

        String result = HandleDataSource.getDataSource();
        return result;
    }
}
