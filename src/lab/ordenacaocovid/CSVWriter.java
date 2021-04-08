package lab.ordenacaocovid;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter {
    static void escreverDados(CovidData[] dados, String caminhoParaSalvar) {
        try {
            File arquivo = new File(caminhoParaSalvar);
            FileWriter fileReader = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileReader);

            writer.write("date,state,city,place_type,confirmed,deaths,is_last,estimated_population,city_ibge_code,confirmed_per_100k_inhabitants,death_rate\n");

            for (CovidData dado : dados) {
                String dadosEmString = CSVWriter.juntarDadosEFormatar(dado);
                writer.write(dadosEmString);
            }
            writer.close();
        } catch (IOException error) {
            System.err.println("Erro ao ler linha.");
        }
    }

    static private String juntarDadosEFormatar(CovidData dados) {
        StringBuilder builder = new StringBuilder();
        builder.append(dados.getData() + ",");
        builder.append(dados.getEstado() + ",");
        builder.append(dados.getCidade() + ",");
        builder.append(dados.getTipoDoLugar() + ",");
        builder.append(dados.getCasosConfirmados() + ",");
        builder.append(dados.getMortes() + ",");
        builder.append((dados.isDadoAtualizado() ? "True" : "False") + ",");
        builder.append(dados.getPopulacaoEstimada() + ",");
        builder.append(dados.getIbgeCode() + ",");
        builder.append(dados.getConfirmados100MilHabitantes() + ",");
        builder.append(dados.getTaxaDeMorte() + "\n");
        return builder.toString();
    }

}
