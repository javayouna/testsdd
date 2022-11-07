package com.eoe.jds.controller;

import com.eoe.jds.entity.SiteUser;
import com.eoe.jds.persistent.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class AdminController {

    private final UserRepository userRepository;

    @GetMapping("/admin")
    public String list(Model model) {
        List<SiteUser> siteUserList = this.userRepository.findAll();
        model.addAttribute("siteUserList",siteUserList);
        return "admin/admin";
    }
}
