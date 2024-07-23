package org.zerock.ziczone.domain.member;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Builder(toBuilder = true) // toBuilder 속성 추가
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;         // id

    @Column(length = 100, nullable = false)
    private String companyNum;      // 기업 사업자 등록번호

    @Column(length = 100, nullable = false)
    private String companyAddr;     // 기업 주소

    @Column(nullable = false)
    private LocalDate companyYear;  // 기업 설립연도

    @Column(columnDefinition = "TEXT", nullable = true)
    private String companyLogoUrl;     // 기업 로고 이미지 경로 URL (스토리지)
    @Column(columnDefinition = "TEXT")
    private String companyLogoUuid;     // 기업 로고 이미지 경로 UUID (스토리지)
    @Column(columnDefinition = "TEXT")
    private String companyLogoFileName;     // 기업 로고 이미지 경로 FileName (스토리지)



    @Column(nullable = false)
    private String companyCeo;      // 대표 이름

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;              // 유저 테이블

}