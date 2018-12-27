package com.oauthjwt.api.controller;
import com.oauthjwt.api.domain.entity.AuthUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestApiController {
    @RequestMapping(value = "/authed/test", method = RequestMethod.GET)
    @ResponseBody
    public String authUser() {
       return "authed user";
    }
}