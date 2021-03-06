package cn.xishan.oftenporter.porter.core.init;

import cn.xishan.oftenporter.porter.core.ParamSourceHandleManager;
import cn.xishan.oftenporter.porter.core.base.ParamDealt;

/**
 */
public interface PorterBridge
{
    String contextName();

    ParamDealt paramDealt();

    PorterConf porterConf();

    ParamSourceHandleManager paramSourceHandleManager();
}
