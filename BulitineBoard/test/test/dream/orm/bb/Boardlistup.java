package test.dream.orm.bb;

import java.util.List;

import www.dream.bb.dao.BoardDAO;
import www.dream.bb.model.BoardVO;
import www.dream.orm.MyBatisConnectionFactory;

public class Boardlistup {

	public static void main(String[] args) {
		BoardDAO bDAO = new BoardDAO(MyBatisConnectionFactory.getSqlSessionFactory());

		// Read
		// 입력한 리스트를 보여준다.
		List<BoardVO> bList = bDAO.selectAll();
		for (BoardVO obj : bList) {
			System.out.println(obj);
		}
	}

}
