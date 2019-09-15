package com.product.demo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product product=new Product();
        product.setId(rs.getInt("id"));
        product.setPname(rs.getString("pname"));
        product.setPprice(rs.getInt("pprice"));
		return product;
		
	}

}
