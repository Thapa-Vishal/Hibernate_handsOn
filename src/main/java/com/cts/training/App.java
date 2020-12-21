package com.cts.training;


import java.time.LocalDate;

import org.hibernate.Session;

import com.cts.training.entity.Countries;
import com.cts.training.entity.Departments;
import com.cts.training.entity.Employees;
import com.cts.training.entity.JobHistory;
import com.cts.training.entity.Jobs;
import com.cts.training.entity.Locations;
import com.cts.training.entity.Regions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	oneToManyOrOneToOne();
    	
    }

	private static void oneToManyOrOneToOne() {
		Regions region = new Regions("Asia");
		Regions region1 = new Regions("North America");
		
    	Countries countries = new Countries("India",region);
    	Countries countries1 = new Countries("America",region1);
    	Countries countries2 = new Countries("Japan",region);

    	Locations location1 = new Locations("Third Street",(Integer)765892,"New Delhi","Noada",countries);
    	Locations location2 = new Locations("Fourth Street",(Integer)765200,"Chennai","Potheri",countries);
    	Locations location3 = new Locations("Third Street",(Integer)509245,"New Jersi","NY",countries1);
    	Locations location4 = new Locations("Fourth Street",(Integer)123564,"Nagoya","Nagoya",countries2);
    	
    	Departments department1 = new  Departments("CDE",(Integer)24578,location1);
    	Departments department2 = new  Departments("Testing",(Integer)85545,location4);
    	
    	Jobs job1 =new Jobs("Manager",(Integer)100000,(Integer)200000);
    	Jobs job2 =new Jobs("Trainee",(Integer)50000,(Integer)75000);
    	
    	JobHistory history1 = new JobHistory(LocalDate.of(2018, 03, 21),LocalDate.of(2019, 03, 21),job1,department1);
    	JobHistory history2 = new JobHistory(LocalDate.of(2019, 03, 21),LocalDate.of(2020, 04, 30),job2,department2);
    	
    	Employees employee1 = new Employees("Vivek","Kumar","vivek@gmail.com","6987412360",LocalDate.of(2018, 03, 15),job1,(Integer)150000,(Integer)15000,(Integer)24578,department1);
    	Employees employee2 = new Employees("Hitesh","Kumar","hitesh@gmail.com","9876543210",LocalDate.of(2019, 03, 15),job2,(Integer)60000,(Integer)5000,(Integer)85545,department2);
    	
    	history1.setEmployees(employee1);
    	history2.setEmployees(employee2);
    	
    	try(Session session=HibernateUtil.sessionFactory().openSession()){
    		session.getTransaction().begin();
    		session.persist(region);
    		session.persist(region1);
    		
    		session.persist(countries);
    		session.persist(countries1);
    		session.persist(countries2);
    		
    		session.persist(location1);
    		session.persist(location2);
    		session.persist(location3);
    		session.persist(location4);
    		
    		session.persist(department1);
    		session.persist(department2);
    		
    		session.persist(job1);
    		session.persist(job2);
    		
    		session.persist(employee1);
    		session.persist(employee2);
    		
    		session.persist(history1);
    		session.persist(history2);
    		

    		session.getTransaction().commit();
    		session.close();
    	}
		
	}
}
