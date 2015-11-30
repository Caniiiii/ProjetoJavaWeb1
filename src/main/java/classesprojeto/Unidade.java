package classesprojeto;

public class Unidade {

private static boolean criado;
private String nomeUnidade;
private Endereco endereco;
private String observacao;

public Unidade(String nomeUnidade){
	this.nomeUnidade = nomeUnidade;
}

public static boolean isCriado() {
	return criado;
}

public static void setCriado(boolean criado) {
	Unidade.criado = criado;
}

public String getNomeUnidade() {
	return nomeUnidade;
}

public void setNomeUnidade(String nomeUnidade) {
	this.nomeUnidade = nomeUnidade;
}

public Endereco getEndereco() {
	return endereco;
}

public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}

public String getObservacao() {
	return observacao;
}

public void setObservacao(String observacao) {
	this.observacao = observacao;
}



}
