package cn.com.vguan.spring.boot.loggoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.com.vguan.spring.boot.loggoal.domain.Comment;



public interface CommentRepository extends JpaRepository<Comment, Long> {

}
