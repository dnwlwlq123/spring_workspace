package user.service;

import java.util.List;
import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserUpdateService implements UserService {
	@Setter
	private UserDTO userDTO;
	@Setter
	private UserDAO userDAO;
	@Override
	
	public void execute() {
		Scanner scan = new Scanner(System.in);
		System.out.println();

		while(true) {
			
			//System.out.println(userDTO);
			
		
		
		System.out.println("수정할 아이디 입력 : ");
		
		String id = scan.next();
		UserDTO  userDTO = userDAO.getChangeList(id);
			if(userDTO!=null) {
				
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println(userDTO);
				
				System.out.println();

			    System.out.print("수정 할 이름 입력 : ");
			    String name = scan.next();
			    System.out.print("수정 할 비밀번호 입력 : ");
			    String pwd = scan.next();

			    userDTO.setName(name);
			    userDTO.setPwd(pwd);
			    
			    userDAO.change(userDTO);
			   
			    
			    System.out.println("\n" + id + "님의 데이터를 수정하였습니다");
			    
			    break;
			}//if
			if(userDTO==null) {
				System.out.println("찾고자 하는 아이디가 없습니다.");
		}//while
			
			}
		
		

	}

}
