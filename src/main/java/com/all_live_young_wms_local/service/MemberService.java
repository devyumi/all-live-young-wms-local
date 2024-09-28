package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.domain.Member;
import com.all_live_young_wms_local.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberMapper memberMapper;

    @Transactional(readOnly = true)
    public List<Member> getCompanies() {
        return memberMapper.findAllByRoleType("COMPANY");
    }
}
