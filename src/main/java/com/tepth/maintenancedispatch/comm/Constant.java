package com.tepth.maintenancedispatch.comm;

/**
 * @Author royle.huang
 * @Date 2019/2/1 14:31
 * @Description 常量
 **/
public class Constant {

    /**机调员角色id**/
    public static int MAINTENANCE_DISPATCHER_ROLE_ID = 9;

    /**待领料**/
    public static byte MATERIAL_WAITING = 1;
    /**已领料**/
    public static byte MATERIAL_RECIEVE = 2;
    /**已退料**/
    public static byte MATERIAL_BACK = 3;

    /**车辆状态数组**/
    public static Integer[] REPAIR_STATUS_WAITING = {1, 2};
    public static Integer[] REPAIR_STATUS_WORKING = {3, 4};
}
