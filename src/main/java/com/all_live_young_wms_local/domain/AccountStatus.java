package com.all_live_young_wms_local.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum AccountStatus {
    SUBSCRIPTION_REQUEST,
    ACTIVE,
    WITHDRAWAL_REQUEST,
    DEACTIVATED
}
