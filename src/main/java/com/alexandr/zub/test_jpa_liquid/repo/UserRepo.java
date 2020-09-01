package com.alexandr.zub.test_jpa_liquid.repo;

import com.alexandr.zub.test_jpa_liquid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User getUserByUserName(String userName);
}
