package com.intuit.timesheets.service;

import com.intuit.timesheets.dto.ProfileRequestDto;

/**
 * @author prajwal.kulkarni on 20/09/21
 */
public interface UserProfileService {

    boolean validateUpdate(ProfileRequestDto profileRequestDto);
}
