package com.shiep.classroom.core.shiepcrmcore.common;

/**
 * @program: shiep-crm-core
 * @description: 系统枚举字段
 * @author: liziyue
 * @create: 2019-01-04 18:40
 **/
public enum ShmCodeEnum{

    /**
     * 请求成功
     */
    REQUEST_SUCCESS_200("200","请求成功"),

    /**
     * 系统内部错误
     */
    REQUEST_FAIL_900("900","系统内部错误"),

    /**
     * 分页失败，pageNum、pageSize不能为空
     */
    PAGE_HELPER_901("901","分页失败，pageNum、pageSize不能为空");

    private String code;
    private String desc;

    ShmCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
