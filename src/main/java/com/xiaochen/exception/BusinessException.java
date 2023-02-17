package com.xiaochen.exception;

/**
 * @author Chenyufeng
 * @date 2023/1/18
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}

