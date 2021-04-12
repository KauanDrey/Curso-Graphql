package compras.cliente;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class ClienteGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

	@Autowired
	private ClienteService clienteService;

	public Cliente cliente(Long id) {
		return clienteService.findById(id);
	}

	public List<Cliente> clientes() {
		return clienteService.findAll();

	}

	@Transactional
	public Cliente saveCliente(ClienteInput input) {

		Cliente c = new Cliente();
		c.setId(input.getId());
		c.setNome(input.getNome());
		c.setEmail(input.getEmail());
		return clienteService.save(c);

	}

	@Transactional
	public Boolean removeCliente(Long id) {
		return clienteService.deleteById(id);

	}
}