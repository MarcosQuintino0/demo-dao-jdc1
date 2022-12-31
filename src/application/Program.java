package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== test1: seller findById ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== test2: seller findByDepartment ====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== test3: seller findAll ====");
		
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== test4: seller Insert ====");
		
		Seller seller2 = new Seller(null,"Greg","greg@gmail", new Date(),4000.0,department);
		sellerDao.insert(seller2);
		System.out.println("Inserted new id = "+seller2);
		
		System.out.println("\n=== test5: seller Update ====");
		
		seller = sellerDao.findById(1);
		seller.setName("Marta wayne");
		sellerDao.update(seller);
		
	}

}
