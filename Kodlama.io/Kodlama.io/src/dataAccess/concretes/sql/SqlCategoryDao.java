package dataAccess.concretes.sql;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CategoryDao;
import entities.concretes.Category;

public class SqlCategoryDao implements CategoryDao{

	List <Category> categories;

	public SqlCategoryDao(List<Category> categories) {
		this.categories = new ArrayList<Category>();
	}

	@Override
	public List<Category> getAll() {
		return this.categories;
	}

	@Override
	public void add(Category entity) {
		this.categories.add(entity);
	}

	@Override
	public void update(Category entity) {
		System.out.println("Category has been updated!");
		
	}

	@Override
	public void delete(Category entity) {
		this.categories.remove(entity);
		
	}

}
