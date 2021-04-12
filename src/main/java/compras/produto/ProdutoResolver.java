package compras.produto;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class ProdutoResolver implements GraphQLResolver<Produto> {

	public String valorReais(Produto p) {
		return "R$ " + p.getValor();
	}

}
