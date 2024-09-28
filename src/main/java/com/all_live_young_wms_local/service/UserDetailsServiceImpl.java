package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.domain.Member;
import com.all_live_young_wms_local.mapper.MemberMapper;
import com.all_live_young_wms_local.web.dto.UserDetailsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return memberMapper.findByEmail(username)
                .map(this::createUserDetails)
                .orElseThrow(() -> new UsernameNotFoundException("사용자를 찾을 수 없습니다."));
    }

    private UserDetailsDTO createUserDetails(Member member) {
        return UserDetailsDTO.builder()
                .member(member)
                .build();
    }
}
