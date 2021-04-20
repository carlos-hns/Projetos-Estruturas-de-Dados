package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

public class InsertionSort {

    public static void ordenarPorObitos(Vector<CovidData> vector) {
        for(int unsortedElementIndex = 1; unsortedElementIndex < vector.size(); unsortedElementIndex++) {
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector.findWithIndex(currentSortedElementIndex).getMortes() > unsortedElement.getMortes()) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }

    public static void ordenarPorCasos(Vector<CovidData> vector) {
        for(int unsortedElementIndex=1; unsortedElementIndex < vector.size(); unsortedElementIndex++){
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector.findWithIndex(currentSortedElementIndex).getCasosConfirmados() > unsortedElement.getCasosConfirmados()) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }

    public static void ordenarPorNomeDasCidades(Vector<CovidData> vector) {
        for(int unsortedElementIndex = 1; unsortedElementIndex < vector.size(); unsortedElementIndex++) {
            CovidData unsortedElement = vector.findWithIndex(unsortedElementIndex);
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 &&
                    (vector.findWithIndex(currentSortedElementIndex).getCidade().compareTo(unsortedElement.getCidade()) > 0)) {
                vector.insert(vector.findWithIndex(currentSortedElementIndex), currentSortedElementIndex + 1);
                currentSortedElementIndex--;
            }
            vector.insert(unsortedElement, currentSortedElementIndex + 1);
        }
    }
}
