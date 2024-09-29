package com.all_live_young_wms_local.domain;

public enum AccountStatus {
    WAITING_APPROVAL,   // 승인 대기
    ACTIVATION,        // 활성
    WAITING_CANCEL,   // 탈퇴 대기
    INACTIVATION      // 비활성
}
