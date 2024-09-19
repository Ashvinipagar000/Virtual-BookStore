package com.tka.Dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Book;

import jakarta.persistence.criteria.CriteriaQuery;

@Repository
public class BookDao {
	@Autowired
	SessionFactory sessionFactory;

	public List<Book>fetchAllbooks(){
		Session session=sessionFactory.openSession();
		CriteriaQuery cv=session.
		
		
	}

}
