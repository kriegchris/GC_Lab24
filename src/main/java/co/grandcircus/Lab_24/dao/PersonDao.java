package co.grandcircus.Lab_24.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus.Lab_24.model.Person;
import co.grandcircus.Lab_24.model.Product;
@Repository
public class PersonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
		//This is the C in CRUD -- create
		public int addPeson(String firstName, String lastName, String birthday, String email, String phoneNumber, String password, String branch, boolean newsletter) {
			String addQuery = "insert into users (first_name, last_name, birthday, email, phone_number, password, branch, newsletter) values(?,?,?,?,?,?,?,?)";
			return jdbcTemplate.update(addQuery, firstName, lastName, birthday, email, phoneNumber, password, branch, newsletter);
		}
		
		//This is the R in CRUD -- read
		public List<Person> findAllPeople(){
			return jdbcTemplate.query("select * from users", new BeanPropertyRowMapper<Person>(Person.class));
		}
		
		public List<Product> searchAllProducts(){
			return jdbcTemplate.query("select * from products", new BeanPropertyRowMapper<Product>(Product.class));
		}
	
}
