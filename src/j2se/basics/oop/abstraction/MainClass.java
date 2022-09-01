package j2se.basics.oop.abstraction;

public class MainClass {

	public static void main(String[] args) {
		//product
		ProductDao pDao = new ProductDao();
		pDao.connect();
		pDao.save(new Product());
		pDao.disconnect();
		
		//Category
		CategoryDao cDao = new CategoryDao();
		cDao.connect();
		cDao.save(new Category());
		cDao.disconnect();
	}

}

