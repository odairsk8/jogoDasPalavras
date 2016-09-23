package jogoDasPalavrasEmbaralhadas.Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import jogoDasPalavrasEmbaralhadas.Core.IEmbaralhador;
import jogoDasPalavrasEmbaralhadas.Embralhadores.*;

public class EmbaralhadoresTeste {

	IEmbaralhador _embaralhador;
	
	@Test
	public void EmbaralhadorAleatorioParOuImparTest() {
		
		_embaralhador = new EmbaralhadorAleatorioParOuImpar();
		String palavra = "camiseta";
		String paralvraEmbaralhada = _embaralhador.embralhar(palavra);
		
		assertEquals("tcamisea", paralvraEmbaralhada);
		
	}
	
	@Test
	public void EmbaralhadorPalavraInversaTest() {
		
		_embaralhador = new EmbaralhadorPalavraInversa();
		String palavra = "camiseta";
		String paralvraEmbaralhada = _embaralhador.embralhar(palavra);
		
		assertEquals("atesimac", paralvraEmbaralhada);
		
	}
	
	@Test
	public void EmbaralhadorVogaisPrimeiroTest() {
		
		_embaralhador = new EmbaralhadorVogaisPrimeiro();
		String palavra = "camiseta";
		String paralvraEmbaralhada = _embaralhador.embralhar(palavra);
		
		assertEquals("aeiacmst", paralvraEmbaralhada);
		
	}

}
