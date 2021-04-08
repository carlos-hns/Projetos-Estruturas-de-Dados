package lab.ordenacaocovid;

public class InsertionSort {

    public static void ordenarPorObitos(CovidData[] vector) {
        for(int unsortedElementIndex=1; unsortedElementIndex < vector.length; unsortedElementIndex++){
            CovidData unsortedElement = vector[unsortedElementIndex];
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector[currentSortedElementIndex].getMortes() > unsortedElement.getMortes()) {
                vector[currentSortedElementIndex + 1] = vector[currentSortedElementIndex];
                currentSortedElementIndex--;
            }
            vector[currentSortedElementIndex + 1] = unsortedElement;
        }
    }

    public static void ordenarPorCasos(CovidData[] vector) {
        for(int unsortedElementIndex=1; unsortedElementIndex < vector.length; unsortedElementIndex++){
            CovidData unsortedElement = vector[unsortedElementIndex];
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex >= 0 && vector[currentSortedElementIndex].getCasosConfirmados() > unsortedElement.getCasosConfirmados()) {
                vector[currentSortedElementIndex + 1] = vector[currentSortedElementIndex];
                currentSortedElementIndex--;
            }
            vector[currentSortedElementIndex + 1] = unsortedElement;
        }
    }

    public static void ordenarPorNomeDasCidades(CovidData[] vector) {
        for(int unsortedElementIndex=1; unsortedElementIndex < vector.length; unsortedElementIndex++){
            CovidData unsortedElement = vector[unsortedElementIndex];
            int currentSortedElementIndex  = unsortedElementIndex - 1;
            while (currentSortedElementIndex > 0 &&
                    (vector[currentSortedElementIndex].getCidade().compareTo(unsortedElement.getCidade()) > 0)) {
                vector[currentSortedElementIndex + 1] = vector[currentSortedElementIndex];
                currentSortedElementIndex--;
            }
            vector[currentSortedElementIndex + 1] = unsortedElement;
        }
    }

}
