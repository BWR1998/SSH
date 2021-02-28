package entity;

public class Warehousedetails {
	private int warehousedetails_id;
	private int warehouse_id;
	public int getWarehousedetails_id() {
		return warehousedetails_id;
	}
	public void setWarehousedetails_id(int warehousedetails_id) {
		this.warehousedetails_id = warehousedetails_id;
	}
	public int getWarehouse_id() {
		return warehouse_id;
	}
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}
	public int getClothes_id() {
		return clothes_id;
	}
	public void setClothes_id(int clothes_id) {
		this.clothes_id = clothes_id;
	}
	public String getClothes_size() {
		return clothes_size;
	}
	public void setClothes_size(String clothes_size) {
		this.clothes_size = clothes_size;
	}
	public String getClothes_color() {
		return clothes_color;
	}
	public void setClothes_color(String clothes_color) {
		this.clothes_color = clothes_color;
	}
	public int getWarehouse_num() {
		return warehouse_num;
	}
	public void setWarehouse_num(int warehouse_num) {
		this.warehouse_num = warehouse_num;
	}
	private int clothes_id;
	private String clothes_size;
	private String clothes_color;
	private int warehouse_num;
	
	
}