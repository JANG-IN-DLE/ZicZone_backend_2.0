package org.zerock.ziczone.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zerock.ziczone.domain.PickAndScrap;

import java.util.List;

@Mapper
public interface PickAndScrapMapper {
    List<PickAndScrap> findByPersonalUser(Long personalId);
}
