package action;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import service.ClothesService;
import service.OutbounddetailsService;
import entity.Clothes;
import entity.Outbounddetails;

public class OutbounddetailsAction extends SupperAction implements ModelDriven<Outbounddetails>{
	public OutbounddetailsService outbounddetailsService;
	public Outbounddetails outbounddetails = new Outbounddetails() ;
	
	public String query(){
		List<Outbounddetails> list= outbounddetailsService.findAll();
		request.setAttribute("list", list);
		return "query_success";
	}

	@Override
	public Outbounddetails getModel() {
		// TODO Auto-generated method stub
		return outbounddetails;
	}

	public void setOutbounddetailsService(
			OutbounddetailsService outbounddetailsService) {
		this.outbounddetailsService = outbounddetailsService;
	}

}


