package edu.bit.ex.board2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

/*
1.interface IBDao를  XML namespac에 매핑 <mapper namespace="edu.bit.ex.board1.IBDao"> 
2.sqlSession.getMapper(IBDao.class)를 이용.
* 
* 
* */


@Log4j
@Controller
public class BoardController2 {
	
    @Autowired
    BService2 bservice2;
    
	@RequestMapping("/list2")
	public String list2(Model model) throws Exception {
		log.info("/list2");
		model.addAttribute("list",bservice2.selectBoardList());
		
	    
		return "list";
	}
	
}
