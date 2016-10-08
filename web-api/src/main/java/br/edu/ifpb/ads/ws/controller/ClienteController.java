package br.edu.ifpb.ads.ws.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.ads.model.Cliente;

/**
 * 
 * @author franck
 *
 */
@RestController
public class ClienteController {

	@RequestMapping(method = RequestMethod.POST, value = "/clientes", consumes=MediaType.APPLICATION_JSON_VALUE)
	public void cadastrarCliente(@RequestBody Cliente cliente){
		System.out.println(cliente);
	}
}