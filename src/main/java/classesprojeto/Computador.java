package classesprojeto;

public class Computador extends Item {
    private String marca;
    private String modelo;
	public Computador(int codigo, int numeroPlaqueta) {
		super(codigo, numeroPlaqueta);
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
}
