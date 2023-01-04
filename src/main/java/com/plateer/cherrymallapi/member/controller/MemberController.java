package com.plateer.cherrymallapi.member.controller;

import com.plateer.cherrymallapi.member.service.MemberService;
import com.plateer.cherrymallapi.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("memberList")
    public List<MemberVo> getMemberList() {
        return memberService.getMemberList();
    }
}
