package Controller;

import com.exemplos.exercicio2.Model.Usuario;
import com.exemplos.exercicio2.Repositorys.UsarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UsuarioController {
@Autowired
  private UsarioRepository repository;
   @GetMapping
    public List<Usuario>findAll(){
      List<Usuario> result = repository.findAll();
      return result;
    }
}
