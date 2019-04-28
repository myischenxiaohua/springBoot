package cn.cxh.filter; /*
 ClassName:cn.cxh.filter
 Description:
 User: myischenxiaohua@163.com
 Date: 2019-04-24
 Time: 10:09
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
               System.out.println("初始化参数内容："+filterConfig.getInitParameter("zs"));
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        request.setCharacterEncoding("UTF-8");
        System.out.println("请求的url"+request.getRequestURL());
        //干过滤的事情
        filterChain.doFilter(servletRequest,servletResponse);

    }

    @Override
    public void destroy() {

    }
}
