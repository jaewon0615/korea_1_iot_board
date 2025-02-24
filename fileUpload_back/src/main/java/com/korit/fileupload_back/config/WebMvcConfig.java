package com.korit.fileupload_back.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.resource.PathResourceResolver;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URLDecoder;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Value("${root.path}")
    private String rootPath;

    @Override
    public void addResourceHandlers( ResourceHandlerRegistry registry){
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:///" + rootPath)
                .resourceChain(true)
                .addResolver(new PathResourceResolver(){

                });
    }
}
