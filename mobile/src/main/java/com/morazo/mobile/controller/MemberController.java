package com.morazo.mobile.controller;

import com.morazo.core.entity.Member;
import com.morazo.core.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

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

    @PostMapping("/save")
    public ResponseEntity<String> saveMember(@RequestBody Member member) {
        memberService.save(member);
        return ResponseEntity.ok("success");
    }
}
