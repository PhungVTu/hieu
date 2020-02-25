package mh.com.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phanhoi")
public class FeedBack {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "ma_khach_hang")
	private String codeCustomer;
	@Column(name = "ngay_phan_hoi")
	private Date dateFeedBack;
	@Column(name = "noi_dung_phan_hoi")
	private String contendFeedBack;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodeCustomer() {
		return codeCustomer;
	}
	public void setCodeCustomer(String codeCustomer) {
		this.codeCustomer = codeCustomer;
	}
	public Date getDateFeedBack() {
		return dateFeedBack;
	}
	public void setDateFeedBack(Date dateFeedBack) {
		this.dateFeedBack = dateFeedBack;
	}
	public String getContendFeedBack() {
		return contendFeedBack;
	}
	public void setContendFeedBack(String contendFeedBack) {
		this.contendFeedBack = contendFeedBack;
	}
	

}
