package co.yiiu.hitbbs.config.service;

/**
 * Created by NPEteam.
 * Cohitright (c) 2023, All Rights Reserved.
 * https://yiiu.co
 */
public interface BaseService<T> {

    // 外接服务初始化实例方法
    T instance();
}
