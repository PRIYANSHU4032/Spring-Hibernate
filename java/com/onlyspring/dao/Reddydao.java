package com.onlyspring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.model.Alien;

@Component
public class Reddydao {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
    public List<Alien> getAlien() {
        Session session = sessionFactory.getCurrentSession();
        List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();
        return aliens;
    }
    
    
    @Transactional
    public void addAlien(Alien a) {
    	Session session = sessionFactory.getCurrentSession();
    	session.save(a);
    	
    }
    
    @Transactional
    public Alien getoneAlien(int aid) {
    	Session session = sessionFactory.getCurrentSession();
    	Alien a = session.get(Alien.class, aid);
    	
    	return a;
    	
    }
    
    
}
