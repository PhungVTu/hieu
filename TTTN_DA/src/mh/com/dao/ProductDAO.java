package mh.com.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.hibernate.type.FloatType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import mh.com.dto.Product;

@Repository("productdao")
public class ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Product> getListProduct(){
		StringBuffer sql=new StringBuffer("select top 6 "
				+ "p.id as id,"
				+ "p.thumbnail as thumbnail,"
				+ "p.ma_hang as codeProduct,"
				+ "p.nha_san_xuat as brand,"
				+ "p.ma_loai_hang as codeTypeProduct,"
				+ "p.so_luong as amount,"
				+ "p.kieu_dang as fashionType,"
				+ "p.chat_lieu as meterial,"
				+ "p.size as size,"
				+ "p.mo_ta_sp as descriptionProduct,"
				+ "p.thong_tin_chi_tiet as detailInformation,"
				+ "p.don_vi_tinh as unitCount,"
				+ "p.gia_hang as PriceProduct "
				+ "from product as p "
				+ "where 1=1 ");
		
		
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery(sql.toString());
		query.addScalar("id",new LongType());
		query.addScalar("thumbnail",new StringType());
		query.addScalar("codeProduct",new StringType());
		query.addScalar("brand",new StringType());
		query.addScalar("codeTypeproduct",new StringType());
		query.addScalar("amount",new LongType());
		query.addScalar("fashionType",new StringType());
		query.addScalar("meterial",new StringType());
		query.addScalar("size",new StringType());
		query.addScalar("descriptionProduct",new StringType());
		query.addScalar("detailInformation",new StringType());
		query.addScalar("unitCount",new StringType());
		query.addScalar("PriceProduct",new FloatType());
		
		
		query.setResultTransformer(Transformers.aliasToBean(Product.class));
		return query.list();
	}

}
