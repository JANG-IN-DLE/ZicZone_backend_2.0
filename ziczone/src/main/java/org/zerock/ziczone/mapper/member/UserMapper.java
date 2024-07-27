package org.zerock.ziczone.mapper.member;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.ziczone.domain.member.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
}
