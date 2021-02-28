package dao;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import entity.Outbounddetails;
@Transactional
public class OutbounddetailsDAOImpl  extends BaseDAO implements OutbounddetailsDAO{

	@Override
	public List<Outbounddetails> findAll() {
		Session session = getSession();
		Query query= session.createQuery("from Outbounddetails");
		List<Outbounddetails> list = query.list();
		
		return list;
		
	}

}
