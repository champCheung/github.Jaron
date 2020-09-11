package com.jaron.singleton;

/**
 * @author by Jaron.Zhang
 * @Date 2020.9.11 10:46
 * @Description TODO
 */
public enum EmunSingleton {
    INSTANCE;

    /**
     * 可以省略此方法，直接通过Singleton.INSTANCE进行操作
     * @return
     */
    public static EmunSingleton getInstance(){
        return EmunSingleton.INSTANCE;
    }
}
