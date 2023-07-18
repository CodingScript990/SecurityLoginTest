package com.dayhappi.securityapi.repo;

import com.dayhappi.securityapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
