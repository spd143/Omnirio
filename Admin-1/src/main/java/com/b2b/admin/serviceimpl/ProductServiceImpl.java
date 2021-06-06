package com.b2b.admin.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b2b.admin.bean.AttributeBean;
import com.b2b.admin.bean.ProductBean;
import com.b2b.admin.entity.ProdTab;
import com.b2b.admin.repo.ProductRepo;
import com.b2b.admin.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public List<ProductBean> fetchProdData() {
		
		List<ProductBean> prodLst = new ArrayList<>();

		List<ProdTab> prodTabLst = productRepo.findAll();

		if (!prodTabLst.isEmpty()) {
			
			prodTabLst.forEach(prodTab -> {
				ProductBean productBean = new ProductBean();

				productBean.setProdId(prodTab.getId());
				productBean.setProductId(prodTab.getProdId());
				productBean.setProductName(prodTab.getProdName());
				productBean.setCatId(prodTab.getCatId().toString());

				List<AttributeBean> attrLst = new ArrayList<>();

				prodTab.getAttributes().forEach(attr -> {

					AttributeBean attributeBean = new AttributeBean();

					attributeBean.setId(attr.getId());
					attributeBean.setName(attr.getName());
					attributeBean.setValue(attr.getValue());
					attributeBean.setProdId(attr.getProdTab2().getId());

					attrLst.add(attributeBean);

				});

				productBean.setAttributeBeanLst(attrLst);
				
				prodLst.add(productBean);
			});

			return prodLst;

		} else {
			return null;
		}

	}

}
