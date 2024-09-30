package com.all_live_young_wms_local.web.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnnouncementDTO {

    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime date;

    private String title;
}
