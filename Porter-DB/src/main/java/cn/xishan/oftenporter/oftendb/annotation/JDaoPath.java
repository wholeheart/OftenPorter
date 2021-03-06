package cn.xishan.oftenporter.oftendb.annotation;

import cn.xishan.oftenporter.oftendb.jbatis.JDao;
import cn.xishan.oftenporter.oftendb.jbatis.JDaoOption;

import java.lang.annotation.*;

/**
 * <pre>
 *  注解在{@linkplain JDao JDao}上。
 * 1.当{@linkplain #relativeToOptionPath()}为false时相对于当前所在对象的路径,支持:../（上一级目录）,./（当前目录）,/（从根目录开始）
 * 2.默认为当前Unit的路径。
 * </pre>
 * Created by chenyg on 2017-05-10.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface JDaoPath
{
    String value() default "";

    /**
     * 当{@linkplain #value()}为""时使用。不包含文件名。
     *
     * @return
     */
    String pathDir() default "";

    /**
     * js文件的名称，默认为"当前对象名.js"
     *
     * @return
     */
    String name() default "";

    /**
     * 名称使用"变量的名称.js",优先于{@linkplain #name()}
     *
     * @return
     */
    boolean fieldName() default false;

    /**
     * 默认为true。是否相对于{@linkplain JDaoOption JDaoOption}中的配置的路径。
     *
     * @return false时相对于当前所在类的class路径；为true时，若设置了调试目录，相对于目录，否则相对于class所在路径。
     */
    boolean relativeToOptionPath() default true;
}
