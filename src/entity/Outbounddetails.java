package entity;

public class Outbounddetails {
	private int outbounddetails_id;
	private int outbound_id;
	private int clothes_id;
	private String clothes_size;
	private String clothes_color;

	public int getOutbound_id() {
		return outbound_id;
	}
	public void setOutbound_id(int outbound_id) {
		this.outbound_id = outbound_id;
	}
	public int getClothes_id() {
		return clothes_id;
	}
	public void setClothes_id(int clothes_id) {
		this.clothes_id = clothes_id;
	}
	public int getOutbounddetails_id() {
		return outbounddetails_id;
	}
	public void setOutbounddetails_id(int outbounddetails_id) {
		this.outbounddetails_id = outbounddetails_id;
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
	public int getOutbound_num() {
		return outbound_num;
	}
	public void setOutbound_num(int outbound_num) {
		this.outbound_num = outbound_num;
	}
	private int outbound_num;
}
