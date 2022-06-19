package com.life.school.our.server.application.members.repository;

import com.life.school.our.server.application.members.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
    Optional<Members> findByUserNumber(final int userNumber);
}
