package mh.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import a.a;
import mh.com.dao.ProductDAO;
import mh.com.dto.Product;

@Service("productService")
public class ProductService {
	
	@Autowired
	private static ProductDAO productDAO;
	
	public static void main(String[] arg) {
		List<Product> aList=productDAO.getListProduct();
		System.out.println(aList.get(0));
	}

}
