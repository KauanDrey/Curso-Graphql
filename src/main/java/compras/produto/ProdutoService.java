package compras.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository rep;
	
	public Produto findById(Long id) {
		return rep.findById(id).orElse(null);

	}

	public List<Produto> findAll() {
		return rep.findAll();
	}

	@Transactional
	public Produto save(Produto p) {
		return rep.save(p);
	}

	@Transactional
	public boolean deleteById(Long id) {
		if (rep.findById(id).isPresent()) {
			rep.deleteById(id);
			return true;
		}
		return false;
	}
	
	
}
