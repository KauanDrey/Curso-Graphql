package compras.compras;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import compras.cliente.Cliente;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {

	List<Compra> findByCliente(Cliente c);

}
