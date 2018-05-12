package net.shop.shopandgobackend.dao;

import java.util.List;

import net.shop.shopandgobackend.dto.Category;

public interface CategoryDAO {

	List<Category> categoryList();
	Category get(int id);
	
}
