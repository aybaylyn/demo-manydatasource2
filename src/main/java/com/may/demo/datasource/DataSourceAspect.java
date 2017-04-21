package com.may.demo.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 数据库源设置的AOP，实现读写分离。 读操作都走从库，写操作走主库。
 * <p>
 * <p>
 * Created by May on 4/20/17.
 */
@Aspect
@Component
public class DataSourceAspect {


    @Pointcut("execution(* com.may.demo.service..*.*(..))")
    public void pointCut() {
    }

    @Before(value = "pointCut()")
    public void before(JoinPoint point) {

        MethodSignature signature = (MethodSignature) point.getSignature();

        Method method = signature.getMethod();
        if (method.isAnnotationPresent(DataSource.class)) {
            DataSource dataSource = method.getAnnotation(DataSource.class);
            if (dataSource.readOnly()) {
                //只读，走从库
                HandleDataSource.putDataSource(AvailableDataSources.DATASOURCE_SLAVE);
            } else {
                //走主库
                HandleDataSource.putDataSource(AvailableDataSources.DATASOURCE_MASTER);
            }
        }

    }


}
