No pom.xml o maven baixa as depêndencias necessárias para o projeto . 
Postman - testar API fazendo requisições http
localhost - endereço local do note
8080 - porta
clientes - URI do endpoint

package com.algaworks.crm.controller;

import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	//verbo http para chamar o método
	@GetMapping
	/*
	public String hello() {
		return "Olá, mundo";
	}*/
	
    public List<Client> listar() {
		
		
	}
	
	
}

// classe de cliente
@Entity //javax.persistence vai existir uma tabela cliente no bd
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)  
	private String nome;
	
	public Long getId() {
		return id;
	}
	
	public Long setId (Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String setNome(String nome) {
		this.nome = nome;
	}
}

//SPring Data JPA -> Repositórios para java 
