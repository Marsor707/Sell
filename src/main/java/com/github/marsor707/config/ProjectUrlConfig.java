package com.github.marsor707.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    //微信公众平台授权url
    public String wechatMpAuthorize;

    //微信开放平台授权url
    public String wechatOpenAuthorize;

    //项目url
    public String sell;
}
