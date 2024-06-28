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
	public String hello() {
		return "Olá, mundo";
	}
	
	
	
	
}