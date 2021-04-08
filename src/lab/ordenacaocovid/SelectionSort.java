package lab.ordenacaocovid;

import java.util.Arrays;

public class SelectionSort {
    public static void ordenarPorObitos(CovidData[] vector) {
        int vectorSize = vector.length;
        for (int i=0; i < vectorSize; i++) {
            CovidData currentCovidDataToOrder = vector[i];
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vectorSize; j++) {
                if(vector[j].getMortes() < vector[nextCovidDataOfSearch].getMortes()) {
                    lowestCovidDataIndex = j;
                }
            }
            vector[i] = vector[lowestCovidDataIndex];
            vector[lowestCovidDataIndex] = currentCovidDataToOrder;
        }
    }

    public static void ordenarPorCasos(CovidData[] vector) {
        int vectorSize = vector.length;
        for (int i=0; i < vectorSize; i++) {
            CovidData currentCovidDataToOrder = vector[i];
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vectorSize; j++) {
                if(vector[j].getCasosConfirmados() < vector[nextCovidDataOfSearch].getCasosConfirmados()) {
                    lowestCovidDataIndex = j;
                }
            }
            vector[i] = vector[lowestCovidDataIndex];
            vector[lowestCovidDataIndex] = currentCovidDataToOrder;
        }
    }

    public static void ordenarPorNomeDasCidades(CovidData[] vector) {
        int vectorSize = vector.length;
        for (int i=0; i < vectorSize; i++) {
            CovidData currentCovidDataToOrder = vector[i];
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vectorSize; j++) {
                if((vector[j].getCidade().compareTo(vector[nextCovidDataOfSearch].getCidade())) < 0) {
                    lowestCovidDataIndex = j;
                }
            }
            vector[i] = vector[lowestCovidDataIndex];
            vector[lowestCovidDataIndex] = currentCovidDataToOrder;
        }
    }

}
