package com.dizitiveit.hrms.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dizitiveit.hrms.entuty.Product;
import com.dizitiveit.hrms.helper.Helper;
import com.dizitiveit.hrms.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
	
	public void save(MultipartFile file) throws IOException
	{
		
			List<Product> products = Helper.convertExcelToListOfProduct(file.getInputStream());
			List<Product> saveAll = this.productRepo.saveAll(products);
			System.out.println(saveAll);
		
	}
	public List<Product> getAllProducts()
	{
		return this.productRepo.findAll();
		
	}

}
