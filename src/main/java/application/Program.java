package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST1: seller findById ===");
		Seller seller = sellerDao.findById(3);		
		System.out.println(seller);
		
		System.out.println("\n=== TEST2: seller findByDepartment ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST4: seller insert ===");
		Seller novoSeller = new Seller(null, "Jose", "email2@email.com", new Date(), 4000.0, department);
		sellerDao.insert(novoSeller);
		System.out.println("Inserido! Novo id: " + novoSeller.getId());
		
		System.out.println("\n=== TEST5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Joana D'Arc");
		sellerDao.update(seller);
		System.out.println("Update comcluído!");
		
		System.out.println("\n=== TEST6: seller delete ===");
		System.out.println("Digite um código para exclusão: ");
		int id = sc.nextInt();
		sellerDao.delete(id);
		System.out.println("Excluído com sucesso!");
		
		sc.close();
	}

}
