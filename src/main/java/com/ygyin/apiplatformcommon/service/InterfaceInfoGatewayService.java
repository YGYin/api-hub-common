package com.ygyin.apiplatformcommon.service;

import com.ygyin.apiplatformcommon.model.entity.InterfaceInfo;

/**
 * @author yg
 * @description 针对表【interface_info(接口信息)】的数据库操作Service
 * @createDate 2024-06-19 12:13:24
 */
public interface InterfaceInfoGatewayService {

    /**
     * 通过 url 还有请求方法，从检查数据库中检查被调用接口是否存在
     *
     * @param url
     * @param method
     * @return
     */
    InterfaceInfo getCallInterfaceInfo(String url, String method);
}
