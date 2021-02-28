package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import entity.Clothes;

@Transactional
public class ClothesDAOImpl extends BaseDAO implements ClothesDAO{

	@Override
	public boolean save(Clothes clothes) {
		Session session=getSession();
		try{
			session.save(clothes);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(Clothes clothes) {
		Session session=getSession();
		try{
			session.delete(clothes);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean update(Clothes clothes) {
		Session session=getSession();
		try{
			session.update(clothes);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public List<Clothes> findAll() {
		Session session = getSession();
		Query query= session.createQuery("from Clothes");
		List<Clothes> list = query.list();
		
		return list;
	}

	@Override
	public Clothes findAllById(int clothes_id) {
		Session session=getSession();
		Clothes clothes = (Clothes)session.get(Clothes.class,clothes_id );
		return clothes;
	}

	

}
