package cn.com.vguan.spring.boot.loggoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.com.vguan.spring.boot.loggoal.domain.Vote;



public interface VoteRepository extends JpaRepository<Vote, Long> {
	
}
