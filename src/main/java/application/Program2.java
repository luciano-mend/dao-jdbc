package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("=== TEST1: department findById ===");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST2: department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST3: department insert ===");
		Department novoDepartment = new Department(null, "Qualidade");
		departmentDao.insert(novoDepartment);
		System.out.println("Inserido! Novo id: " + novoDepartment.getId());
		
		System.out.println("\n=== TEST4: department update ===");
		department = departmentDao.findById(5);
		department.setName("QA");
		departmentDao.update(department);
		System.out.println("Update concluído!");
		
		System.out.println("\n=== TEST5: department delete ===");
		System.out.println("Digite um código para exclusão: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Excluído com sucesso!");
		
		sc.close();
	}

}
