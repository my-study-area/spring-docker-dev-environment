package br.com.adrianoavelino.springdockerdevenvironment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianoavelino.springdockerdevenvironment.model.OlaMundo;

@RestController
@RequestMapping("/olamundo")
public class OlaMundoController {

	@GetMapping
	public ResponseEntity<OlaMundo> exibirMensagem() {
		return new ResponseEntity<>(new OlaMundo("Olá, Mundo!"), HttpStatus.OK);
	}
}
