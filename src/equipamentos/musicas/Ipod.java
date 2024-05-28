package equipamentos.musicas;

public class Ipod implements ReprodutorMusical{

	public void tocar() {
		System.out.println("TOCANDO MUSICA");
	}
	public void pausar() {
		System.out.println("MUSICA PAUSADA");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONADO MUSICA");
	}

}
