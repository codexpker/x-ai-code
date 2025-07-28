package com.xpker.xaicodebackend.exception;

/**
 * 抛异常工具类
 */
public class ThrowUtils {
    // 条件成立，抛出异常
    public static void throwIf(Boolean condition, RuntimeException runtimeException){
        if(condition){
            throw runtimeException;
        }
    }

    public static void throwIf(Boolean condition, ErrorCode errorCode){
        if(condition){
            throw new BusinessException(errorCode);
        }
    }

    public static void throwIf(Boolean condition, ErrorCode errorCode, String message){
        if(condition){
            throw new BusinessException(errorCode, message);
        }
    }
}