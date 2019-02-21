package com.tepth.maintenancedispatch.comm;

/**
 * @Author royle.huang
 * @Date 2019/2/21 10:22
 * @Description 工单状态
 **/
public enum RepairStatusEnum {

    HEAD_OFFICE((byte)0, "总公司"),
    BRANCH_OFFICE((byte)1, "分公司"),
    MAINTENANCE_FACTORY((byte)2, "维修厂"),
    MINOR_REPAIR_GROUP((byte)3, "小修组"),
    MAINTENANCE_GROUP((byte)4, "保养组"),
    STATION((byte)5,"驻站点"),
    WORK_STATION((byte)6, "工位"),
    BACK_TO_FACTORY((byte)2, "已回厂，未交车"),
    EXCHANGE_TO_WORKER((byte)3, "已交车");


    Byte code;
    String desc;

    RepairStatusEnum(Byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Byte getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
