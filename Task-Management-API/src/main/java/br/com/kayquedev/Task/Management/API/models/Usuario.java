package br.com.kayquedev.Task.Management.API.models;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nome;

	private String email;
	
	private String cargo;
	
	private String senha; // implementar segurança futuramente.
	
	private boolean ativo;
	
	@ManyToOne
	private Time time;
	
	@OneToMany(mappedBy = "usuario")
	private List<Tarefas> tarefas;
	
	

}
