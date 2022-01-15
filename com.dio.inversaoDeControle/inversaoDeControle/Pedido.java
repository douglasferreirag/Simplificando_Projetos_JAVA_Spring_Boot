package inversaoDeControle;

public class Pedido {

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido = new Pedido();
		
		pedido.gravar();

	}
	
	private EnviarEmails enviar = EnviarEmails.obterDadosEmail();
	
	public void gravar() {
		
		
			this.enviar.retornar("Pedido criado!");
			
			
	}

}
