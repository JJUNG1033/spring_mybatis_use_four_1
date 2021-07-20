package edu.bit.ex.board1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

// 상속관계를 생각할 필요없이(다형성을 고려할 필요없이)딱 정해져있을때
@Service
public class BService1 {

    //SqlSession -> 마이바티스
    @Autowired
    SqlSession sqlSession;
    
    public List<BoardVO> selectBoardList() throws Exception {
        IBDao dao = sqlSession.getMapper(IBDao.class);
       return dao.listDao();
     }
}
