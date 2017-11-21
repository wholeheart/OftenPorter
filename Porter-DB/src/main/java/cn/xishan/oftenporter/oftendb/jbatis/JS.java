package cn.xishan.oftenporter.oftendb.jbatis;

import cn.xishan.oftenporter.porter.core.annotation.AutoSet;

/**
 * @author Created by https://github.com/CLovinr on 2017/11/21.
 */
@AutoSet.AutoSetDefaultDealt(gen = JDaoGen.class)
public interface JS
{
    <T> T call(Object... args);

    <T> T callMethod(String method, Object ... args);
}
