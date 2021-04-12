package compras.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

import compras.compras.Compra;
import compras.compras.CompraService;

@Component
public class ClienteResolver implements GraphQLResolver<Cliente>{

	@Autowired
	CompraService cService;
	
	
	public List<Compra> compras(Cliente c){
		return cService.findByCliente(c);
	}
	
	
}
