package MilliBilly.TurtleNeck.repository;

import MilliBilly.TurtleNeck.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByNickname(String nickname);
    List<Member> findAll();
}
