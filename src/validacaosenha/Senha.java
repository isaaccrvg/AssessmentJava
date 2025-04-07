package validacaosenha;

public class Senha {

    private String senha;


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception{
        this.senha = senha;
        if (senha.length() < 8){
            throw new Exception("Error: A senha deve ter no mínimo 8 caracteres.");
        }if (!senha.matches(".*[A-Z].*")){
            throw new Exception("Erro: A senha deve conter pelo menos uma letra maiúscula.");
        }if (!senha.matches(".*[0-9].*")){
            throw new Exception("Erro: A senha deve conter pelo menos um número.");
        }if (!senha.matches(".*[@#$%^&].*")){
            throw new Exception("Erro: A senha deve conter pelo menos um caractere especial.");
        }
    }
}


