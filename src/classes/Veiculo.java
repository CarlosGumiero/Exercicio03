package classes;

public abstract class Veiculo 
{
	protected String Marca;
	protected String Modelo;
	protected String Placa;
	protected String Cor;
	protected float Km;
	protected boolean isLigado;
	protected int litrosCombustivel;
	protected int Velocidade;
	protected double Preco;
	protected int tanqueLimite;
	
	public Veiculo(String mar, String mod, String pla, String cor, float km, boolean ligado, int comb, int vel, double prec, int limit)
	{
		this.setMarca(mar);
		this.setModelo(mod);
		this.setPlaca(pla);
		this.setCor(cor);
		this.setKm(km);
		this.setLigado(ligado);
		this.setLitrosCombustivel(comb);
		this.setVelocidade(0);
		this.setPreco(prec);
		this.setTanqueLimite(limit);
	}
	
	
	public void status()
	{
		System.out.println("Marca: " + this.getMarca());
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Km: " + this.getKm());
		System.out.println("Está ligado: " + this.isLigado());
		System.out.println("Combustivel (litros): " + this.getLitrosCombustivel());
		System.out.println("Velocidade: " + this.getVelocidade());
		System.out.println("Preço: " + this.getPreco());
	}
	
	public abstract void ligar();
	public abstract void desligar();
	public abstract void pintar(String corNova);
	public abstract void acelerar();
	public abstract void frear();
	
	public void abastecer(int qtdLitros) 
	{
		int dif = 0;
		if(this.litrosCombustivel + qtdLitros > 100)
		{
			dif = 100 - this.litrosCombustivel;
			this.litrosCombustivel = 100;
			System.out.println("Você tentou abastecer " + qtdLitros + " litros, porém você abasteceu apenas " + dif + " litros,\n pois seu tanque encheu, agora você tem " + this.litrosCombustivel + " litros.");
		}
		else
		{
			litrosCombustivel += qtdLitros;
			System.out.println("Você abasteceu " + qtdLitros + " litros, seu tanque agora tem " + litrosCombustivel + " litros.");
		}
	}
	
	
	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public float getKm() {
		return Km;
	}

	public void setKm(float km) {
		Km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return Velocidade;
	}

	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		Preco = preco;
	}


	public int getTanqueLimite() {
		return tanqueLimite;
	}

	public void setTanqueLimite(int tanqueLimite) {
		this.tanqueLimite = tanqueLimite;
	}
	
	
	
}