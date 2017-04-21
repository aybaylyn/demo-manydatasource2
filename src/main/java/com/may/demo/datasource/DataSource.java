package com.may.demo.datasource;

import org.apache.commons.lang3.StringUtils;

import java.lang.annotation.*;

/**
 * //@Target注解：用于描述注解的使用范围，超出范围时编译失败。取值METHOD:用于描述方法
 *
 * Created by May on 4/19/17.
 */

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DataSource {

    String datasource() default StringUtils.EMPTY;

    boolean readOnly() default true;
}
