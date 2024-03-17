package com.controller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.model.Gripinfo;

@Component
public class Modeldao {
	
	@Autowired
	private SessionFactory sf;
	
	@Transactional
	public void addAlien(Gripinfo g) {
		Session session = sf.getCurrentSession();
		session.save(g);
	}
	@Transactional
	public Gripinfo findgrip(int idGripinfo) {
		Session session = sf.getCurrentSession();
		Gripinfo g = session.get(Gripinfo.class, idGripinfo);
		return g;
		
	}
	
	
}
