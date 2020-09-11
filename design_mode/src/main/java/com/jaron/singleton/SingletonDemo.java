package com.jaron.singleton;

/**
 * @author by Jaron.Zhang
 * @Date 2020.9.10 17:35
 * @Description singleton mode
 */

public class SingletonDemo {
    /**
     * 1、饿汉模式
     * 线程安全，比较常用，但容易产生垃圾，因为一开始就初始化
     */

    /**
     * 指向自己实例的私有静态引用，主动创建
     */
//    private static SingletonDemo instance = new SingletonDemo();

    /**
     * 私有化构造器
     */
//    private SingletonDemo(){}

    /**
     * 以自己实例为返回值的静态的公有方法，静态工厂方法
     * @return
     */
//    public static SingletonDemo getInstance(){
//        return instance;
//    }

    /**
     * 2、懒汉模式
     */
    /**
     * 指向自己实例的私有静态引用
     */
//    private static SingletonDemo instance;

    /**
     * 私有化构造方法
     */
//    private SingletonDemo(){}

    /**
     * 以自己实例为返回值的静态的公有方法，静态工厂方法
     * @return
     */
//    public static SingletonDemo getInstance(){
//        //被动创建，在真正需要使用时(调用时)才去创建
//        if (instance ==null){
//            instance = new SingletonDemo();
//        }
//        return instance;
//    }

    /**
     * 3、双重加锁机制
     */
//    private volatile static SingletonDemo instance;
//    private SingletonDemo(){}
//    public static SingletonDemo getInstance(){
//        if (instance == null){
//            synchronized (SingletonDemo.class){
//                if (instance == null){
//                    instance = new SingletonDemo();
//                }
//            }
//        }
//        return instance;
//    }

    /**
     * 4、静态内部类单例模式
     */
//    private SingletonDemo(){}
//    private static class Inner{
//        private static final SingletonDemo instance = new SingletonDemo();
//    }
//    public static SingletonDemo getInstance(){
//        return Inner.instance;
//    }

}
