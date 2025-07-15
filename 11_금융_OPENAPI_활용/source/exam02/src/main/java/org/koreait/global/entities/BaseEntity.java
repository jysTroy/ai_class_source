package org.koreait.global.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Data
@MappedSuperclass // 공통 속성으로 사용될 상위 클래스임을 알려주는 애노테이션

// 엔티티 변화감지를 통해서 출력을 함(추가날짜, 수정날짜) -> 이벤트 발생
// 엔티티에 출력된 값은 이벤트리스너로 인해 출력
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

//    @CreationTimestamp
    @CreatedDate
    @Column(updatable = false) // 생성 일자는 최초 1번만 등록
    private LocalDateTime createdAt;

//    @UpdateTimestamp
    @LastModifiedDate
    @Column(insertable = false) // 수정일자는 최초에는 등록 X
    private LocalDateTime modifiedAt;
}
