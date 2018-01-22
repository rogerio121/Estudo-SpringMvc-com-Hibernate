package br.com.multiedro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.multiedro.dao.UsuarioDao;
import br.com.multiedro.modelo.Usuario;

@Controller
public class UsuarioController {

	@RequestMapping("index")
	public String index() {

		return "index";
	}

	@RequestMapping("cadastro")
	public String cadastro() {
		return "cadastro-usuario";
	}

	@RequestMapping("salvo")
	public ModelAndView salvo(Usuario usuario) {

		//String nome = req.getParameter("nome");
		//	String idade = req.getParameter("idade");
		UsuarioDao dao = new UsuarioDao();
		dao.salva(usuario);
		
		ModelAndView mv = new ModelAndView("usuario-cadastrado");
		mv.addObject("usuario", usuario);
		//mv.addObject("nome", nome);
		//mv.addObject("idade", idade);
		return mv;
	}
}
