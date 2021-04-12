package compras;

public class CompraResumo {

	private Long compraID;
	private String cliente;
	private String produto;
	private int quantidade;

	public Long getCompraID() {
		return compraID;
	}

	public void setCompraID(Long compraID) {
		this.compraID = compraID;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public CompraResumo(Long compraID, String cliente, String produto, int quantidade) {
		this.compraID = compraID;
		this.cliente = cliente;
		this.produto = produto;
		this.quantidade = quantidade;
	}

	public CompraResumo() {

	}

}
