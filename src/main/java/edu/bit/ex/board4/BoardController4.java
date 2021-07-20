package edu.bit.ex.board4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;



@Log4j
@Controller
public class BoardController4 {
	
    @Autowired
    BService4 bservice4;
    
	@RequestMapping("/list4")
	public String list4(Model model) throws Exception {
		log.info("/list4");
		model.addAttribute("list",bservice4.selectBoardList());
		
	    
		return "list";
	}
	
}
