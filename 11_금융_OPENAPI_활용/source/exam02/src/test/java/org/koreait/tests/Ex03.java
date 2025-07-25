package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Transactional
// 테스트 시에 실행할 때 데이터가 롤백되어서 DB에 남지 않음
@SpringBootTest
public class Ex03 {
    @PersistenceContext
    private EntityManager em;

    @Test
    void test1() throws Exception {
        Member member = new Member();
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);
        em.flush();
        em.clear();

        member = em.find(Member.class, 1L);
        // 최초 추가시
        System.out.printf("createdAt:%s, modifiedAt:%s%n", member.getCreatedAt(), member.getModifiedAt());
        Thread.sleep(5000);

        member.setName("(수정)사용자01");
        member.setCreatedAt(LocalDateTime.now());
        em.flush();
        em.clear();

        // 수정 후
        System.out.printf("createdAt:%s, modifiedAt:%s%n", member.getCreatedAt(), member.getModifiedAt());
        member = em.find(Member.class, 1L);
    }
}
