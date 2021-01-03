package com.smbms.mapper;

import com.smbms.pojo.SmbmsRole;
import com.smbms.pojo.SmbmsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    Integer getUserCount(@Param("queryname") String queryname,
                         @Param("queryUserRole") Integer queryUserRole);

    List<SmbmsUser> findUserPage(@Param("startIndex") int startIndex,
                                 @Param("pageSize") Integer pageSize,
                                 @Param("queryname") String queryname,
                                 @Param("queryUserRole") Integer queryUserRole);

    List<SmbmsRole> findRoleList();

    int addUserSave(SmbmsUser user);

    SmbmsUser findUserByUserCode(String userCode);

    SmbmsUser findUserById(Integer id);

    int modifyPasswordByid(@Param("newpassword") String newpassword, @Param("id") long id);

    int deleteUserById(Integer uid);
}
