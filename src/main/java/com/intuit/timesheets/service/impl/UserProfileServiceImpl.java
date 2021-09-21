package com.intuit.timesheets.service.impl;

import com.intuit.timesheets.dto.ProfileRequestDto;
import com.intuit.timesheets.service.UserProfileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author prajwal.kulkarni on 20/09/21
 */

@Slf4j
@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Override
    public boolean validateUpdate(ProfileRequestDto profileRequestDto) {
        log.info("Update request received!");
        return true;
    }
}
