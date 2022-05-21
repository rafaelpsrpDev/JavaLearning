package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.println("Host: " + this.notificadorProperties.getHostServidor());
		System.out.println("Porta: " + this.notificadorProperties.getPortaServidor());
		
		System.out.printf("Notificadando %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(),  mensagem);
	}
}
 