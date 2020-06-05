package com.telusko.tusk.dao;

import java.util.List;


import javax.transaction.Transactional;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.tusk.entity.Feedback;

@Component
public class FeedbackDao 
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void  addFeedback(Feedback fb)
	{
		System.out.println("In addFeedback" +fb);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(fb);
	}
	@Transactional
	public List<Feedback> getFeedbacks()
	{
		Session session = sessionFactory.getCurrentSession();
		Query q =session.createQuery("from Feedback");
		List<Feedback> l = (List<Feedback>)q.list();
		System.out.println(l);
		return l; 	 	
				
	}
}
