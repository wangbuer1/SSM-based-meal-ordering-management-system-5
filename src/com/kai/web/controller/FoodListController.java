package com.kai.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Food;
import com.kai.web.service.FoodService;

public class FoodListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		FoodService foodService = new FoodService();
		Long k_id = Long.parseLong(request.getParameter("id"));
		List<Food> foodList = foodService.selectByKind(k_id);
		
		session.setAttribute("foodList", foodList);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("foodList");
		return mv;
	}

}
