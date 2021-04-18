package lab.ordenacaocovid;

public class CSVCleaner {
     public static covidData[] filtrarDados(CovidData[] dados){
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
/*
criar um funçao pra filtrar
passa array e retorna outro array com os dados filtrados

Você deve tratar apenas com os dados mais atuais (tem um campo chamado "É a última atualização?" ou "is_last" que deve eestar marcado como True). Valores antigos não interessam

Gerar um arquivo formatado para ser processado na próxima fase

*/
