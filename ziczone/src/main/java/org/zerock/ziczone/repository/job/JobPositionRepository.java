package org.zerock.ziczone.repository.job;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ziczone.domain.job.JobPosition;
import org.zerock.ziczone.domain.member.PersonalUser;
import org.zerock.ziczone.dto.mypage.JobPositionDTO;

import java.util.Collection;
import java.util.List;

public interface JobPositionRepository extends JpaRepository<JobPosition, Long> {
    List<JobPosition> findByPersonalUserPersonalId(Long personalId);

    List<JobPosition> findByPersonalUser(PersonalUser personalUser);

    void deleteByPersonalUserPersonalId(Long personalUserId);
}
