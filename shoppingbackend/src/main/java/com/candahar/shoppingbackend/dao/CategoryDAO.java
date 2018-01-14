package com.candahar.shoppingbackend.dao;

import java.util.List;

import com.candahar.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
}
