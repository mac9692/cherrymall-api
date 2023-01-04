package com.plateer.cherrymallapi.member.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVo {
    private Long memberId;
    private String memberName;
    private String memberAddress;
    private String phoneNumber;
}
