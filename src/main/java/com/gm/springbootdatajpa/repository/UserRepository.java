package com.gm.springbootdatajpa.repository;

import com.gm.springbootdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
