package com.ygyin.apiplatformcommon.service;


/**
 * @author yg
 * @description 针对表【user_api_info(用户调用接口信息)】的数据库操作Service
 * @createDate 2024-07-08 23:32:59
 */
public interface UserApiInfoGatewayService {

    /**
     * 统计用户调用接口次数，+1
     * @param apiId 被调用接口 id
     * @param userId 调用接口的用户 id
     * @return
     */
    boolean callNumCount(long apiId, long userId);
}
