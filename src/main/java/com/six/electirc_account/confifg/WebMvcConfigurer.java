package com.six.electirc_account.confifg;

import com.six.electirc_account.interceptor.AuthorizeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Description: webMvc配置
 * @Author: stugxr
 * @Date: 2021/6/11 5:00 下午
 * @Version: 1.0
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurationSupport {
    @Autowired
    AuthorizeInterceptor authorizeInterceptor;

    /**
     *
     * @Description:映射静态资源路径
     * @author gxr
     * @date 2021/6/11 5:07 下午
     * @param registry
     * @return void
     */
    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry){
        //springboot1.5不需要配置静态资源的映射,但是springboot2.0以后需要配置
        //第一个参数是设置请求前缀,第二个参数是设置资路径
        registry.addResourceHandler("/js/**").addResourceLocations("/WEB-INF/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/WEB-INF/css/");
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/images/");
        registry.addResourceHandler("/fonts/**").addResourceLocations("/WEB-INF/fonts/");

    }

    /**
     *
     * @Description:欢迎页-登录页面
     * @author gxr
     * @date 2021/6/11 5:07 下午
     * @param registry
     * @return void
     */
    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        //设置优先级
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }

    /**
     *
     * @Description:添加拦截器
     * @author gxr
     * @date 2021/6/14 12:30 下午
     * @param registry
     * @return void
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authorizeInterceptor).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
