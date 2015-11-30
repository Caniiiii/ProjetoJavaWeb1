package classesprojeto;
 public class Fabricante {
private String nomeFabricante;
private Endereco endereco;
private String telefone;
private String site;
private String observacao;

public Fabricante(){
	
}
public String getNomeFabricante() {
	return nomeFabricante;
}
public void setNomeFabricante(String nomeFabricante) {
	this.nomeFabricante = nomeFabricante;
}
public Endereco getEndereco() {
	return endereco;
}
public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getSite() {
	return site;
}
public void setSite(String site) {
	this.site = site;
}
public String getObservacao() {
	return observacao;
}
public void setObservacao(String observacao) {
	this.observacao = observacao;
}


}
