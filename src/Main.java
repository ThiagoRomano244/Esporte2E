public class Main {
    public static void main(String[] args) {
        Pessoa qualquer = new Pessoa();
        // Encapsulamento
        qualquer.setNome("Raissa Leal"); // atribuição
        System.out.println(qualquer.getNome()); // saída de dados
        Esportista jogadora = new Esportista();
        Esportista Surfista = new Esportista(345);
        jogadora.setNome("Marta");
        System.out.println(jogadora.getNome());
        //Polimorfismo
        qualquer = new Esportista();
        String resultado = qualquer.sacar();
        System.out.println(resultado);
        qualquer = new Pessoa();
        resultado = qualquer.sacar();
        System.out.println(resultado);

    }
}