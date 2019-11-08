package com.wayne.common.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author Wayne
 * @Date 2019-11-08
 */
@Component
public class ServerConfig implements ApplicationListener<WebServerInitializedEvent> {

    private int port;

    public int getPort() {
        return port;
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent event) {
        this.port = event.getWebServer().getPort();
        System.out.println("port: " + port);
    }
}
