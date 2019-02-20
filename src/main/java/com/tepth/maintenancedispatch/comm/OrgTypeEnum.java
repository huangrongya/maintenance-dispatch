package com.tepth.maintenancedispatch.comm;

public enum OrgTypeEnum {
    //机构类型：0-总公司 1-分公司 2-维修厂 3-小修组 4-保养组 5-驻站点 6-工位

    HEAD_OFFICE(0, "总公司"),
    BRANCH_OFFICE(1, "分公司"),
    MAINTENANCE_FACTORY(2, "维修厂"),
    MINOR_REPAIR_GROUP(3, "小修组"),
    MAINTENANCE_GROUP(4, "保养组"),
    STATION(5,"驻站点"),
    WORK_STATION(6, "工位");


    Integer code;
    String desc;

    OrgTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
