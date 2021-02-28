package service;

import java.util.List;

import dao.WarehousedetailsDAO;

import entity.Warehousedetails;

public class WarehousedetailsServiceImpl implements WarehousedetailsService{
	
	public WarehousedetailsDAO warehousedetailsDAO;
	public void setWarehousedetailsDAO(WarehousedetailsDAO warehousedetailsDAO) {
		this.warehousedetailsDAO = warehousedetailsDAO;
	}
	@Override
	public List<Warehousedetails> findAll() {
		
		return warehousedetailsDAO.findAll();
	}

}
