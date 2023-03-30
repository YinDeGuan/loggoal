package cn.com.vguan.spring.boot.loggoal.service;

import java.util.Optional;

import cn.com.vguan.spring.boot.loggoal.domain.Comment;



public interface CommentService {

	/**
     * 根据id获取 Comment
     * @param id
     * @return
     */
	Optional<Comment> getCommentById(Long id);
    /**
     * 删除评论
     * @param id
     * @return
     */
    void removeComment(Long id);
}
