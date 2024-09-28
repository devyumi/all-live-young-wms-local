package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.domain.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
    Optional<Member> findByEmail(@Param("email") String email);

    Optional<Member> findByName(@Param("name") String name);

    List<Member> findAllByRoleType(@Param("roleType") String roleType);
}
