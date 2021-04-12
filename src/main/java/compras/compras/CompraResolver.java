package compras.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import compras.cliente.Cliente;
import compras.cliente.ClienteService;
import compras.produto.Produto;
import compras.produto.ProdutoService;

@Component
public class CompraResolver implements GraphQLResolver<Compra> {

	@Autowired
	private ClienteService cService;

	@Autowired
	private ProdutoService pService;

	public String status(Compra c) {
		return "Teste: " + c.getStatus();
	}

	public Cliente cliente(Compra c) {
		return cService.findById(c.getCliente().getId());
	}

	public Produto produto(Compra c) {
		return pService.findById(c.getProduto().getId());
	}

}
