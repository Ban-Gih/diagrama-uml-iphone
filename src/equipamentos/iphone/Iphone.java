package equipamentos.iphone;

import equipamentos.internete.NavegadorInternete;
import equipamentos.musicas.ReprodutorMusical;
import equipamentos.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternete, ReprodutorMusical, AparelhoTelefonico{

	public void ligar() {
		System.out.println("REALIZANDO LIGACAO VIA IPHONE");
	}
	public void atender() {
		System.out.println("ATENDENDO LIGACAO VIA IPHONE");
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");
	}
	public void tocar() {
		System.out.println("TOCANDO MUSICA VIA IPHONE");
	}
	public void pausar() {
		System.out.println("PAUSANDO MUSICA VIA IPHONE");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MUSICA VIA IPHONE");
	}
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA NAVEGADOR VIA IPHONE");
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA PAGINA NO NAVEGADOR VIA IPHONE");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA NAVEGADOR VIA IPHONE");
	}

}
