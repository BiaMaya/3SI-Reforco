import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class geraMensagemTest {

	@Test
	void testMensagemGerar() {
		String mensagemEsperada = "Bem vindos, todos voc�s!";
		MensagemPadrao mensagem = new MensagemPadrao(mensagemEsperada);

		String mensagemFinal = mensagem.geraMensagem();
		assertEquals(mensagemEsperada, mensagemFinal);
	}

}
