package com.b2b.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.b2b.admin.bean.ProductBean;
import com.b2b.admin.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(path = "/fetchProdData", produces = "application/json")
	@ResponseBody
	public List<ProductBean> fetchProdData(HttpServletResponse response) throws JSONException {
		
		JSONObject orgJson = new JSONObject();
		
		try {
			return productService.fetchProdData();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

}
