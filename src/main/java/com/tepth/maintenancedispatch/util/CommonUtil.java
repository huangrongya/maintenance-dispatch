package com.tepth.maintenancedispatch.util;


import java.util.Collection;
import java.util.Map;


/**
 * @ClassName(类名) : CommonUtil
 * @Description(描述) : 辅助类
 * @author(作者) ：suyl
 */
public abstract class CommonUtil {


    /**
     * @param pObj :
     * @return boolean true:为空
     * @throws :
     * @Description(功能描述) : 是否为空
     * @author(作者) ： suyl
     * @date (开发日期) : 2015年2月15日 上午8:59:56
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object pObj) {
        if (pObj == null) {
            return true;
        }
        if ("".equals(pObj)) {
            return true;
        }
        if (pObj instanceof String) {
            if (((String) pObj).length() == 0) {
                return true;
            }
        } else if (pObj instanceof Collection) {
            if (((Collection) pObj).size() == 0) {
                return true;
            }
        } else if (pObj instanceof Map) {
            if (((Map) pObj).size() == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param pObj ：
     * @return boolean
     * @throws :
     * @Description(功能描述) : 是否不为空
     * @author(作者) ： suyl
     * @date (开发日期) : 2015年2月15日 上午8:59:14
     */
    @SuppressWarnings("rawtypes")
    public static boolean isNotEmpty(Object pObj) {
        if (pObj == null) {
            return false;
        }
        if ("".equals(pObj)) {
            return false;
        }
        if (pObj instanceof String) {
            if (((String) pObj).length() == 0) {
                return false;
            }
        } else if (pObj instanceof Collection) {
            if (((Collection) pObj).size() == 0) {
                return false;
            }
        } else if (pObj instanceof Map) {
            if (((Map) pObj).size() == 0) {
                return false;
            }
        }
        return true;
    }


    /**
     * @param ：
     * @return boolean
     * @throws :
     * @Description(功能描述) : 是否不为空
     * @author(作者) ： suyl
     * @date (开发日期) : 2015年2月15日 上午8:59:14
     */
    @SuppressWarnings("rawtypes")
    public static boolean isNotEmptys(Object... objs) {
        for (Object obj : objs) {
            if (obj == null) {
                return false;
            }
            if ("".equals(obj)) {
                return false;
            }
            if (obj instanceof String) {
                if (((String) obj).length() == 0) {
                    return false;
                }
            } else if (obj instanceof Collection) {
                if (((Collection) obj).size() == 0) {
                    return false;
                }
            } else if (obj instanceof Map) {
                if (((Map) obj).size() == 0) {
                    return false;
                }
            }
        }
        return true;
    }


}
