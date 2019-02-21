package com.tepth.maintenancedispatch.comm;

/**
 * @Author royle.huang
 * @Date 2019/2/21 10:22
 * @Description 工单状态
 **/
public enum RepairStatusEnum {

    BACK_TO_FACTORY((byte)2, "已回厂，未交车"),
    EXCHANGE_TO_WORKER((byte)3, "已交车"),
    VEHICLE_INSPECTION((byte)3, "已竣检"),
    EXCHANGE_TO_DRIVER((byte)3, "已交车"),
    error((byte)3, "已交车");


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
