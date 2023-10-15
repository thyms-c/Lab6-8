// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ku.cs.kafe.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, UUID> {
    // SELECT * FROM Member WHERE username = 'username'
    Member findByUsername(String username);
}