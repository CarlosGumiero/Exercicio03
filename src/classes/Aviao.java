package classes;

public class Aviao extends Veiculo
{

	public Aviao(String mar, String mod, String pla, String cor, float km, boolean ligado, int comb, int vel, double prec, int limit) 
	{
		super(mar, mod, pla, cor, km, ligado, comb, vel, prec, limit);
	}
	
	@Override
	public void ligar()
	{
		if(isLigado)
		{
			System.out.println("O avi�o j� est� ligado!");
		}
		else
		{
			System.out.println("O avi�o ligou.");
			this.isLigado = true;
		}
	}
	
	@Override
	public void desligar()
	{
		if(!isLigado)
		{
			System.out.println("O avi�o j� est� desligado!");
		}
		else
		{
			System.out.println("O avi�o desligou.");
			isLigado = false;
		}
	}
	
	
	@Override
	public void acelerar()
	{
		if(!isLigado)
			System.out.println("O avi�o est� desligado.");
		else if(this.litrosCombustivel > 0)
		{
			this.Velocidade += 200;
			this.litrosCombustivel -= 20; 
			System.out.println("O avi�o est� em " + this.Velocidade + " KM por hora.");
			System.out.println("O avi�o tem " + this.litrosCombustivel + " litros de combust�vel");
		}
		else
		{
			System.out.println("O avi�o et� sem combust�vel!");
			this.isLigado = false;
			this.Velocidade = 0;
		}
	}
	
	@Override
	public void frear()
	{
		if(this.isLigado && this.Velocidade > 0)
		{
			if(this.Velocidade < 200)
			{
				this.Velocidade = 0;
				System.out.println("O avi�o parou.");
			}
			else
			{
				this.Velocidade -= 200;
				System.out.println("A velocidade do avi�o � de " + this.Velocidade + " KM por hora.");
			}
		}
		else
		{
			System.out.println("O avi�o est� parado.");
		}
	}
	
	public void abastecer(String qtdLitros) 
	{
		int change;
		int dif = 0;
		change = Integer.parseInt(qtdLitros);
		
		if(this.litrosCombustivel + change > tanqueLimite)
		{
			dif = tanqueLimite - this.litrosCombustivel;
			this.litrosCombustivel = tanqueLimite;
			System.out.println("Voc� tentou abastecer " + change + " litros, por�m voc� abasteceu apenas " + dif + " litros,\n pois seu tanque encheu, agora voc� tem " + this.litrosCombustivel + " litros.");
		}
		else
		{
			litrosCombustivel += change;
			System.out.println("Voc� abasteceu " + change + " litros, seu tanque agora tem " + litrosCombustivel + " litros.");
		}
	}
	
	@Override
	public void pintar(String corNova)
	{
		this.Cor = corNova;
		System.out.println("Voc� pintou seu avi�o com a cor " + this.Cor + ".");
	}
	
}
