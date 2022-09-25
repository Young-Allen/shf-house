package com.xxxtentx.controller;

import com.xxxtentx.entity.Role;
import com.xxxtentx.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    /**
     * 列表
     *
     * @param model
     * @return
     */
    @RequestMapping
    public String index(ModelMap model) {
        List<Role> list = roleService.findAll();

        model.addAttribute("list", list);
        return "role/index";
    }
}
