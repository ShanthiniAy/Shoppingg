package com.shan.ShoppingMallManage.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.shan.ShoppingMallManage.entity.ShopOwner;
import com.shan.ShoppingMallManage.repository.ShoppingRepository;

@RestController
public class ShoppingController {
	
		@Autowired
		ShoppingRepository repo;
	
		@PostMapping("/shop")
		public ShopOwner addShop(@RequestBody ShopOwner s){
			
			
			return repo.save(s);

		}
		
		
		
		@GetMapping("/shop")
		public List<ShopOwner> getShops(){
			
			return repo.findAll();
		}
		
		@GetMapping("/shop/{id}")
		public ShopOwner getShopById(@PathVariable Integer id) {
			
			return repo.findById(id).get();
		}
		
		@DeleteMapping("/shop/{id}")
		public void deleteShop(@PathVariable Integer id ) {
			
			repo.deleteById(id);
		}
		
		@PutMapping("/shop/{id}")
		public ShopOwner updateShop(@PathVariable Integer id,@RequestBody ShopOwner s) {
			
			s.setId(id);
			return repo.save(s);
		}
}



