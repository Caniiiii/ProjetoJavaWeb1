package classesprojeto;

import java.util.Calendar;

import javax.validation.constraints.Future;

public class Item {
private int codigo;
private int numeroPlaqueta;
private Calendar dataDeCompra;
private String nomeItem;
private Fabricante fabricante;
private Calendar tempoGarantia;
private Categoria categoria;
private Unidade unidade;
private Departamento departamento;
private String responsavel;
private String observcao;
private String imagemProduto;
private String notaFiscalPdf;

public Item(int codigo, int numeroPlaqueta){
   this.codigo = codigo;
   this.numeroPlaqueta = numeroPlaqueta;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public int getNumeroPlaqueta() {
	return numeroPlaqueta;
}

public void setNumeroPlaqueta(int numeroPlaqueta) {
	this.numeroPlaqueta = numeroPlaqueta;
}

public Calendar getDataDeCompra() {
	return dataDeCompra;
}

public void setDataDeCompra(Calendar dataDeCompra) {
	this.dataDeCompra = dataDeCompra;
}

public String getNomeItem() {
	return nomeItem;
}

public void setNomeItem(String nomeItem) {
	this.nomeItem = nomeItem;
}

public Fabricante getFabricante() {
	return fabricante;
}

public void setFabricante(Fabricante fabricante) {
	this.fabricante = fabricante;
}

public Calendar getTempoGarantia() {
	return tempoGarantia;
}

public void setTempoGarantia(Calendar tempoGarantia) {
	this.tempoGarantia = tempoGarantia;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public Unidade getUnidade() {
	return unidade;
}

public void setUnidade(Unidade unidade) {
	this.unidade = unidade;
}

public Departamento getDepartamento() {
	return departamento;
}

public void setDepartamento(Departamento departamento) {
	this.departamento = departamento;
}

public String getResponsavel() {
	return responsavel;
}

public void setResponsavel(String responsavel) {
	this.responsavel = responsavel;
}

public String getObservcao() {
	return observcao;
}

public void setObservcao(String observcao) {
	this.observcao = observcao;
}

public String getImagemProduto() {
	return imagemProduto;
}

public void setImagemProduto(String imagemProduto) {
	this.imagemProduto = imagemProduto;
}

public String getNotaFiscalPdf() {
	return notaFiscalPdf;
}

public void setNotaFiscalPdf(String notaFiscalPdf) {
	this.notaFiscalPdf = notaFiscalPdf;
}



}
