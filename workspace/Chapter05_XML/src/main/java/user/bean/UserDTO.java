package user.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

	String name;
	String id;
	String pwd;
	
	
	@Override
	public String toString() {
		return name + "\t" + id + "\t" + pwd;
	}
}
