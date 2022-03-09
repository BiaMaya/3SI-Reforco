
public class MensagemPadrao {

	private String mensagemAbertura;

	public String getMensagemAbertura() {
		return mensagemAbertura;
	}

	public void setMensagemAbertura(String mensagemAbertura) {
		this.mensagemAbertura = mensagemAbertura;
	}

	public MensagemPadrao(String mensagemAbertura) {
		this.mensagemAbertura = mensagemAbertura;
	}

	public String geraMensagem() {
		mensagemAbertura = "Bem vindos, todos vocês!";
		return mensagemAbertura;
	}

}
