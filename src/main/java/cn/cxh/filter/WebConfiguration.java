package cn.cxh.filter; /*
 ClassName:cn.cxh.filter
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-24
 Time: 10:15
 */

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
    @Bean //注入方法
    public RemoteIpFilter remoteIpFilter(){
        return new RemoteIpFilter();
    }
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterReg=new FilterRegistrationBean();
        filterReg.setFilter(new MyFilter());
        filterReg.addUrlPatterns("/*");
        filterReg.addInitParameter("zs","1212初始化参数内容");
        filterReg.setName("MyFilter");//过滤器名称
        filterReg.setOrder(1);
        return  filterReg;


    }
}
