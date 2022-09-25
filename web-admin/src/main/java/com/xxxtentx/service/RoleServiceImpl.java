package com.xxxtentx.service;

import com.xxxtentx.dao.RoleDao;
import com.xxxtentx.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xxxtentx
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    @Resource
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }
}
