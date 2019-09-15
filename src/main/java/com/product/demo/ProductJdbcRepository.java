package com.product.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductJdbcRepository {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	public Product findById(int id) {
	    return jdbcTemplate.queryForObject("select * from product where id=?", new Object[]{id},
	        new BeanPropertyRowMapper < Product > (Product.class));
	}
	
	public List < Product > findAll() {
	    return jdbcTemplate.query("select * from product", new ProductRowMapper());
	}
	
	public int deleteById(int id) {
			return jdbcTemplate.update("delete from product where id=?", new Object[] {id});
	}
	
	public int insert(Product prodcut) {
		return jdbcTemplate.update("insert into product ( id,pname, pprice) " + "values(?,?,?)",
				new Object[] {
						prodcut.getId(),prodcut.getPname(), prodcut.getPprice()
        });
	}
	
	public int update(Product prodcut) {
		return jdbcTemplate.update("update product " + "set pname = ?, pprice = ? " + " where id = ?",
				new Object[] {
						prodcut.getPname(), prodcut.getPprice(), prodcut.getId()
        });
	}



}
