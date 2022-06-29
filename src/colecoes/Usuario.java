package colecoes;

import java.util.Objects;

public class Usuario {

    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome é " + this.nome + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    //Posso usar uma implementação mais simples
 /*   @Override
    public int hashCode(){
        return 0;
    }

    @Override
    public boolean equals(Object o){
        Usuario outroUsuario = (Usuario) o;
        return this.nome.equals(outroUsuario);
    }*/
}
