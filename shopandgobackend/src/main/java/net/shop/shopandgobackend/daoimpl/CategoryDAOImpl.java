package net.shop.shopandgobackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.shop.shopandgobackend.dao.CategoryDAO;
import net.shop.shopandgobackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{

	private static List<Category> categories = new ArrayList<Category>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setName("Television");
		category.setDescription("Description for television");
		category.setImageURL("1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Description for mobile");
		category.setImageURL("2.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Description for laptop");
		category.setImageURL("3.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> categoryList() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categoryList()) {
			if(category.getId() == id) 
				return category;
		}
		return null;
	}

}
