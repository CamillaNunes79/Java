package Orienta�aoaObjeto;

public class ModeloCliente {

	public String Nome;
	public int Idade;
	public double Sal�rio;
	public boolean Comprou; 
	
	
	public void status()
	{
		
		if(this.Comprou==true)
			System.out.println("Cliente n�o comprou");
		else
			System.out.println("Compra realizada com sucesso");
	}
	
	public void comprou()
	{
		this.Comprou=true;
	}
	
	public void n�ocomprou()
	{
		this.Comprou=false;
	}
	
   
    public void estadoAtual()
	{
		System.out.println("Nome: "+this.Nome);
		System.out.println("Idade: "+this.Idade);
		System.out.println("Comprou? "+this.Comprou);
		System.out.println("Compra realizada com sucesso!"+this.Comprou);
	}
	
		
		
	}


	
	
