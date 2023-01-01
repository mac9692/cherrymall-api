package com.plateer.cherrymallapi.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @GetMapping("memberList")
    public String getMemberList() {
        System.out.println("MemberController.getMemberList");
        return "Member";
    }
}
