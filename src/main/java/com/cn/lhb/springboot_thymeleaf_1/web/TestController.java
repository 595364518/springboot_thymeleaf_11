package com.cn.lhb.springboot_thymeleaf_1.web;

import com.cn.lhb.springboot_thymeleaf_1.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Model m){
        String htmlContent = "<p style='color:aqua;'>海蓝色文字</p>";
        Product p = new Product(5,"紫枭",520);
        boolean flag = false;
        List<Product> ps = new ArrayList<>();
        ps.add(new Product(1,"product a", 50));
        ps.add(new Product(2,"product b", 100));
        ps.add(new Product(3,"product c", 150));
        ps.add(new Product(4,"product d", 200));
        ps.add(p);
        ps.add(new Product(6,"product f", 200));
        ps.add(new Product(7,"product g", 200));
        m.addAttribute("htmlContent",htmlContent);
        m.addAttribute("testBool",flag);
        m.addAttribute("ps",ps);
        m.addAttribute("p",p);
        return "test";
    }
}
