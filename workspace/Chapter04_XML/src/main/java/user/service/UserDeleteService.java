package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {

	@Setter
	private UserDTO userDTO;
	@Setter
	private UserDAO userDAO;
	@Override
	public void execute() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 아이디 입력 : ");
		String id = scan.next();
		
		userDTO = userDAO.getChangeList(id);
		
		if(userDTO!=null) {
			
			System.out.println(userDTO);
			userDAO.getDelete(id);
			System.out.println("\n" + id + "님의 데이터를 삭제하였습니다");
		}else 
			System.out.println("찾고자 하는 아이디가 없습니다");
		

	}

}
