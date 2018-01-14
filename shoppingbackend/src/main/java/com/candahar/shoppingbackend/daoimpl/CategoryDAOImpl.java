package com.candahar.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.candahar.shoppingbackend.dao.CategoryDAO;
import com.candahar.shoppingbackend.dto.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		//first category
		Category category = new Category();
		category.setId(1);
		category.setName("Gadget");
		category.setDescription("All about gadget");
		category.setImageURL("http://localhost/images/iphone-x.png");
		category.setActive(true);
		categories.add(category);
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Television");
		category.setDescription("All about television");
		category.setImageURL("http://localhost/images/sharp.png");
		category.setActive(true);
		categories.add(category);
		
		//third category
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("All about laptop");
		category.setImageURL("http://localhost/images/asus.png");
		category.setActive(true);
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		for(Category category : categories){
			if(category.getId() == id){
				return category;
			}
		}
		return null;
	}

}
