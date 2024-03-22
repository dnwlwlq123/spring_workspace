package user.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
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
