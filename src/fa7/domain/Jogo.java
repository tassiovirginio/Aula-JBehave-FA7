package fa7.domain;

public class Jogo {

	private String senhaCorreta;

	public void setSenha(String senha) {
		this.senhaCorreta = senha;
	}

	public String ValidarSenha(String senhaInformada) {
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
			senha.contains("9") ||
			senha.contains("0"))
		{
			return true;
		}
		return false;
	}

}
