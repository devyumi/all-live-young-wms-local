package com.all_live_young_wms_local.service;

import com.all_live_young_wms_local.mapper.AnnouncementMapper;
import com.all_live_young_wms_local.web.dto.AnnouncementDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnnouncementService {

    private final AnnouncementMapper announcementMapper;

    @Transactional(readOnly = true)
    public List<AnnouncementDTO> findAnnouncementByDate() {
        return announcementMapper.findAnnouncementByDate();
    }
}
