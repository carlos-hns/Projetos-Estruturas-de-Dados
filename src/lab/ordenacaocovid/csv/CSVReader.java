package lab.ordenacaocovid.csv;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static Vector<CovidData> lerDados(String caminho) {
        String linha = "";
        boolean isFirstLine = true;
        Vector<CovidData> data = new Vector<CovidData>(1);

        try {
            FileReader fileReader = new FileReader(caminho);
            BufferedReader reader = new BufferedReader(fileReader);
            while((linha = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                data.add(new CovidData(linha));
            }
            reader.close();
            fileReader.close();
        } catch (FileNotFoundException error) {
            System.err.println("Não foi possível encontrar o arquivo.");
        } catch (IOException error) {
            System.err.println("Erro ao ler linha.");
        }
        return data;
    }
}
