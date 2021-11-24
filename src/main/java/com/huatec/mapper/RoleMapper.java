package com.huatec.mapper;

import com.huatec.domain.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface RoleMapper {

    List<Role> findRoleByUserId(Long userId);

    List<Role> roleList();

    void saveRole(Role role);
    void deleteRoleById(Long roleId);
    void deleteFromUser_RoleByRoleId(Long roleId);
}
