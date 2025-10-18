package br.com.kadoozin.reservas.project.repositorys;

import br.com.kadoozin.reservas.project.entities.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecosRepository extends JpaRepository<Enderecos, Long> {
}
