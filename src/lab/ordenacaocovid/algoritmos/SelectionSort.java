package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.text.Collator;

public class SelectionSort {

    public static final int INCREASE = 0;
    public static final int DECREASE = 1;

    public static void ordenarPorObitos(Vector<CovidData> vector, int typeSort) {
        for (int i = 0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;

            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {

                boolean compareResult;
                if(typeSort == SelectionSort.INCREASE) compareResult = vector.findWithIndex(j).getMortes() < vector.findWithIndex(lowestCovidDataIndex).getMortes();
                else compareResult =  vector.findWithIndex(j).getMortes() > vector.findWithIndex(lowestCovidDataIndex).getMortes();

                if(compareResult) {
                    lowestCovidDataIndex = j;
                }
            }

            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

    public static void ordenarPorCasos(Vector<CovidData> vector, int typeSort) {
        for (int i=0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {

                boolean compareResult;
                if(typeSort == SelectionSort.INCREASE) compareResult = vector.findWithIndex(j).getCasosConfirmados() < vector.findWithIndex(lowestCovidDataIndex).getCasosConfirmados();
                else compareResult =  vector.findWithIndex(j).getCasosConfirmados() > vector.findWithIndex(lowestCovidDataIndex).getCasosConfirmados();

                if(compareResult) {
                    lowestCovidDataIndex = j;
                }
            }
            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

    public static void ordenarPorNomeDasCidades(Vector<CovidData> vector, int typeSort) {

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.NO_DECOMPOSITION);

        for (int i=0; i < vector.size(); i++) {
            CovidData currentCovidDataToOrder = vector.findWithIndex(i);
            int lowestCovidDataIndex = i;
            int nextCovidDataOfSearch = i + 1;
            for (int j = nextCovidDataOfSearch; j < vector.size(); j++) {

                boolean compareResult;
                if(typeSort == SelectionSort.INCREASE) compareResult = collator.compare(vector.findWithIndex(j).getCidade(), vector.findWithIndex(lowestCovidDataIndex).getCidade()) < 0;
                else compareResult = compareResult = collator.compare(vector.findWithIndex(j).getCidade(), vector.findWithIndex(lowestCovidDataIndex).getCidade()) > 0;

                if (compareResult) {
                    lowestCovidDataIndex = j;
                }
            }
            vector.insert(vector.findWithIndex(lowestCovidDataIndex), i);
            vector.insert(currentCovidDataToOrder, lowestCovidDataIndex);
        }
    }

}
