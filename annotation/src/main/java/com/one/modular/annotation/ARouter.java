package com.one.modular.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author diaokaibin@gmail.com on 12/6/20.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface ARouter {

    /**
     * 路由路径 /app/MainActivity
     * @return
     */
    String path();

    /**
     * 从path 中截取
     * @return
     */
    String group() default "";



}
