package com.algaworks.algafood;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	@Autowired
	private AtivacaoClienteService ativacaoClienteService;
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente rafael = new Cliente("Rafael Paulo", "rafaelpsrp@hotmail.com", "71992616882");
		this.ativacaoClienteService.ativar(rafael);
		return "Oláa!";
	}
}
 