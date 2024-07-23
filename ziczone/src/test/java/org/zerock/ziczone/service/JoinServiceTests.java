package org.zerock.ziczone.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.ziczone.domain.member.Gender;
import org.zerock.ziczone.domain.member.UserType;
import org.zerock.ziczone.dto.join.CompanyUserJoinDTO;
import org.zerock.ziczone.dto.join.PersonalUserJoinDTO;
import org.zerock.ziczone.service.join.JoinServiceImpl;

import java.time.LocalDate;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Log4j2
public class JoinServiceTests {
    @Autowired
    private JoinServiceImpl joinService;

    //개인회원가입 테스트
    @Test
    public void testPersonalJoin() {
        PersonalUserJoinDTO personalUserJoinDTO = PersonalUserJoinDTO.builder()
                .userName("testUser")
                .email("test11@example.com")
                .password("password")
                .userIntro("intro")
                .userType(UserType.PERSONAL)
                .personalCareer("career")
                .gender(Gender.MALE)
                .jobIds(Arrays.asList(2L, 3L))
                .techIds(Arrays.asList(1L, 2L))
                .build();

        String result = joinService.personalSignUp(personalUserJoinDTO);
        assertEquals("signUp success", result);

        log.info("개인 회원 가입 결과: " + result);
    }

    //개인회원가입 테스트
    @Test
    public void testCompanyJoin() {
        CompanyUserJoinDTO companyUserJoinDTO = CompanyUserJoinDTO.builder()
                .userName("CompanytestUser")
                .email("CompanytestUser1@example.com")
                .password("password1")
                .userIntro("intro1")
                .userType(UserType.COMPANY)
                .companyAddr("companyAddr")
                .companyCeo("companyCeo")
                .companyLogo("https://kr.object.ncloudstorage.com/ziczone-bucket/CompanyLogo/%ED%86%A0%EC%8A%A4%EB%B1%85%ED%81%AC")
                .companyNum("companyNum")
                .companyYear(LocalDate.now().toString())
                .build();

//        String result = joinService.companyJoin(companyUserJoinDTO);
//        assertEquals("signUp success", result);

//        log.info("기업 회원 가입 결과: " + result);
    }
}