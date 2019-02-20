package com.tepth.maintenancedispatch.comm;


public enum RspCodeEnum{
    SUCCESS("0000", "成功"),
    USER_LOGIN_TIMEOUT("0001", "用户登录超时"),
    USER_NOT_LOGIN("0002", "用户没有登录"),
    USER_ERROR_LOGIN("0003", "用户信息错误"),
    USER_NOT_EXISTS("0004", "工号不存在"),
    PASSWORD_ERROR("0005", "密码输入错误"),
    VEHICLE_MAINTENANCE("0108", "车辆保养或维修"),
    MEMBER_DISABLE("0109", "帐号已被禁用"),
    ORDER_CONFLICT("0119", "当前车辆已经被占用"),
    MOBILE_NOT_NULL("0201", "手机号不能为空"),
    VERIFICATION_CODE_INVALID("0202", "验证码输入无效"),
    VERIFICATION_CODE_ERROR("0203", "验证码输入错误"),
    MESSAGE_SEND_FAILURE("0205", "短信验证码发送失败，请重试！"),
    USER_NAME_NOT_NULL("0206", "用户名不能为空"),
    MOBILE_ERROR("0207", "手机号错误"),
    NOT_SEND_FAST("0214","请不要频繁发送短信"),
    NUMBER_EXISTS("0215","输入的身份证号码已存在"),
    CHANGE_INFO_SUCCESS("0221","修改成功"),
    SUPPLEMENT_TOO_LONG("0223","补充内容过长"),
    CHOOSE_FAULT_TYPE("0224","请选择故障类型"),
    PARAMETER_INVALID("0229","参数无效"),
    MODEL_INVALID("0230","车型无效"),
    NUMBER_EMPTY("0231","身份证号码为空"),
    SMS_TEMPLATE_NOT_FOUND("0242","短信模板不存在"),
    SMS_PLATFORM_SEND_HAPPENS_ERROR("0242","短信平台发送发生错误"),
    SMS_PLATFORM_OFFLINE("0242","短信平台掉线"),
    UPDATE_TO_LATEST_VERSION("0243","请升级到最新版"),
    UNSUPPORTED_VERSION("0244","不支持的版本"),
    UNSUPPORTED_DEVICE("0244","不支持的设备"),
    BLACKLIST_USER("0245","您已是黑名单用户，如需用车请进行申述流程"),
    MEMBER_NOT_OPERATE_ORDER("0402","您没有权限"),
    REMOTE_OPERATION_EXCEPTION("0403","远程操作发生异常"),
    VEHICLE_NOT_BINDING_ORG("0420","车辆未绑定维修厂"),
    VEHICLE_NOT_BINDING_OPERATION("0421","车辆未绑定运营单位"),
    VEHICLE_BINDING_OPERATION_NULL("0422","车辆绑定的运营单位不存在或已删除"),
    VEHICLE_NOT_BINDING_USER("0423","用户未绑定车辆"),
    VEHICLE_NOT_BINDING_VEHICLE_MODEL("0424","车辆未绑定车型"),
    VEHICLE_NOT_BINDING_LINE("0425","车辆未绑定线路"),
    UPDATE_VEHICLE_FAIL("0426","修改车辆记录失败"),
    VEHICLE_NOT_EXIT("0427","车辆不存在或已删除"),
    VEHICLE_BINDING_FAIL("0428","绑定车辆失败"),
    VEHICLE_MAINTENANCE_BEING("0429","用户车辆正在维保中"),
    ORGANIZATION_TYPE_NOT_NULL("0501","组织类型参数不能为空"),
    ORGANIZATION_TYPE_PARAMETER_INVALID("0502","组织类型参数无效"),
    CURRENT_REPAIR_NOT_EXISTS("0503","用户当前不存在报修记录"),
    VEHICLE_REPAIR_NOT_EXISTS("0601","当前无报修车辆"),
    FAIL("9999", "系统发生未知错误");
    String code;
    String desc;

    RspCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static RspCodeEnum valueOfCode(String code) {
        for (RspCodeEnum value : values()) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return FAIL;
    }
}
