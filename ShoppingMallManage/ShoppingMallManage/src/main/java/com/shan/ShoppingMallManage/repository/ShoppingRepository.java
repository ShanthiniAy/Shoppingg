package com.shan.ShoppingMallManage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shan.ShoppingMallManage.entity.ShopOwner;


public interface ShoppingRepository extends JpaRepository<ShopOwner,Integer> {

	@SuppressWarnings("unchecked")
	ShopOwner save(ShopOwner s);
	

}
