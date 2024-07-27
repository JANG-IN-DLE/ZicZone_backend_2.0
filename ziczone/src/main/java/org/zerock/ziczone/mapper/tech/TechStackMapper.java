package org.zerock.ziczone.mapper.tech;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.ziczone.domain.tech.TechStack;

import java.util.List;

@Mapper
public interface TechStackMapper {
    List<TechStack> findByPersonalUserPersonalId(Long personalId);
}
