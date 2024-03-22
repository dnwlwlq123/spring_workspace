package user.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import user.bean.UserDTO;

@Repository
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	
	
	
	  @Autowired 
	  public UserDAOImpl(DataSource dataSource) {
	  setDataSource(dataSource);
	  
	  }
	 
	 
	//JdbcDaoSupport의 setDataSource가 final이기 때문에 Override를 할 수 없다.
	
	/*
	 * @Autowired public void setDS(DataSource dataSource) {
	 * setDataSource(dataSource); }
	 */
	 
		 
	
	@Override
	public void write(UserDTO userDTO) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		String sql = "insert into usertable values(:name, :id, :pwd)";
	    getNamedParameterJdbcTemplate().update(sql, map);	
	}

	@Override
	
	
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}
	
	@Override

	
	public UserDTO getChangeList(String id) {
		String sql = "select * from usertable where id = :id";
		
				
		 try {
		        
		        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);

		        return getNamedParameterJdbcTemplate().queryForObject(sql, namedParameters, new BeanPropertyRowMapper<>(UserDTO.class));
		    } catch (EmptyResultDataAccessException e) {
		       
		        return null;
		    }
		
	}

	@Override
	

	public void change(UserDTO userDTO) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		String sql = "update usertable set name=:name, pwd=:pwd where id=:id";
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}

	@Override
	
	
	public void getDelete(String id) {
		
		
		String sql = "delete from usertable where id=:id";
		getNamedParameterJdbcTemplate().update(sql, new MapSqlParameterSource("id",id));
	}

	
}
