package com.example.demo.uss.repository;

import java.util.List;

import com.example.demo.exh.domain.Exhbn;
import com.example.demo.rev.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.uss.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public void update(User user);
}
