package com.all_live_young_wms_local.domain;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseManager {
    private Member member;
    private Warehouse warehouse;
}
