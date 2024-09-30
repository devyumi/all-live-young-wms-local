package com.all_live_young_wms_local.mapper;

import com.all_live_young_wms_local.web.dto.AnnouncementDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AnnouncementMapper {

    List<AnnouncementDTO> findAnnouncementByDate();
}
