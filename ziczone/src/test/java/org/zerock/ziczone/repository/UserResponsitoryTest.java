package org.zerock.ziczone.repository;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.ziczone.mapper.member.UserMapper;

@SpringBootTest
@Transactional
@Log4j2
public class UserResponsitoryTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    void getAllUsers() {
        userMapper.getAllUsers();
    }
}
