package classes;

public class Carro extends Veiculo
{

	public Carro(String mar, String mod, String pla, String cor, float km, boolean ligado, int comb, int vel, double prec, int limit) 
	{
		super(mar, mod, pla, cor, km, ligado, comb, vel, prec, limit);
	}
	
	@Override
	public void ligar()
	{
		if(isLigado)
		{
			System.out.println("O carro já está ligado!");
		}
		else
		{
			System.out.println("O carro ligou.");
			this.isLigado = true;
		}
	}
	
	@Override
	public void desligar()
	{
		if(!isLigado)
		{
			System.out.println("O carro já está desligado!");
		}
		else
		{
			System.out.println("O carro desligou.");
			isLigado = false;
		}
	}
	
	@Override
	public void acelerar()
	{
		if(!isLigado)
			System.out.println("O carro está desligado.");
		else if(this.litrosCombustivel > 0)
		{
			this.Velocidade += 20;
			this.litrosCombustivel -= 1; 
			System.out.println("O carro está em " + this.Velocidade + " KM por hora.");
			System.out.println("O carro tem " + this.litrosCombustivel + " litros de combustível");
		}
		else
		{
			System.out.println("O carro etá sem combustível!");
			this.isLigado = false;
			this.Velocidade = 0;
		}
	}
	
	@Override
	public void frear()
	{
		if(this.isLigado && this.Velocidade > 0)
		{
			if(this.Velocidade < 20)
			{
				this.Velocidade = 0;
				System.out.println("O carro parou.");
			}
			else
			{
				this.Velocidade -= 20;
				System.out.println("A velocidade do carro é de " + this.Velocidade + " KM por hora.");
			}
		}
		else
		{
			System.out.println("O carro está parado.");
		}
	}
	
	@Override
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
	
	@Override
	public void pintar(String corNova)
	{
		this.Cor = corNova;
		System.out.println("Você pintou seu carro com a cor " + this.Cor + ".");
	}
	
}
