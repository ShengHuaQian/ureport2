package com.lxx.config;

import com.bstek.ureport.console.UReportServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ureport必须的配置
 *
 * @author liaoxiaoxia
 * @version 1.0.0
 * @date 2019/7/9 16:00
 * @since JDK 1.8
 */
@Configuration
public class UreportConfig {

    @Bean
    public ServletRegistrationBean buildUReportServlet() {
        /**
         * @param  servlet
         * @param  urlMappings 值为“/ureport/*”的 urlMappings 是一定不能变的，否则系统将无法运行。
         */
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
    }
}
