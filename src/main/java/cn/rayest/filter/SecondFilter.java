package cn.rayest.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Rayest on 2016/9/11 0011.
 */
public class SecondFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init()...SecondFilter");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Start...doFilter...SecondFilter");
        filterChain.doFilter(request, response);
        System.out.println("End...doFilter...SecondFilter");
    }

    public void destroy() {
        System.out.println("destroy()...SecondFilter");
    }
}
