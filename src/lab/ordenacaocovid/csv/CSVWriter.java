package lab.ordenacaocovid.csv;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    public static void escreverDados(Vector<CovidData> dados, String caminhoParaSalvar, String cabecalho) {
        try {
            File arquivo = new File(caminhoParaSalvar);
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(cabecalho);

            for(int i = 0; i < dados.size(); i++) {
                String covidDataEmString = CSVWriter.juntarDadosEFormatar(dados.findWithIndex(i));
                writer.write(covidDataEmString);
            }
            writer.close();
            fileWriter.close();
        } catch (IOException error) {
            System.err.println("Erro ao escrever linha.");
        }
    }

    private static String juntarDadosEFormatar(CovidData dados) {
        StringBuilder builder = new StringBuilder();
        builder.append(dados.getData() + ",");
        builder.append(dados.getEstado() + ",");
        builder.append(dados.getCidade() + ",");
        builder.append(dados.getTipoDoLugar() + ",");
        builder.append(dados.getCasosConfirmados() + ",");
        builder.append(dados.getMortes() + ",");
        builder.append(dados.getOrderForPlace() + ",");
        builder.append((dados.isDadoAtualizado() ? "True" : "False") + ",");
        builder.append(dados.getPopulacaoEstimada2019() + ",");
        builder.append(dados.getPopulacaoEstimada() + ",");
        builder.append(dados.getIbgeCode() + ",");
        builder.append(dados.getConfirmados100MilHabitantes() + ",");
        builder.append(dados.getTaxaDeMorte() + "\n");
        return builder.toString();
    }

}
