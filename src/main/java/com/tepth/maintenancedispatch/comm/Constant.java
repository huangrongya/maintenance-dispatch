package com.tepth.maintenancedispatch.comm;

/**
 * @Author royle.huang
 * @Date 2019/2/1 14:31
 * @Description 常量
 **/
public class Constant {

    /**机调员角色id**/
    public static int ROLE_ID_MAINTENANCE_DISPATCHER = 9;
    /**技工角色id**/
    public static int ROLE_ID_WORKER = 2;
    /**司机角色id**/
    public static int ROLE_ID_DRIVER = 1;


    /**在线**/
    public static int ONLINE = 1;
    /**不在线**/
    public static int OFFLINE = 0;

    /**物料待领料**/
    public static byte MATERIAL_WAITING = 1;
    /**物料已领料**/
    public static byte MATERIAL_RECIEVE = 2;
    /**物料已退料**/
    public static byte MATERIAL_BACK = 3;

    /**作业状态 待作业**/
    public static byte PROCESS_STATUS_WAITING = 1;
    /**作业状态 作业中**/
    public static byte PROCESS_STATUS_WORKING = 2;
    /**作业状态 已完成**/
    public static byte PROCESS_STATUS_FILISH = 3;

    /**区域类型：工位**/
    public static byte AREA_TYPE_WORK_STATION = 1;
}
