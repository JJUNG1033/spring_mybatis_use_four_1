package edu.bit.ex.board3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;



@Log4j
@Controller
public class BoardController3 {
	
    @Autowired
    BService3 bservice3;
    
	@RequestMapping("/list3")
	public String list3(Model model) throws Exception {
		log.info("/list3");
		model.addAttribute("list",bservice3.selectBoardList());
		
	    
		return "list";
	}
	
}
