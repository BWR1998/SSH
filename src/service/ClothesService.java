package service;

import java.util.List;

import entity.Clothes;

public interface ClothesService {
	public boolean save(Clothes clothes);
	public boolean delete(Clothes clothes);
	public boolean update(Clothes clothes);
	public List<Clothes> findAll();
	public Clothes findAllById(int clothes_id);
}
