package com.six.electirc_account.confifg;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: webMvc配置
 * @Author: stugxr
 * @Date: 2021/6/11 5:00 下午
 * @Version: 1.0
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    /**
     *
     * @Description:映射静态资源路径
     * @author gxr
     * @date 2021/6/11 5:07 下午
     * @param * @param registry
     * @return void
     */
    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry){
        /**
         *
         * @Description:静态资源的映射
         * @author gxr
         * @date 2021/6/11 6:10 下午
         * @param registry
         * @return void
         */
        //springboot1.5不需要配置静态资源的映射,但是springboot2.0以后需要配置
        //第一个参数是设置请求前缀,第二个参数是设置资路径
        registry.addResourceHandler("/**").addResourceLocations(ResourceUtils.CLASSPATH_URL_PREFIX+"/static/");
        super.addResourceHandlers(registry);
    }

    /**
     *
     * @Description:欢迎也-登录页面
     * @author gxr
     * @date 2021/6/11 5:07 下午
     * @param registry
     * @return void
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        //设置优先级
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

}
