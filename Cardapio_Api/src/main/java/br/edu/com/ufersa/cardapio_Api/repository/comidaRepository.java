package br.edu.com.ufersa.cardapio_Api.repository;


import br.edu.com.ufersa.cardapio_Api.comida.Comida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface comidaRepository  extends JpaRepository<Comida, Long>{
}
