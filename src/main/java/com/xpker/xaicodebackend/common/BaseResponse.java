package com.xpker.xaicodebackend.common;

import com.xpker.xaicodebackend.exception.ErrorCode;
import lombok.Data;

/**
 * 公共响应类
 */
@Data
public class BaseResponse<T> {
    private int code;
    private T data;
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    /**
     * 调用成功
     * @param code
     * @param data
     */
    public BaseResponse(Integer code, T data) {
        this(code, data, "");
    }

    /**
     *  调用失败
     * @param errorCode
     */
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
