package com.all_live_young_wms_local.domain;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sales {
    private Long id;
    private Warehouse warehouse;
    private LocalDate salesDate;
    private String category;
    private Member member;

    @NumberFormat(pattern = "#,###원")
    private Integer amount;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime regDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime modDate;
}
