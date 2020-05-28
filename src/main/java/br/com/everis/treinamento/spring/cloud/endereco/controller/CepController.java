package br.com.everis.treinamento.spring.cloud.endereco.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.everis.treinamento.spring.cloud.endereco.integrateion.CepIntegration;

@RestController
@RequestMapping("v1/endereco")
public class CepController {

	@Autowired
	private CepIntegration cepIntegration;
	
	@GetMapping(value = "/cep/{cep}")
	public Map<String, Object> buscarPorCep(@PathVariable("cep") String cep) {
		
		return cepIntegration.buscarPorCep(cep);
		
	}
	
}
