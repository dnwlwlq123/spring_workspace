package user.dao;

import java.util.List;

import javax.transaction.Transactional;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
@Transactional
public class UserDAOMyBatis implements UserDAO {
	@Autowired
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