/**
 * 
 */
package cn.com.vguan.spring.boot.loggoal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.vguan.spring.boot.loggoal.domain.Authority;
import cn.com.vguan.spring.boot.loggoal.repository.AuthorityRepository;




@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Autowired
	private AuthorityRepository authorityRepository;

	@Override
	public Optional<Authority> getAuthorityById(Long id) {
		return authorityRepository.findById(id);
	}

}
