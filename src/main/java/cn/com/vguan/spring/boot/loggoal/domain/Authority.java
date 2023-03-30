package cn.com.vguan.spring.boot.loggoal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;


/**
 * @since 2023 ,  May 30 
 * @author <a href="https://vguan.com.cn">vguan</a> 
 */
@Entity
@Table(name="AuthorityDemonG4")

public class Authority implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Long id; // 用户的唯一标识

    @Column(nullable = false) // 映射为字段，值不能为空
    private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
