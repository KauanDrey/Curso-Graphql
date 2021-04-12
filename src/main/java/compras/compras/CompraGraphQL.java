package compras.compras;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import compras.cliente.ClienteService;
import compras.produto.ProdutoService;

@Component
public class CompraGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	CompraService compraService;

	@Autowired
	ProdutoService produtoService;

	@Autowired
	ClienteService clienteService;

	public Compra compra(Long id) {
		return compraService.findById(id);
	}

	public List<Compra> compras(int page, int size) {
		Pageable pageable = PageRequest.of(page, size);
		return compraService.findAll(pageable);
	}

	@Transactional
	public Compra saveCompra(CompraInput input) {
		ModelMapper m = new ModelMapper();
		Compra c = m.map(input, Compra.class);
		c.setData(new Date());
		c.setStatus(input.getStatus());
		c.setCliente(clienteService.findById(input.getClienteId()));
		c.setProduto(produtoService.findById(input.getProdutoId()));

		return compraService.save(c);
	}

	@Transactional
	public boolean removeCompra(Long id) {
		return compraService.deleteById(id);
	}

}
