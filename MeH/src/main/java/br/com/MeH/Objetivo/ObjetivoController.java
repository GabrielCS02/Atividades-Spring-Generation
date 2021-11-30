package br.com.MeH.Objetivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objetivo")
public class ObjetivoController {

	@GetMapping
	public String Objetivo() {
		return "Meu objetivo nessa semana é absorver todo o conteúdo de Spring que será apresentado,"
				+ " pois sei que será muito relevante no meu futuro como Dev.";
	}
	
}
