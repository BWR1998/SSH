package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import entity.Warehousedetails;
@Transactional
public class WarehousedetailsDAOImpl extends BaseDAO implements WarehousedetailsDAO{

	@Override
	public List<Warehousedetails> findAll() {
		Session session = getSession();
		Query query= session.createQuery("from Warehousedetails");
		List<Warehousedetails> list = query.list();
		
		return list;
	}

}
