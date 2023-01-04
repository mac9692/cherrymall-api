package com.plateer.cherrymallapi.member.service.impl;

import com.plateer.cherrymallapi.member.mapper.MemberMapper;
import com.plateer.cherrymallapi.member.service.MemberService;
import com.plateer.cherrymallapi.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberMapper memberMapper;

    @Override
    public List<MemberVo> getMemberList() {
        return memberMapper.getMemberList();
    }
}
