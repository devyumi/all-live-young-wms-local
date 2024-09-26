package com.all_live_young_wms_local.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum RoleType {
    ADMIN,
    WAREHOUSE_MANAGER,
    COMPANY,
    DELIVERY
}
