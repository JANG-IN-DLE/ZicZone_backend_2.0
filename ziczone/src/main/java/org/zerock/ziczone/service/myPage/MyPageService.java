package org.zerock.ziczone.service.myPage;

import org.springframework.web.multipart.MultipartFile;
import org.zerock.ziczone.dto.help.CommentDTO;
import org.zerock.ziczone.dto.mypage.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public interface MyPageService {

    // 기업유저 정보 조회
    CompanyUserDTO getCompanyUserDTO(Long userId);
    // 기업유저 정보 업데이트
    String updateCompanyUser(Long userId,Map<String, Object>  payload, MultipartFile LogoFile);
    // Pick 탭 리스트 조회 (기업 회원)
    List<PersonalUserDTO> getPicksByCompanyUsers(Long userId);
    // Scrap 탭 리스트 조회 (기업 회원)
    List<PersonalUserDTO> getScrapByCompanyUsers(Long userId);

    // 유저 비밀번호 확인
    Map<String, Object> PasswordCheck(Long userId, Map<String, Object> json);

    // 개인유저 정보 조회
    PersonalUserDTO getPersonalUserDTO(Long userId);
    // 개인정보 업데이트
    String updatePersonalUser(Long userId, PersonalUserUpdateDTO personalUserUpdateDTO);
    // 구매한 이력서 목록 조회
    AggregatedDataDTO getAggregatedData(Long userId);
    // Pick 탭 리스트 조회 (개인 회원)
    List<CompanyUserDTO> getPicksByPersonalUsers(Long userId);
    // (커스텀 DTO) 내가 쓴 댓글 조회
    List<MyCommentListDTO> MyCommList(Long userId);


    //company존 기업리스트
    List<CompanyUserDTO> getCompanyUserList();

}
