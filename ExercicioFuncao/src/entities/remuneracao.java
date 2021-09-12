package entities;

public class remuneracao 
{
		
		public String nome;
		public double sl;
		public double sb;
		public double imposto;


	
		public Double sl()
		{
			return sb - imposto;
		}
		public void addPorcentagem(double porcentagem) 
		{
			sb += sb * (porcentagem/100);
		}
		public String toString() 
		{
			return nome + ", $ " + String.format("%.2f", sl());
		}
}
