package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

public class SelectionSort {
    public static void ordenarPorObitos(Vector<CovidData> vector) {
        for (int i = 0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {
                if(vector.findWithIndex(j).getMortes() < vector.findWithIndex(lowestCovidDataIndex).getMortes()) {
                    lowestCovidDataIndex = j;
                }
            }
            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

    public static void ordenarPorCasos(Vector<CovidData> vector) {
        for (int i=0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {
                if(vector.findWithIndex(j).getCasosConfirmados() < vector.findWithIndex(lowestCovidDataIndex).getCasosConfirmados()) {
                    lowestCovidDataIndex = j;
                }
            }
            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

    public static void ordenarPorNomeDasCidades(Vector<CovidData> vector) {
        for (int i=0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {
                if (vector.findWithIndex(j).getCidade().compareTo(vector.findWithIndex(lowestCovidDataIndex).getCidade()) < 0) {
                    lowestCovidDataIndex = j;
                }
            }
            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

}
