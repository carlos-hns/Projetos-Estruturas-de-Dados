package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.text.Collator;

public class QuickSort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;

    public static void sort(Vector<CovidData> vector, int start, int end, int type) {
        if(hasMoreElements(start, end)) {
            int pivotIndex = 0;
            switch (type) {
                case OBITOS:
                    pivotIndex = particionaObitos(vector, start, end);
                    break;
                case CASOS:
                    pivotIndex = particionaCasos(vector, start, end);
                    break;
                case CIDADES:
                    pivotIndex = particionaCidades(vector, start, end);
                    break;
            }
            sort(vector, start, pivotIndex - 1, type);
            sort(vector, pivotIndex + 1, end, type);
        }
    }

    public static int particionaObitos(Vector<CovidData> vector, int start, int end) {
        int pivot = vector.findWithIndex(end).getMortes();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(vector.findWithIndex(largerItemsThanPivotIndexController).getMortes() <= pivot) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static int particionaCasos(Vector<CovidData> vector, int start, int end) {
        int pivot = vector.findWithIndex(end).getCasosConfirmados();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(vector.findWithIndex(largerItemsThanPivotIndexController).getCasosConfirmados() <= pivot) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static int particionaCidades(Vector<CovidData> vector, int start, int end) {

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.NO_DECOMPOSITION);

        String pivot = vector.findWithIndex(end).getCidade();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(collator.compare(vector.findWithIndex(largerItemsThanPivotIndexController).getCidade(), pivot) <= 0) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static void exchangeElements(Vector<CovidData> vector, int source, int destination) {
        CovidData itemHoldedFromSource = vector.findWithIndex(source);
        vector.insert(vector.findWithIndex(destination), source);
        vector.insert(itemHoldedFromSource, destination);
    }

    public static boolean hasMoreElements(int start, int end) {
        return start < end;
    }
}
