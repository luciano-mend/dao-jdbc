package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

//		Department obj = new Department(1, "Books");
//		
//		Seller seller = new Seller(29, "Maria", "email@email.com", new Date(), 2500.0, obj);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
