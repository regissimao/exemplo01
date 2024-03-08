package br.com.repassi.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PedidoVO {
	
	private int id;
	
	private Date data;
	
	private int quantidade;

	private int id_usuario;

}
