package org.zerock.ziczone.dto.mypage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zerock.ziczone.domain.application.Portfolio;
import org.zerock.ziczone.domain.application.Resume;

import javax.persistence.Column;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PortfolioDTO {
    private Long portId;
    private String portFileUrl;    // PDF 파일명 Url
    private String portFileUuid;    // PDF 파일명 UUID
    private String portFileName;    // PDF 파일명 FileName
    private Long resumeId; // Resume ID to link to Resume entity

    // DTO to Entity
    public Portfolio toEntity() {
        return Portfolio.builder()
                .portId(this.portId)
                .portFileUrl(this.portFileUrl)
                .portFileUuid(this.portFileUuid)
                .portFileName(this.portFileName)
                .resume(Resume.builder().resumeId(this.resumeId).build())
                .build();
    }

    // Entity to DTO
    public static PortfolioDTO fromEntity(Portfolio entity) {
        return PortfolioDTO.builder()
                .portId(entity.getPortId())
                .portFileUrl(entity.getPortFileUrl())
                .portFileUuid(entity.getPortFileUuid())
                .portFileName(entity.getPortFileName())
                .resumeId(entity.getResume() != null ? entity.getResume().getResumeId() : null)
                .build();
    }
}
