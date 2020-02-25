package mh.com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chitietdathang")
public class OrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "so_hoa_don")
	private String codeBill;
	@Column(name = "ma_hang")
	private String codeProduct;
	@Column(name = "gia_ban")
	private Float price;
	@Column(name = "so_luong")
	private Long amount;
	@Column(name = "muc_giam_gia")
	private float saleOff;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeBill() {
		return codeBill;
	}
	public void setCodeBill(String codeBill) {
		this.codeBill = codeBill;
	}
	public String getCodeProduct() {
		return codeProduct;
	}
	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public float getSaleOff() {
		return saleOff;
	}
	public void setSaleOff(float saleOff) {
		this.saleOff = saleOff;
	}
	
	

}
