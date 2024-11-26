package br.com.kayquedev.Task.Management.API.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarefas")
public class Tarefas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	
	private String descricao;
	
	private LocalDateTime dataDeCriacao;
	
	private LocalDate prazo;
	
	private String status;
	
	private String prioridade;
	
	@ManyToOne
	private Usuario usuario;
	
	@ManyToOne
	private Time time;
}
