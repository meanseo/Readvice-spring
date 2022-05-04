package kr.readvice.api.repositories;

import kr.readvice.api.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    void put(User user);
    String login(User user);
}
