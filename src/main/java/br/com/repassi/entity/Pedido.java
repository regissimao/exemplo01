package br.com.repassi.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Pedido {
	
	private int id;
	
	private Date data;
	
	private int quantidade;

}
