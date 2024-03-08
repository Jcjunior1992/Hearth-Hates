package HeartRates;

import java.time.LocalDate;
import java.time.Period;
public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getdiaNascimento() {
        return diaNascimento;}
        public void setDiaNascimento(int diaNascimento)
        {this.diaNascimento = diaNascimento;}




    public int getmesNascimento(int i) {
        return mesNascimento;
    }


    public void setmesNascimento(int mesNascimento) {
            this.mesNascimento = mesNascimento;
        }

    public int getanoNascimento() {
        return anoNascimento;
    }

    public void setanoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        return Period.between(dataNascimento, hoje).getYears();
    }

    public int calcularFrequenciaCardiacaMaxima() {
        int idade = calcularIdade();
        return 220 - idade;
    }

    public String calcularFrequenciaCardiacaAlvo() {
        int frequenciaMaxima = calcularFrequenciaCardiacaMaxima();
        int frequenciaAlvoMinima = (int) (frequenciaMaxima * 0.5); // 50% da frequência máxima
        int frequenciaAlvoMaxima = (int) (frequenciaMaxima * 0.85); // 85% da frequência máxima
        return frequenciaAlvoMinima + " - " + frequenciaAlvoMaxima + " batimentos por minuto";
    }

     public int getanoNascimento(int anoNascimento) {
        return anoNascimento;
    }
}

