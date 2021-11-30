package br.com.MeH.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MeH")
public class MeHController {
	
	@GetMapping
	public String MeH() {
		return "Nessa sessão, ultilizei a mentalidade de crescimento e orientação ao detalhe.";
	}
}
