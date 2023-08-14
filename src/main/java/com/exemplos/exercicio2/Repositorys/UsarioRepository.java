package com.exemplos.exercicio2.Repositorys;

import com.exemplos.exercicio2.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsarioRepository  extends JpaRepository<Usuario, Long> {
}
