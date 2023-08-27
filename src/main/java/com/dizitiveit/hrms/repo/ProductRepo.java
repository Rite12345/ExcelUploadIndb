package com.dizitiveit.hrms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dizitiveit.hrms.entuty.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}
