package br.com.kadoozin.reservas.project.repositorys;

import br.com.kadoozin.reservas.project.entities.Reservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservasRespository extends JpaRepository<Reservas, Long> {
}
