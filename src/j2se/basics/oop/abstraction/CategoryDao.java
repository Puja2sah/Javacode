package j2se.basics.oop.abstraction;

import java.util.ArrayList;

public class CategoryDao extends AbstractDao <Category>{ 
	@Override
	public int save(Category t) {
		System.out.println("Category added to the database!");
		return 0;
	}

	@Override
	public Category getOne(int id) {
		System.out.println("The Category is a pen!");
		return null;
	}

	@Override
	public ArrayList<Category> getAll() {
		System.out.println("ead from All the Category from the databse!");
		return null;
	}

	@Override
	public int update(Category t) {
		System.out.println("Category updated in the database!");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("Category deleted in the database!");
		
		return 0;
	}

}



