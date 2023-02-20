package com.xiaochen.test;

/**
 * @author Chenyufeng
 * @date 2023/1/31
 */
@FunctionalInterface
public interface IConvert<F, T> {

    T convert(F form);
}
