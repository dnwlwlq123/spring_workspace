package user.dao;

import java.util.List;

import user.bean.UserDTO;


public interface UserDAO {
	
	public void write(UserDTO userDTO);
	
	public List<UserDTO> getUserList();
	
	public UserDTO getChangeList(String id);
	
	public void change(UserDTO userDTO);

	public void getDelete(String id);
 
	

	

}
