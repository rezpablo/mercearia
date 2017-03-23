package br.com.mercearia.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import br.com.mercearia.dao.ProdutoDao;
import br.com.mercearia.model.Produto;

@ViewScoped
@Named(value="produtoController")
public class ProdutoController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ProdutoDao produtoDao = new ProdutoDao();	
    private Produto produto = new Produto();
      	
	public void salvarProduto() throws Exception {
		produtoDao.inserirProduto(produto);
	}
		
	 public Produto getProduto() {
			return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
	    
}
