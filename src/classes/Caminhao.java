package classes;

public class Caminhao extends Veiculo
{

	public Caminhao(String mar, String mod, String pla, String cor, float km, boolean ligado, int comb, int vel, double prec, int limit) 
	{
		super(mar, mod, pla, cor, km, ligado, comb, vel, prec, limit);
	}
	
	@Override
	public void ligar()
	{
		if(isLigado)
		{
			System.out.println("O caminhão já está ligado!");
		}
		else
		{
			System.out.println("O caminhão ligou.");
			this.isLigado = true;
		}
	}
	
	@Override
	public void desligar()
	{
		if(!isLigado)
		{
			System.out.println("O caminhão já está desligado!");
		}
		else
		{
			System.out.println("O caminhão desligou.");
			isLigado = false;
		}
	}
	
	
	@Override
	public void acelerar()
	{
		if(!isLigado)
			System.out.println("O caminhão está desligado.");
		else if(this.litrosCombustivel > 0)
		{
			this.Velocidade += 10;
			this.litrosCombustivel -= 2; 
			System.out.println("O caminhão está em " + this.Velocidade + " KM por hora.");
			System.out.println("O caminhão tem " + this.litrosCombustivel + " litros de combustível");
		}
		else
		{
			System.out.println("O caminhão etá sem combustível!");
			this.isLigado = false;
			this.Velocidade = 0;
		}
	}
	
	@Override
	public void frear()
	{
		if(this.isLigado && this.Velocidade > 0)
		{
			if(this.Velocidade < 10)
			{
				this.Velocidade = 0;
				System.out.println("O caminhão parou.");
			}
			else
			{
				this.Velocidade -= 10;
				System.out.println("A velocidade do caminhão é de " + this.Velocidade + " KM por hora.");
			}
		}
		else
		{
			System.out.println("O caminhão está parado.");
		}
	}

	public void abastecer(float qtdLitros) {
		
		int change;
		int dif = 0;
		change = (int)qtdLitros;
			
		if(this.litrosCombustivel + change > tanqueLimite)
		{
			dif = tanqueLimite - this.litrosCombustivel;
			this.litrosCombustivel = tanqueLimite;
			System.out.println("Você tentou abastecer " + change + " litros, porém você abasteceu apenas " + dif + " litros,\n pois seu tanque encheu, agora você tem " + this.litrosCombustivel + " litros.");
		}
		else
		{
			litrosCombustivel += change;
			System.out.println("Você abasteceu " + change + " litros, seu tanque agora tem " + litrosCombustivel + " litros.");
		}
		
	}
	
	@Override
	public void pintar(String corNova)
	{
		this.Cor = corNova;
		System.out.println("Você pintou seu caminhão com a cor " + this.Cor + ".");
	}
}
