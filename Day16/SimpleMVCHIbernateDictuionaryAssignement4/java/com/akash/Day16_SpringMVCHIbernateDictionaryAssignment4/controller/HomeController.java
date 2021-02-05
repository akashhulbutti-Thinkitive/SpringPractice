package com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.dao.DictionaryOpClass;
import com.akash.Day16_SpringMVCHIbernateDictionaryAssignment4.model.DictionaryClass;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		ModelAndView model = new ModelAndView();
		model.addObject("list", new DictionaryOpClass().showListEmployee());
		model.setViewName("home");
		return model;
	}
	
	
	@RequestMapping("/add")
	public ModelAndView addWord(DictionaryClass dict) {
		DictionaryOpClass daoImpl = new DictionaryOpClass();
		ModelAndView model = new ModelAndView();
		daoImpl.saveDictionaryWord(dict);
		model.addObject("list", new DictionaryOpClass().showListEmployee());
		model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/allWords")
	public ModelAndView getAllWords() {
		DictionaryOpClass daoImpl = new DictionaryOpClass();
		ModelAndView model = new ModelAndView();
		model.addObject("list", new DictionaryOpClass().showListEmployee());
		model.setViewName("home");
		return model;
	}
}
