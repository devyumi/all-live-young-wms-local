package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    Optional<Member> findByEmail(String email);

    Optional<Member> findByName(String name);

    List<Member> findAllByRoleType(String roleType);
}
