package lab.ordenacaocovid;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    static CovidData[] lerDados(String caminho) {
        List<CovidData> data = new ArrayList<CovidData>();
        try {
            FileReader fileReader = new FileReader(caminho);
            BufferedReader reader = new BufferedReader(fileReader);

            String linha = "";
            boolean isFirstLine = true;
            while((linha = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                data.add(new CovidData(linha));
            }
            reader.close();
        } catch (FileNotFoundException error) {
            System.err.println("Não foi possível encontrar o arquivo.");
        } catch (IOException error) {
            System.err.println("Erro ao ler linha.");
        }
        return data.toArray(new CovidData[0]);
    }
}
