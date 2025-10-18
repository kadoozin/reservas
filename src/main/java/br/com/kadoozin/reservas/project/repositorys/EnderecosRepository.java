package br.com.kadoozin.reservas.project.repositorys;

import br.com.kadoozin.reservas.project.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
