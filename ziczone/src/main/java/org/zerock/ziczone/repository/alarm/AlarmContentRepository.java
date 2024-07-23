package org.zerock.ziczone.repository.alarm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ziczone.domain.alarm.AlarmContent;

public interface AlarmContentRepository extends JpaRepository<AlarmContent, Long> {
    AlarmContent findByAlarmContentId(Long alarmContentId);
}
