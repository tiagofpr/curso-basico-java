package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá Pessoal".charAt(2));
        //a partir de um valor literal, conseguimos chamar as funcionalidades das Srtring.
        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.printf(s + "!!!");
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        System.out.println(s.toLowerCase().startsWith("boa"));//false
        System.out.println(s.length());//true
        System.out.println(s.endsWith("tarde"));//9
        System.out.println(s.equals("boa tarde"));//false
        System.out.println(s.equalsIgnoreCase("boa Tarde"));// true

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: "+ nome + "\nSobrenome: " + sobrenome + "\nIdade: " + "\nSalario: " + salario;
        System.out.println(maisUmaFrase);
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f" , nome, sobrenome , idade , salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f" , nome, sobrenome , idade , salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qaual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6,10));

    }
}
