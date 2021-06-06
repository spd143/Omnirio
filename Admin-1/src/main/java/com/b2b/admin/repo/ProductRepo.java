package com.b2b.admin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.b2b.admin.entity.ProdTab;

@Repository
public interface ProductRepo extends JpaRepository<ProdTab, Long> {

	List<ProdTab> findByProdId(String prodId);
	
	
}
