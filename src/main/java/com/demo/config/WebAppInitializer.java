package com.demo.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author zhaolei
 * Create: 2019/9/4 17:10
 * Modified By:
 * Description: 配置DispatcherServlet
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /*指定应用后端的中间层和数据层组件*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    /*指定Web配置类*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /*把DispatcherServlet映射到 "/" */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
