package com.telusko.tusk.dao;

import java.util.List;
import org.hibernate.query.Query;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.telusko.tusk.entity.Code;

@Component
public class CodeDAO
{
    @Autowired
	private SessionFactory sessionFactory;
    @Transactional
	public Code getCode(String cname) 
	{
		Session session = sessionFactory.getCurrentSession();
		Query<Code> q = session.createQuery("from Code where cname='"+cname+"'");
	     Code c = q.uniqueResult();
		return c;
	}

}
