package com.mulcam.ai.web.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mulcam.ai.util.BreakTimeTTS;


@Controller
public class BreakController {

	
	// 쉬는 시간 설정
	@RequestMapping(value="/break_set", method= {RequestMethod.POST}, produces="application/text; charset=utf8")
	@ResponseBody
	public String breakSet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("breakSet...");
		String user_id=request.getParameter("user_id");
		String user_belong=request.getParameter("user_belong");
		int breakTime = Integer.parseInt(request.getParameter("breakTime"));
		String breakTimeMsg=request.getParameter("breakTimeMsg");
		// 스트링을 불리언으로 변경하기!
		boolean breakbool = false; 

		
		new BreakTimeTTS().main(breakTimeMsg, user_id);
		return "쉬는 시간 설정 완료";
	}
		
	
}
