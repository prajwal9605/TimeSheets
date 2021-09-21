package com.intuit.timesheets.controller;

import com.intuit.timesheets.dto.ProfileRequestDto;
import com.intuit.timesheets.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author prajwal.kulkarni on 20/09/21
 */

@RestController
@RequestMapping(value = "/user")
public class UserProfileController {

    @Autowired
    UserProfileService userProfileService;

    @RequestMapping(value = "/profile", method = RequestMethod.POST, produces = "application/json")
    public Boolean createProfile(@RequestBody @Valid ProfileRequestDto profileRequestDto) {
        return userProfileService.validateUpdate(profileRequestDto);
    }
}
