import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class geraMensagemTest {

	@Test
	void testMensagemGerar() {
		String mensagemEsperada = "Bem vindos, todos vocês!";
		MensagemPadrao mensagem = new MensagemPadrao(mensagemEsperada);

		String mensagemFinal = mensagem.geraMensagem();
		assertEquals(mensagemEsperada, mensagemFinal);
	}

}
