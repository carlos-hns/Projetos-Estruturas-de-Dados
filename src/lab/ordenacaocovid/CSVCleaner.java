package lab.ordenacaocovid;

public class CSVCleaner {
     public static CovidData[] filtrarDados(CovidData[] dados){
      CovidData[] filteredData = new CovidData[dados.length];
      int indexOfDataFiltered = 0;

      for (int i = 0; i < dados.length; i++){
        if(dados[i].isDadoAtualizado()){
          filteredData[indexOfDataFiltered] = dados[i];
          indexOfDataFiltered++;
        }
      }
      return filteredData;
    }
}

