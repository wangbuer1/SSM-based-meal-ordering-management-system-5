package com.kai.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.kai.bean.Line;
import com.kai.bean.Order;
import com.kai.web.service.LineService;
import com.kai.web.service.OrderService;

public class OrderDeleteController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		OrderService orderService = new OrderService();
		LineService lineService = new LineService();
		
		Long id = Long.parseLong(request.getParameter("id"));
		Order order = orderService.findById(id);
		
		/*Long u_id = order.getU_id();
		List<Line> list = lineService.selectByU_id(u_id);
		*/
		return null;
	}

}
