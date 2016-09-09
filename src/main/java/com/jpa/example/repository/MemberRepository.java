package com.jpa.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.example.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	Member findByName(String name);
}
