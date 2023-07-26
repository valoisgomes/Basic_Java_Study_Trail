/*
 * Simulação do uso da classe MSNMessenger
 */

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagem;
import apps.Telegram;

public class ComputerUser {
	public static void main(String[] args) {
		
		ServicoMensagem smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}