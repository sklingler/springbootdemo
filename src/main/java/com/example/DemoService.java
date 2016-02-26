package com.example;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Session;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
	@Autowired
	private SessionFactory sessionFactory;
	
	public String run(final String input) {
		
		//org.hibernate.Session session = sessionFactory.getCurrentSession();
		//SQLQuery query = session.createSQLQuery(
		//		"select id J4FrankId, name J4FrankName, startdate J4FrankDate, isinactiveflag J4FrankIsInactive from aoproducts");
		//List<Object[]> rows = query.list();

		//query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		//List data = query.list();

		//for (Object object : data) {
		//	Map row = (Map) object;
		//	System.out.print("id: " + row.get("id"));
		//	System.out.println(", name: " + row.get("name"));
		//}
		
		return input + " from DemoService";
	}
}
