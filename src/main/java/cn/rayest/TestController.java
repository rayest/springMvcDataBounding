package cn.rayest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Rayest on 2016/9/10 0010.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping("/viewAll")
    public ModelAndView viewAll(String name, String password){
        ModelAndView modelAndView = new ModelAndView();
        System.out.println("进入了控制器的 viewAll() 方法...");
        System.out.println("name=" + name);
        System.out.println("password=" + password);
        modelAndView.setViewName("/hello1.jsp");
        return modelAndView;
    }
}
