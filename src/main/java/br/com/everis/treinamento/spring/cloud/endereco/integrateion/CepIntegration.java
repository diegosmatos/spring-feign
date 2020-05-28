package br.com.everis.treinamento.spring.cloud.endereco.integrateion;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(url = "http://api.postmon.com.br/v1/", name = "cepIntegration")
@Configuration
public interface CepIntegration {
	
	@RequestMapping("cep/{cep}")
	public Map<String, Object> buscarPorCep(@PathVariable("cep") String cep);

}
