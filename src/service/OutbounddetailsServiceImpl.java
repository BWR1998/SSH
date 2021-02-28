package service;

import java.util.List;

import dao.OutbounddetailsDAO;
import dao.OutbounddetailsDAOImpl;

import entity.Outbounddetails;

public class OutbounddetailsServiceImpl implements OutbounddetailsService{
	
	public OutbounddetailsDAO outbounddetailsDAO;
	public void setOutbounddetailsDAO(OutbounddetailsDAO outbounddetailsDAO) {
		this.outbounddetailsDAO = outbounddetailsDAO;
	}
	@Override
	public List<Outbounddetails> findAll() {
		
		return outbounddetailsDAO.findAll();
	}

}
