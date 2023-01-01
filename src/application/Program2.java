package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao DpDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== test1: Department Insert ====");

		Department dp = new Department(8, "music");
		DpDao.insert(dp);
		System.out.println("Inserted new id = " + dp);

		System.out.println("\n=== test2: Department Update =====");

		Department dp2 = new Department(8, "Book");

		DpDao.update(dp2);

		System.out.println("\n=== test3: Department Delete =====");

		Department dp3 = new Department();
		DpDao.deleteById(8);

		System.out.println("\n=== test4: Department findById =====");

		Department dp4 = DpDao.findById(1);
		System.out.println(dp4);

		System.out.println("\n=== test5: Department findAll =====");

		Department dp5 = new Department();
		List<Department> list = DpDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		

		sc.close();

	}

}
