package com.kai.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.web.service.FoodService;

public class FoodDeleteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Long id = Long.parseLong(request.getParameter("id"));
		FoodService foodService = new FoodService();
		foodService.deleteOne(id);
		return null;
	}

}
