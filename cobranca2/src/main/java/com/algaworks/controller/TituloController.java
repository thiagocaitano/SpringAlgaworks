package com.algaworks.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.dao.TituloDao;
import com.algaworks.model.StatusTitulo;
import com.algaworks.model.Titulo;

@Controller

@RequestMapping("/titulos")
public class TituloController {
	
	@Autowired
	private TituloDao tituloDao;

	@RequestMapping("/novo")
	public ModelAndView  novo() {
	
		ModelAndView mv = new ModelAndView("cadastro-titulo");
		return mv;
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo){
		
		tituloDao.save(titulo);
		ModelAndView mv = new ModelAndView("cadastro-titulo");
		mv.addObject("mensagem","Titulo salvo com sucesso !");
		return mv;
	}
	
	@ModelAttribute("listaStatusTitulo")
	public List<StatusTitulo> getListaStatusTitulo(){
		return Arrays.asList(StatusTitulo.values());
	}
	
}
