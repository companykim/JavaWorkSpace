package www.dream.bb.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import www.dream.bb.model.BoardVO;

public class BoardDAO {
    private SqlSessionFactory sqlSessionFactory = null; // 데이터베이스와의 연결과 sql실행에 대한 모든 것을 가진 가장 중요한 객체
    
    public BoardDAO(SqlSessionFactory sqlSessionFactory){
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public  List<BoardVO> selectAll(){
        List<BoardVO> list = null;
        SqlSession session = sqlSessionFactory.openSession();
 
        try {
            list = session.selectList("BoardVO.selectAll");
        } finally {
            session.close();
        }
 
        return list;
    }
}
