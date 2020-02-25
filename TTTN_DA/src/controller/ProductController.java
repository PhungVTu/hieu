package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mh.com.dao.ProductDAO;
import mh.com.dto.Product;

@RestController
@RequestMapping("/product/")
public class ProductController {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	@RequestMapping("/test")
	public Response getTest(@RequestBody Product product)
	{
		List<Product> list=productDAO.getListProduct();
		System.out.println(list.get(0));
		return Response.ok(list).build();
	}

}
