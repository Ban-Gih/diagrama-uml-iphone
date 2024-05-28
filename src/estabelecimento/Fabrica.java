package estabelecimento;

import equipamentos.internete.NavegadorInternete;
import equipamentos.iphone.Iphone;
import equipamentos.musicas.ReprodutorMusical;
import equipamentos.telefone.AparelhoTelefonico;

public class Fabrica {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		ReprodutorMusical musica = new Iphone();
		AparelhoTelefonico telefone = new Iphone();
		NavegadorInternete navegador = new Iphone();		
		
		System.out.println("Musica");
        musica.selecionarMusica();
        musica.tocar();
        musica.pausar();
        
        System.out.println("Telefone");
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();

        System.out.println("Internete");
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
	}
}
