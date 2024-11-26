package br.com.kayquedev.Task.Management.API.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "times")
public class Time {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;
	
	private String descricao;
	
	private boolean ativo;
	
	@OneToMany(mappedBy = "time")
	private List<Usuario> usuarios;
	
	@OneToMany(mappedBy = "time")
	private List<Tarefas> tarefas;
	
}
