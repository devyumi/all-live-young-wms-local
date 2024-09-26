package com.all_live_young_wms_local.domain;

import lombok.*;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warehouse {
    private Long id;
    private Long warehouse_manager_id;
    private String name;
    private Address warehouseAddress;
    private String warehouseCode;
}
