package lab.ordenacaocovid.csv;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

public class CSVCleaner {
     public static Vector<CovidData> filtrarDados(Vector<CovidData> dados) {
         Vector<CovidData> filteredData = new Vector<CovidData>(dados.size());
         int indexOfDataFiltered = 0;
         for (int i = 0; i < dados.size(); i++) {
             if(dados.findWithIndex(i).isDadoAtualizado() && dados.findWithIndex(i).getTipoDoLugar().equals("city")) {
                 filteredData.add(dados.findWithIndex(i), indexOfDataFiltered);
                 indexOfDataFiltered++;
             }
         }
         return filteredData;
    }
}

