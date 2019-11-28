package com.sample.springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Jay
 * @version v1.0
 * @description 请添加类描述
 * @date 2019-10-29 16:45
 */
@Data
@ConfigurationProperties(prefix = "jdbc")
public class TwoBO {

    private String url;
}
