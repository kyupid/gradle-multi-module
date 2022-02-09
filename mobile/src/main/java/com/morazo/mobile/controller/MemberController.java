package com.morazo.mobile.controller;

import com.morazo.core.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @GetMapping
    @ResponseBody
    public Member member() {
        return new Member(1L, "kyu");
    }

    @GetMapping("/hello-modules")
    public String thymeleaf(Model model) {
        model.addAttribute("member", new Member(1L, "kyu"));
        return "member";
    }
}
