package com.tepth.maintenancedispatch.comm;

/**
 * @Author royle.huang
 * @Date 2019/2/21 10:22
 * @Description 工单状态
 **/
public enum RepairStatusEnum {

    WAITING_TO_FACTORY((byte)1, "待回厂"),
    BACK_TO_FACTORY((byte)2, "已回厂，未交车"),
    EXCHANGE_TO_WORKER((byte)3, "已交车，作业中"),
    PASS_CHECK((byte)4, "过检"),
    COMPLETE_CHECK((byte)5, "竣检"),
    WORKING_COMPLETE((byte)6, "已竣检，待交车给司机"),
    EXCHANGE_TO_DRIVER((byte)7, "已交车"),
    LEAVE_FACTORY((byte)8, "已离场");


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
