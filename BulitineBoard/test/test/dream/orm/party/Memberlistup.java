package test.dream.orm.party;

import java.util.List;

import www.dream.orm.MyBatisConnectionFactory;
import www.dream.party.dao.MemberDAO;
import www.dream.party.model.ContactPointVO;
import www.dream.party.model.MemberVO;
import www.dream.party.model.Party;

public class Memberlistup {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO(MyBatisConnectionFactory.getSqlSessionFactory());
		//create
		MemberVO mem = new MemberVO("김길동", false);
		mem.addCP(new ContactPointVO("hand phone number", "010-8622-4414"));
		mem.addCP(new ContactPointVO("hand address", "서울 구로 002"));
		dao.insert(mem);
		
		// Read
		// 입력한 리스트를 보여준다.
		List<Party> bList = dao.selectAll();
		for (Party obj : bList) {
			System.out.println(obj);
		}
	}
}
