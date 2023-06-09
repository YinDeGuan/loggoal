package cn.com.vguan.spring.boot.loggoal.service;

import java.util.Optional;

import cn.com.vguan.spring.boot.loggoal.domain.Authority;



public interface AuthorityService {
	/**
	 * 根据ID查询 Authority
	 * @param id
	 * @return
	 */
	Optional<Authority> getAuthorityById(Long id);
}
