package com.huatec.service.impl;

import com.huatec.domain.Role;
import com.huatec.mapper.RoleMapper;
import com.huatec.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;


    @Override
    public List<Role> roleList() {
        List<Role> roleList = roleMapper.roleList();
        return roleList;
    }

    //删除功能service
   @Override
    public void deleteRoleById(Long roleId) {

        //根据roleId删除关系表数据
        roleMapper.deleteFromUser_RoleByRoleId(roleId);

        //从sys_user中删除
       roleMapper.deleteRoleById(roleId);

       System.out.println(roleId);

    }
    @Override
    public void saveRole(Role role) {
        roleMapper.saveRole(role);
    }


}
