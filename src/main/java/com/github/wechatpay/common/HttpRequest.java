package com.github.wechatpay.common;

import org.apache.http.HttpEntity;

/**
 * @program: wechatpay-apache-httpclient-demo
 * @description:
 * @author: FZ.Dong
 * @create: 2020-03-30 11:32
 */

public abstract class HttpRequest extends HttpMessage {


    public HttpRequest(String urlSuffix, String method) {
        super(urlSuffix, method);
    }

    public abstract HttpEntity getHttpEntity() throws Exception;
}
