package cn.com.vguan.spring.boot.loggoal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.vguan.spring.boot.loggoal.domain.Catalog;
import cn.com.vguan.spring.boot.loggoal.domain.User;
import cn.com.vguan.spring.boot.loggoal.repository.CatalogRepository;



@Service
public class CatalogServiceImpl implements CatalogService {
	@Autowired
	private CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {
		 // 判断重复
        List<Catalog> list = catalogRepository.findByUserAndName(catalog.getUser(),
        		catalog.getName());
        if(list !=null && list.size() > 0) {
            throw new IllegalArgumentException("该分类已经存在了");
        }
        return catalogRepository.save(catalog);
	}
	
	@Override
	public void removeCatalog(Long id) {
		catalogRepository.deleteById(id);
	}

	@Override
	public Optional<Catalog> getCatalogById(Long id) {
		return catalogRepository.findById(id);
	}

	@Override
	public List<Catalog> listCatalogs(User user) {
		return catalogRepository.findByUser(user);
	}

}
