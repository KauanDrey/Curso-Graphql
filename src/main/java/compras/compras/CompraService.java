package compras.compras;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import compras.cliente.Cliente;

@Service
public class CompraService {

	@Autowired
	CompraRepository rep;

	public Compra findById(Long id) {
		return rep.findById(id).orElse(null);
	}

	public List<Compra> findAll(Pageable pageable) {
		return rep.findAll(pageable).getContent();
	}

	@Transactional
	public Compra save(Compra c) {
		if(c.getQuantidade() > 100) {
		throw new RuntimeException("Não é possívivel fazer uma compra com mais de 100 itens");
		}
		return rep.save(c);
	}

	@Transactional
	public boolean deleteById(Long id) {
		if (rep.findById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}

	public List<Compra> findByCliente(Cliente c) {
		return rep.findByCliente(c);
	}

}
