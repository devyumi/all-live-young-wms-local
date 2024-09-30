package com.all_live_young_wms_local.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.NumberFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Section {
    private Long id;
    private String storeTemperature; //StoreTemperature
    private String productType; //ProductType
    private String sectionCode;

    private Warehouse warehouse;
    @NumberFormat(pattern = "#,###")
    private Integer sectionCapacity;
}
