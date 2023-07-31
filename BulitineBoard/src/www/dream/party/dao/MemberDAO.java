package www.dream.party.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import www.dream.party.model.MemberVO;
import www.dream.party.model.Party;

public class MemberDAO {
    private SqlSessionFactory sqlSessionFactory = null;
    
    public MemberDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public  List<Party> selectAll(){
        List<Party> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("nsParty.selectAll");
        } finally {
            session.close();
        }
 
        return list;
    }
    
    public int insert(MemberVO obj) {
    	// 영향받은 레코드 건수
        int affectedRows = -1;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
        	affectedRows = session.insert("nsParty.insert", obj);
        } finally {
        	session.commit();
        	session.close();
        }
        
        return affectedRows;
    }
}
