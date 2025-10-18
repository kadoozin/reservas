package br.com.kadoozin.reservas.project.repositorys;

import br.com.kadoozin.reservas.project.entities.Telefones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefonesRepository extends JpaRepository<Telefones, Long> {
}
