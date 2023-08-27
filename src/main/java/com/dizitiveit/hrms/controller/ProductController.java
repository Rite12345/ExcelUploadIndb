package com.dizitiveit.hrms.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.dizitiveit.hrms.entuty.Product;
import com.dizitiveit.hrms.helper.Helper;
import com.dizitiveit.hrms.service.ProductService;

@RestController
//@CrossOrigin("*")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) throws IOException
    {
		//System.out.println(file);
		if(Helper.checkExcelFormate(file))
		{
			this.productService.save(file);
			
		   return ResponseEntity.ok(Map.of("message","file uploaded in db"));
				   
			
			
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload only excel file");
		
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return productService.getAllProducts();
	}

}
