package com.cts.training;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry serviceRegistry;
	private static SessionFactory sessionFactory;
	public static SessionFactory sessionFactory(){
		if(sessionFactory == null) {
			serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources mataMetadataSources = new MetadataSources(serviceRegistry);
			Metadata metadata = mataMetadataSources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
	}
}
