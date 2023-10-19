package com.example.bai8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng
@Controller
public class WebController {
    // đón nhận request Get
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/about")
    public String myabout(){
        return "about";

    }
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false,defaultValue = "") String name, Model model){
        model.addAttribute("name",name);

        return  "hello";
    }

}
