package com.example.bai8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// Đánh dấu đây là một Controller
// Nơi tiếp nhận các reqquest từ phía người dùng
@Controller
public class WebController {
    // đón nhận request Get
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
