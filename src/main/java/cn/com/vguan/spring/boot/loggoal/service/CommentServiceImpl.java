package cn.com.vguan.spring.boot.loggoal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.vguan.spring.boot.loggoal.domain.Comment;
import cn.com.vguan.spring.boot.loggoal.repository.CommentRepository;



@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;
    
	@Override
	public Optional<Comment> getCommentById(Long id) {
		return commentRepository.findById(id);
	}

	@Override
	public void removeComment(Long id) {
		commentRepository.deleteById(id);
	}

}
