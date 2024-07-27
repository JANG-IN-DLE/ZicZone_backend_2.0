package org.zerock.ziczone.mapper.application;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.ziczone.domain.application.Resume;

import java.util.List;

@Mapper
public interface ResumeMapper {
    List<Resume> findTop4ByOrderByResumeUpdateDesc();
}
