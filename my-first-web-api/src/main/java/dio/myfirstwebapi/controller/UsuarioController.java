package dio.myfirstwebapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.myfirstwebapi.handler.BusinessException;
import dio.myfirstwebapi.model.Usuario;
import dio.myfirstwebapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;

	@PostMapping("/usuarios")
	public void post(@RequestBody Usuario usuario) {
		if (usuario.getLogin() == null) {
			throw new BusinessException("O campo login é obrigatório");
		}
		if (usuario.getId() == null) {
			System.out.println("SAVE - Recebendo o usuario na camada repository");
		} else {
			System.out.println("UPDATE - Recebendo o usuario na camada repository");
		}
		repository.save(usuario);
	}

	@PutMapping("/usuarios")
	public void put(@RequestBody Usuario usuario) {
		repository.update(usuario);
	}

	@GetMapping("/usuarios")
	public List<Usuario> getAll() {
		return repository.listAll();
	}

	@GetMapping("/usuario/{id}")
	public Usuario getOne(@PathVariable("id") Integer id) {
		return repository.finById(id);
	}

	@DeleteMapping("/usuarios/{id}")
	public void delete(@PathVariable("id") Integer id) {
		repository.remove(id);
	}
}
