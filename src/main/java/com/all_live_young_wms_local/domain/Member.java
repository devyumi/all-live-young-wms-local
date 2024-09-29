package com.all_live_young_wms_local.domain;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    private Long id;
    private String name;
    private String password;
    private String phoneNumber;
    private String email;
    private Address address;
    private AccountStatus accountStatus;
    private LocalDateTime joinDate;
    private LocalDateTime lastLoginDate;
    private RoleType roleType;
    private Warehouse warehouse;
    private boolean isAgree;
    private LocalDateTime agreeDate;
}
