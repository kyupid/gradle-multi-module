package com.morazo.mobile.controller;

import com.morazo.core.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {

    @GetMapping
    @ResponseBody
    public Member member() {
        return new Member(1L, "kyu");
    }
}
