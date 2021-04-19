package lab.ordenacaocovid;

public class CovidData {

    private String data;
    private String estado;
    private String cidade;
    private String tipoDoLugar;
    private int casosConfirmados;
    private int mortes;
    private boolean dadoAtualizado;
    private int populacaoEstimada;
    private int ibgeCode;
    private double confirmados100MilHabitantes;
    private double taxaDeMorte;

    private static final int dataIndex = 0;
    private static final int estadoIndex = 1;
    private static final int cidadeIndex = 2;
    private static final int tipoDoLugarIndex = 3;
    private static final int casosConfirmadorIndex = 4;
    private static final int mortesIndex = 5;
    private static final int dadoAtualizadoIndex = 6;
    private static final int populacaoEstimadaIndex = 7;
    private static final int ibgeCodeIndex = 8;
    private static final int confirmados100MilHabitantesIndex = 9;
    private static final int taxaDeMorteIndex = 10;

    public CovidData() {}
    public CovidData(String CVSLine) {
        this.setarAtributos(CVSLine);
    }

    private void setarAtributos(String CSVLine) {
        String[] colunas = separarColunas(CSVLine);
        this.data = colunas[dataIndex];
        this.estado = colunas[estadoIndex];
        this.cidade = colunas[cidadeIndex];
        this.tipoDoLugar = colunas[tipoDoLugarIndex];
        this.casosConfirmados = !colunas[casosConfirmadorIndex].equals("") ? Integer.parseInt(colunas[casosConfirmadorIndex]) : 0;
        this.mortes = !colunas[mortesIndex].equals("") ? Integer.parseInt(colunas[mortesIndex]): 0;
        this.dadoAtualizado = colunas[dadoAtualizadoIndex].equals("True");
        this.populacaoEstimada = !colunas[populacaoEstimadaIndex].equals("") ? Integer.parseInt(colunas[populacaoEstimadaIndex]) : 0;
        this.ibgeCode = !colunas[ibgeCodeIndex].equals("") ? Integer.parseInt(colunas[ibgeCodeIndex]) : 0;
        this.confirmados100MilHabitantes = !colunas[confirmados100MilHabitantesIndex].equals("") ? Double.parseDouble(colunas[confirmados100MilHabitantesIndex]) : 0;
        this.taxaDeMorte = !colunas[taxaDeMorteIndex].equals("") ? Double.parseDouble(colunas[taxaDeMorteIndex]) : 0;
    }

    private String[] separarColunas(String CSVLine) {
        return CSVLine.split(",");
    }

    public String getData() {
        return data;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTipoDoLugar() {
        return tipoDoLugar;
    }

    public int getCasosConfirmados() {
        return casosConfirmados;
    }

    public int getMortes() {
        return mortes;
    }

    public boolean isDadoAtualizado() {
        return dadoAtualizado;
    }

    public int getPopulacaoEstimada() {
        return populacaoEstimada;
    }

    public int getIbgeCode() {
        return ibgeCode;
    }

    public double getConfirmados100MilHabitantes() {
        return confirmados100MilHabitantes;
    }

    public double getTaxaDeMorte() {
        return taxaDeMorte;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCasosConfirmados(int casosConfirmados) {
        this.casosConfirmados = casosConfirmados;
    }

    public void setMortes(int mortes) {
        this.mortes = mortes;
    }

    @Override
    public String toString() {
        return "CovidData{" +
                "cidade='" + cidade + '\'' +
                ", casosConfirmados=" + casosConfirmados +
                ", mortes=" + mortes +
                '}';
    }
}
