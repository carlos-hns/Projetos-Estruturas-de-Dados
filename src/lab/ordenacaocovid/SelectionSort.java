package lab.ordenacaocovid;

import java.util.Arrays;

public class SelectionSort {
    public static void ordenarPorObitos(CovidData[] vector) {
        int vectorSize = vector.length;
        for (int i = 0; i < vectorSize; i++) {
            CovidData currentCovidDataToOrder = vector[i];
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vectorSize; j++) {
                if(vector[j].getMortes() < vector[lowestCovidDataIndex].getMortes()) {
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
                if(vector[j].getCasosConfirmados() < vector[lowestCovidDataIndex].getCasosConfirmados()) {
                    lowestCovidDataIndex = j;
                }
            }
            vector[i] = vector[lowestCovidDataIndex];
            vector[lowestCovidDataIndex] = currentCovidDataToOrder;
        }
    }

    public static void ordenarPorNomeDasCidades(CovidData[] vector) {
        int firstCharWithAccent = 192;
        int vectorSize = vector.length;
        for (int i=0; i < vectorSize; i++) {
            CovidData currentCovidDataToOrder = vector[i];
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vectorSize; j++) {
                int lowestElementFirstChar = (int) vector[lowestCovidDataIndex].getCidade().charAt(0);
                int currentSearchingElementFirstChar = (int) vector[j].getCidade().charAt(0);
                if (currentSearchingElementFirstChar > lowestElementFirstChar && currentSearchingElementFirstChar >= firstCharWithAccent) {
                    lowestCovidDataIndex = j;
                } else {
                    if(lowestElementFirstChar >= firstCharWithAccent) {
                        continue;
                    } else if ((vector[j].getCidade().compareTo(vector[lowestCovidDataIndex].getCidade())) < 0) {
                        lowestCovidDataIndex = j;
                    }
                }
            }
            vector[i] = vector[lowestCovidDataIndex];
            vector[lowestCovidDataIndex] = currentCovidDataToOrder;
        }
    }

}
