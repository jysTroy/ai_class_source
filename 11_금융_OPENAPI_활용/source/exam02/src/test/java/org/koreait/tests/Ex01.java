package org.koreait.tests;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.Test;
import org.koreait.member.entities.Member;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

// to use EntityManager need to Transactional
@Transactional
@SpringBootTest
public class Ex01 {

    @PersistenceContext
    private EntityManager em;

//    @BeforeEach
//    void init() {
//        em.getTransaction().begin();
//    }
//    @AfterEach
//    void after() {
//        em.getTransaction().commit();
//    }

    @Test
    void test1() {
        Member member = new Member();
//        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태로 만들기, 엔티티의 변화감지를 할 수 있도록 만든 것, 영속 상태에서 데이터베이스에 저장되지 않으며, 트랜잭션 커밋 시점에 데이터베이스에 반영
        em.flush(); // 변화 상태를 DB에 영구 반영

        member.setName("(수정)사용자01"); // update
        em.flush(); // update

        em.remove(member); // 삭제 x, 제거 상태로 영속 상태를 변경
        em.flush();
    }

    @Test
    void test2() {
        Member member = new Member();
//        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setName("user01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member); // 영속 상태로 만들기, 엔티티의 변화감지를 할 수 있도록 만든 것, 영속 상태에서 데이터베이스에 저장되지 않으며, 트랜잭션 커밋 시점에 데이터베이스에 반영
        em.flush(); // 변화 상태를 DB에 영구 반영

        em.detach(member); // 영속성 분리, 변화감지 x

        member.setName("(수정)사용자01"); // update
        em.flush(); // update

        member.setPassword("(수정)12345678");
//        em.flush();

        // 분리된 엔티티의 차이점을 비교하기 위해서 SELECT 쿼리가 한 번 실행
        em.merge(member); // 분리된 영속성 상태 -> 다시 영속 상태 변경(변화 감지)

        em.flush();
    }
}
