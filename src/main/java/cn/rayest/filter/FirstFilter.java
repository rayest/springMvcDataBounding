package cn.rayest.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Rayest on 2016/9/11 0011.
 */
public class FirstFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()...");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Start...doFilter");
        filterChain.doFilter(request, response);
        System.out.println("End...doFilter");
    }

    public void destroy() {
        System.out.println("destroy()...");
    }
}
