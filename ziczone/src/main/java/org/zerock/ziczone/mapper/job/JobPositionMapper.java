package org.zerock.ziczone.mapper.job;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.ziczone.domain.job.JobPosition;

import java.util.List;

@Mapper
public interface JobPositionMapper {
    List<JobPosition> findByPersonalUserPersonalId(Long personalId);
}
