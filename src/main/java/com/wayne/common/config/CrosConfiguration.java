package com.wayne.common.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author Wayne
 * @Date 2019-09-29
 */
@Configuration
public class CrosConfiguration extends WebMvcConfigurerAdapter  {

    /**
     * 就是注册的过程，注册Cors协议的内容。
     * 如： Cors协议支持哪些请求URL，支持哪些请求类型，请求时处理的超时时长是什么等。
     * @param registry - 就是用于注册Cros协议内容的一个注册器。
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry
                .addMapping("/**")// 所有的当前站点的请求地址，都支持跨域访问。
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 当前站点支持的跨域请求类型是什么。
                .allowCredentials(true) // 是否支持跨域用户凭证
                .allowedOrigins("*") // 所有的外部域都可跨域访问。 如果是localhost则很难配置，因为在跨域请求的时候，外部域的解析可能是localhost、127.0.0.1、主机名
                .maxAge(3600); // 超时时长设置为1小时。 时间单位是秒。
    }

}
