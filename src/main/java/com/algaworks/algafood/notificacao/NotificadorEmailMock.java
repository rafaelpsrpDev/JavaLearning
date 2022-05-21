package com.algaworks.algafood.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;


@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmailMock {
		
	public NotificadorEmailMock() {
		System.out.println("NotificadorEmail MOCK");
	}
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Mock:Notificação seria enviado para %s através do e-mail %s: %s\n",
				cliente.getNome(), cliente.getEmail(),  mensagem);
	}

	
}

