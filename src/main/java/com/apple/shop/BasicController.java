package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
//    @ResponseBody // 문자 그대로 보내주세요 라는 뜻
    String hello() {
//        return "<h4>반갑습니다.</h4>";
        return "index.html"; // 기본 경로가 static 폴더
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "피싱사이트에요";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "마이페이지입니다";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        String date = ZonedDateTime.now().toString();
        return date;
    }
}
