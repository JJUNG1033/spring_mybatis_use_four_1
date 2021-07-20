package edu.bit.ex.board2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

/*
1. interface는 필요가 없음 
2. sqlSession에서 제공하는 함수(selectList,selectOne)를 이용함
3. 쿼리구현을 위한 XML이 필요. 해당 XML의 namespace는  개발자가가 정함
4. 위와같은 방법은 옛날방식으로 많이 사용하진않는다
* 
* */

@Service
public class BService2 {
	
	 @Autowired
	   SqlSession sqlSession;
	   
	    public List<BoardVO> selectBoardList()throws Exception {
	      return sqlSession.selectList("board.selectBoardList");
	    }
	   

}
