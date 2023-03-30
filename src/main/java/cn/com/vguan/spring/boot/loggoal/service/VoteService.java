package cn.com.vguan.spring.boot.loggoal.service;

import java.util.Optional;

import cn.com.vguan.spring.boot.loggoal.domain.Vote;



public interface VoteService {
	/**
	 * 根据id获取 Vote
	 * @param id
	 * @return
	 */
	Optional<Vote> getVoteById(Long id);
	/**
	 * 删除Vote
	 * @param id
	 * @return
	 */
	void removeVote(Long id);
}
