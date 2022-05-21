package com.algaworks.algafood.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {
	//podemos usar a injeção no proprio atributo, no metodo set ou no construtor
	
	/*
	@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
	@Autowired
	private Notificador notificador;
	*/
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
	
		applicationEventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}

}
