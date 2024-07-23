package com.ygyin.apiplatformcommon.service;

import com.ygyin.apiplatformcommon.model.entity.User;


/**
 * 用户公共服务
 *
 */
public interface UserGatewayService {

    /**
     * 从数据库中查看调用接口的用户是否已经分配 accessKey
     * @param accessKey
     * @return
     */
    User getCallUser(String accessKey);
}
