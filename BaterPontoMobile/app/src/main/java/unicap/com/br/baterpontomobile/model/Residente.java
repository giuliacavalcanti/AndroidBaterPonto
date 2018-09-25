package unicap.com.br.baterpontomobile.model;


/**
 * Created by Aluno on 20/09/2018.
 */

public class Residente {
    private String matricula;
    private String nome;
    private String token;
    private String senha;
    private String tipo;


    public Residente(){

    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getToken() {
        return token;
    }
    public String getSenha() {
        return senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

