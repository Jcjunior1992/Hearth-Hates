package HeartRates;

public class HeartRatesTest {
    public static void main(String[] args) {

        HeartRates pessoa = new HeartRates("fernanda", "ramos", 20, 8, 1992);

        System.out.println("Nome: " + pessoa.getnome() + " " + pessoa.getsobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getdiaNascimento() + "/" + pessoa.getmesNascimento(03) + "/" + pessoa.getanoNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade() + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaCardiacaMaxima() + " batimentos por minuto");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaCardiacaAlvo());
    }
}
