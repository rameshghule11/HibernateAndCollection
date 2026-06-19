package com.vmt.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	public static SessionFactory getConfiguration() {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		 SessionFactory sf=cfg.buildSessionFactory();
		
		 return sf;
	}

 
}
