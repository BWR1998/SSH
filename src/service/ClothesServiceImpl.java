package service;

import java.util.List;

import dao.ClothesDAO;

import entity.Clothes;

public class ClothesServiceImpl implements ClothesService{
	
 public ClothesDAO clothesDAO;
 
	public void setClothesDAO(ClothesDAO clothesDAO) {
	this.clothesDAO = clothesDAO;
}

	@Override
	public boolean save(Clothes clothes) {
		// TODO Auto-generated method stub
		return clothesDAO.save(clothes);
	}

	@Override
	public boolean delete(Clothes clothes) {
		// TODO Auto-generated method stub
		return clothesDAO.delete(clothes);
	}

	@Override
	public boolean update(Clothes clothes) {
		// TODO Auto-generated method stub
		return clothesDAO.update(clothes);
	}

	@Override
	public List<Clothes> findAll() {
		// TODO Auto-generated method stub
		return clothesDAO.findAll();
	}

	@Override
	public Clothes findAllById(int clothes_id) {
		// TODO Auto-generated method stub
		return clothesDAO.findAllById(clothes_id);
	}

}
