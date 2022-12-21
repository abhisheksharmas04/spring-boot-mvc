package com.ab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ab.service.IWishMessageService;

@Controller
public class WishMessageGenerator {

	@Autowired
	private IWishMessageService service;

	@RequestMapping("/")
	public String showHome() {
		return "home"; // Logical View Name
	}

	/*
	 * @RequestMapping("/wish") public ModelAndView generateMessage() { String
	 * result = service.generateWishMessage();
	 * 
	 * // return MAV ModelAndView mav = new ModelAndView();
	 * mav.addObject("wmg",result); mav.setViewName("display"); /* here we can add n
	 * number of model and view component
	 */

	/*
	 * return new ModelAndView("display","wmg",result); here we can add only one
	 * number of mode and view component
	 */

	//return mav;

	//}*/

	@RequestMapping("/wish")
	public String generateMessage(ModelMap map) {
		System.out.println("WishMessageGenerator.generateMessage() shared memory class name: " + map.getClass());
		String result = service.generateWishMessage();
		map.addAttribute("wmg",result);

		return "display";
	}

}
