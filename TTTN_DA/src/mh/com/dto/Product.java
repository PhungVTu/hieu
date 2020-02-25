package mh.com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mathang")
public class Product {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "thumbnail")
	private String thumbnail;
	@Column(name = "ma_hang")
	private String codeProduct;
	@Column(name = "nha_san_xuat")
	private String brand;
	@Column(name = "ma_loai_hang")
	private String codeTypeProduct;
	@Column(name = "so_luong")
	private Long amount;
	@Column(name = "kieu_dang")
	private String fashionType;
	@Column(name = "chat_lieu")
	private String material;
	@Column(name = "size")
	private String size;
	@Column(name = "mo_ta_sp")
	private String descriptionProduct;
	@Column(name = "thong_tin_chi_tiet")
	private String detailInformation;
	@Column(name = "don_vi_tinh")
	private String unitCount;
	@Column(name = "gia_hang")
	private float PriceProduct;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getCodeProduct() {
		return codeProduct;
	}
	public void setCodeProduct(String codeProduct) {
		this.codeProduct = codeProduct;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCodeTypeProduct() {
		return codeTypeProduct;
	}
	public void setCodeTypeProduct(String codeTypeProduct) {
		this.codeTypeProduct = codeTypeProduct;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public String getFashionType() {
		return fashionType;
	}
	public void setFashionType(String fashionType) {
		this.fashionType = fashionType;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDescriptionProduct() {
		return descriptionProduct;
	}
	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}
	public String getDetailInformation() {
		return detailInformation;
	}
	public void setDetailInformation(String detailInformation) {
		this.detailInformation = detailInformation;
	}
	public String getUnitCount() {
		return unitCount;
	}
	public void setUnitCount(String unitCount) {
		this.unitCount = unitCount;
	}
	public float getPriceProduct() {
		return PriceProduct;
	}
	public void setPriceProduct(float priceProduct) {
		PriceProduct = priceProduct;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", thumbnail=" + thumbnail + ", codeProduct=" + codeProduct + ", brand=" + brand
				+ ", codeTypeProduct=" + codeTypeProduct + ", amount=" + amount + ", fashionType=" + fashionType
				+ ", material=" + material + ", size=" + size + ", descriptionProduct=" + descriptionProduct
				+ ", detailInformation=" + detailInformation + ", unitCount=" + unitCount + ", PriceProduct="
				+ PriceProduct + "]";
	}
	
	
	
}
