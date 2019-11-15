package com.ipiecoles.java.java230;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ipiecoles.java.java230.model.Employe;
import com.ipiecoles.java.java230.repository.EmployeRepository;

@Component
public class MyRunner implements CommandLineRunner {
	
	@Autowired
	private EmployeRepository employeRepo;

    @Override
    public void run(String... strings) throws Exception {

    	/*System.out.println("Nombre d' employé : " + employeRepo.count());
    	Employe emp = employeRepo.findOne(5L);
    	
    	print(emp.toString());*/
    }

    public static void print(Object t) {
        System.out.println(t);
    }
}
