package user.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.apache.ibatis.session.SqlSession;
import lombok.Setter;
import user.bean.UserDTO;

@Transactional
public class UserDAOMyBatis implements UserDAO {
	@Setter
	private SqlSession sqlSession;
	
	
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write", userDTO);

	}

	@Override
	public List<UserDTO> getUserList() {
		
		return sqlSession.selectList("userSQL.getUserList");
	}

	@Override
	public UserDTO getChangeList(String id) {
		
		return sqlSession.selectOne("userSQL.getChangeList", id);
	}

	@Override
	public void change(UserDTO userDTO) {
		sqlSession.insert("userSQL.change", userDTO);

	}

	@Override
	public void getDelete(String id) {
		sqlSession.insert("userSQL.getDelete", id);

	}

}
