package compras.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ProdutoGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private ProdutoService produtoService;

	public Produto produto(Long id) {
		return produtoService.findById(id);

	}

	public List<Produto> produtos() {
		return produtoService.findAll();
	}

	@Transactional
	public Produto saveProduto(ProdutoInput input) {
		Produto p = new Produto();
		p.setId(input.getId());
		p.setNome(input.getNome());
		p.setValor(input.getValor());
		return produtoService.save(p);
	}

	@Transactional
	public boolean removeProduto(Long id) {
		return produtoService.deleteById(id);
	}
}
