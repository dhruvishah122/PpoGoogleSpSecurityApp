package com.ppo.google.ppoGoogleSpSecurity.repo;

import com.ppo.google.ppoGoogleSpSecurity.model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
}
