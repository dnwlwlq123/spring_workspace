package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.bean.SungJukDTO;

@Controller
public class SungJukController {
	
	@GetMapping(value="sungJuk/input.do")
	public String input() {
		return "sungJuk/input";
	}
	
	@PostMapping(value="sungJuk/result.do")
	public String result(@ModelAttribute SungJukDTO sungJukDTO, Model model) {
		model.addAttribute("name", sungJukDTO.getName());
		sungJukDTO.setTot(sungJukDTO.getKor()+sungJukDTO.getEng()+sungJukDTO.getMath());
		model.addAttribute("tot", sungJukDTO.getTot());
		sungJukDTO.setAvg(sungJukDTO.getTot()/3.0);
		model.addAttribute("avg", sungJukDTO.getAvg());
		return "sungJuk/result";
	}

}
