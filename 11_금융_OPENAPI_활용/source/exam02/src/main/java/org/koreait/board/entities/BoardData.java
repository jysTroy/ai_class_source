package org.koreait.board.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.entities.Member;

import java.util.List;

@Entity
@Data
@Table(indexes = @Index(name="idx_board_data_created_at", columnList = "createdAt DESC"))
public class BoardData extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mSeq")
    private Member member;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @Column(nullable = false, length = 45)
    private String poster;

    @ManyToMany
    private List<HashTag> tags;
}
