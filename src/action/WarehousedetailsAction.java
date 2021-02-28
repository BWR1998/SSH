package action;

import java.util.List;

import service.WarehousedetailsService;

import com.opensymphony.xwork2.ModelDriven;

import entity.Outbounddetails;
import entity.Warehousedetails;

public class WarehousedetailsAction extends SupperAction implements ModelDriven<Warehousedetails>{
	 public Warehousedetails warehousedetails = new Warehousedetails();
	 public WarehousedetailsService warehousedetailsService;
	 

	public String query(){
		
		List<Warehousedetails> list= warehousedetailsService.findAll();
		request.setAttribute("list", list);
		return "query_success";
	}

	public void setWarehousedetailsService(
			WarehousedetailsService warehousedetailsService) {
		this.warehousedetailsService = warehousedetailsService;
	}
	@Override
	public Warehousedetails getModel() {
		// TODO Auto-generated method stub
		return warehousedetails;
	}
	

}
