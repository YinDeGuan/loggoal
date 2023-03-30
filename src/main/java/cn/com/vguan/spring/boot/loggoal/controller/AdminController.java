package cn.com.vguan.spring.boot.loggoal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.com.vguan.spring.boot.logoal.vo.Menu;

/**
 *  admin port .
 * 
 * @since 2023 , May 30
 * @author <a href="https://vguan.com.cn">vguan</a> 
 */
@Controller
@RequestMapping("/admins")
public class AdminController {
 
	/**
	 *  admin operation view
	 * @return
	 */
	@GetMapping
	public ModelAndView listUsers(Model model) {
		//System.out.println("sss");
		List<Menu> list = new ArrayList<>();
		list.add(new Menu("用户管理", "/users"));
		model.addAttribute("list", list);
		return new ModelAndView("/admins/index", "model", model);
	}

}