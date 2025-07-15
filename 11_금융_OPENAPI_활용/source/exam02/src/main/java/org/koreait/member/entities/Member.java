package org.koreait.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.constants.Authority;

@Entity
@Data
//@Table(name="kit_member",
//        indexes = {
//        @Index(name="idx_member_created_at", columnList = "createdAt DESC"),
//        @Index(name="uq_member_email_name", columnList = "email, name", unique = true) // 이 두 가지를 유니크 제약조건으로 조합, 1개만 할 땐 굳이..?
//})
public class Member extends BaseEntity {
    // use jakarta
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long seq;

//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    // 링크로 비밀번호 초기화할 때 유효기간을 가진 토큰을 심어서 UUID 활용 가능성 있음
//    private String seq;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(unique = true, nullable = false, length = 80)
    // 유니크 제약조건, 낫널 제약조건 같이 사용
    private String email;

    @Column(name="passwd", nullable = false, length = 65)
    private String password;

    @Column(nullable = false, length = 45)
    private String name;

    // Large Object 약어
    @Lob
    private String introduction;

    // ODINAL 사용시 순서번호 대로 기록되지만 섞이면 문제가 생김(구분불가)
    // 기본값 ODINAL이기에 대체제로 STRING 사용
    @Enumerated(EnumType.STRING)
    private Authority authority;

    @Transient // 엔티티로 관리되는 필드 X, 엔티티 클래스 내부에서만 사용할 목적
    private String profileImage;

//    @Temporal(TemporalType.DATE)
//    private Date modifiedAt;
}
