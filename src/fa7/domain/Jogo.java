package fa7.domain;

public class Jogo {

	private String senhaCorreta;
	private String nomeJogador;

	public void setSenha(String senha) {
		this.senhaCorreta = senha;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public String ValidarSenha(String senhaInformada) {
		
		if(senhaInformada.equals("0000"))
		{
			return "Até a próxima!";
		}
		
		if(senhaInformada.equals(senhaCorreta)){
			return "Parabéns, " + nomeJogador + " você quebrou a senha!";
		}
		
		if (ContemCaracterInvalido(senhaInformada))
		{
			return "Dígito Inválido!!";
		}
		
		String contraSenha = "";
		for (int i=0; i<4;i++){
			int estadoValidacao = ValidaCaracter(senhaInformada, i);
			if (estadoValidacao > 0)
			{
				contraSenha = "+" + contraSenha;
			}
			else if (estadoValidacao == 0)
			{
				contraSenha = contraSenha + "/";
			}
		}
		
		while (contraSenha.length() != 4)
		{
			contraSenha = contraSenha + "-";
		}
				
		return contraSenha;
	}
	
	private int ValidaCaracter(String senhaInformada, int indice) {
		char charValue = senhaInformada.charAt(indice);
		if (senhaCorreta.charAt(indice) == charValue)
		{
			return 1;
		}
		else if (senhaCorreta.contains(charValue + ""))
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}

	private boolean ContemCaracterInvalido(String senha)
	{
		if (senha.contains("5") || 
			senha.contains("6") ||
			senha.contains("7") ||
			senha.contains("8") ||
			senha.contains("9"))
		{
			return true;
		}
		return false;
	}

}
