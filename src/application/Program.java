package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sell = DaoFactory.createSellerDao();
		
		Seller seller = sell.findById(3);
		
		System.out.println(seller);
	}

}
