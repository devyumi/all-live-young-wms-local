package com.all_live_young_wms_local.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Warehouse {
    private Long id;
    private String name;
    private String code;
    private Address warehouseAddress;
}
