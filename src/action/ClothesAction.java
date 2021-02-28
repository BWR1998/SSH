package action;

import java.util.List;

import service.ClothesService;

import com.opensymphony.xwork2.ModelDriven;

import entity.Clothes;

public class ClothesAction extends SupperAction implements ModelDriven<Clothes>{
	public ClothesService clothesService;
	
	public Clothes clothes = new Clothes();
	
	public void setClothesService(ClothesService clothesService) {
		this.clothesService = clothesService;
	}
	
	public String query(){
		List<Clothes> list= clothesService.findAll();
		request.setAttribute("list", list);
		return "query_success";
	}
	public String save(){
		clothesService.save(clothes);
		return "add_success";
	}
	public String delete(){
		int clothes_id=  Integer.parseInt(request.getParameter("clothes_id")) ;
	    System.out.println(clothes_id);
		Clothes clothes = clothesService.findAllById(clothes_id);
		System.out.println(clothes.getClothes_name());
		clothesService.delete(clothes);
		System.out.println("111");
		return "delete_success";
	}



	@Override
	public Clothes getModel() {
		
		return clothes;
	}

}
