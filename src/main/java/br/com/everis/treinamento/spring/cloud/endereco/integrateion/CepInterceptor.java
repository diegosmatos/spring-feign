package br.com.everis.treinamento.spring.cloud.endereco.integrateion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.ribbon.RequestTemplate;

import feign.RequestInterceptor;

@Configuration
public class CepInterceptor {

	@Bean
	public RequestInterceptor cepRequestInterceptot() {
		return requestTemplate -> {
			requestTemplate.header("authorization", "teste");
		};
	}
}
