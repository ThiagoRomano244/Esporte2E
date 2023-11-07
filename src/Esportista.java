public class Esportista extends Pessoa {

    //Atributo
    private int idFederacao;

    //Construtores
    public Esportista(int idFederacao) {
        this.idFederacao = idFederacao;
    }

    public Esportista() {
    }

    public String sacar(){
        return "Sacando para o jogo...";
    }

}
