package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.text.Collator;

public class Quick3Sort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;

    public static void sort(Vector<CovidData> vector, int start, int end, int type) {
        if(hasMoreElements(start, end)) {
            int pivot3Index = 0;
            int pivotIndex = 0;
            switch (type) {
                case OBITOS:
                    pivot3Index = findPivotObitosIndex(vector, start, end);
                    exchangeElements(vector, pivot3Index, end);
                    pivotIndex = particionaObitos(vector, start, end);
                    break;
                case CASOS:
                    pivot3Index = findPivotCasosIndex(vector, start, end);
                    exchangeElements(vector, pivot3Index, end);
                    pivotIndex = particionaCasos(vector, start, end);
                    break;
                case CIDADES:
                    pivot3Index = findPivotCidadesIndex(vector, start, end);
                    exchangeElements(vector, pivot3Index, end);
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
        int pivot = vector.findWithIndex(end).getMortes();
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
            if(collator.compare(vector.findWithIndex(largerItemsThanPivotIndexController).getCidade(), pivot) < 0) {
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

    public static int findPivotObitosIndex(Vector<CovidData> vector, int startIndex, int endIndex) {

        int middleIndex = 0;
        if (endIndex % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        int start = vector.findWithIndex(startIndex).getMortes();
        int end = vector.findWithIndex(endIndex).getMortes();
        int middle = vector.findWithIndex(middleIndex).getMortes();
        int pivotIndex = 0;

        if (start > end) {
            if (start > middle) {
                if (end > middle) {
                    pivotIndex = endIndex;
                } else {
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = startIndex;
            }
        } else {
            if(end > middle) {
                if(start > middle) {
                    pivotIndex = startIndex;
                } else{
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = endIndex;
            }
        }
        return pivotIndex;
    }

    public static int findPivotCasosIndex(Vector<CovidData> vector, int startIndex, int endIndex) {
        int middleIndex = 0;
        if (endIndex % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        int start = vector.findWithIndex(startIndex).getCasosConfirmados();
        int end = vector.findWithIndex(endIndex).getCasosConfirmados();
        int middle = vector.findWithIndex(middleIndex).getCasosConfirmados();
        int pivotIndex = 0;

        if (start > end) {
            if (start > middle) {
                if (end > middle) {
                    pivotIndex = endIndex;
                } else {
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = startIndex;
            }
        } else {
            if(end > middle) {
                if(start > middle) {
                    pivotIndex = startIndex;
                } else{
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = endIndex;
            }
        }
        return pivotIndex;
    }

    public static int findPivotCidadesIndex(Vector<CovidData> vector, int startIndex, int endIndex) {
        int middleIndex = 0;
        if (endIndex % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        String start = vector.findWithIndex(startIndex).getCidade();
        String end = vector.findWithIndex(endIndex).getCidade();
        String middle = vector.findWithIndex(middleIndex).getCidade();
        int pivotIndex = 0;

        if (start.compareTo(end) > 0) {
            if (start.compareTo(middle) > 0) {
                if (start.compareTo(middle) > 0) {
                    pivotIndex = endIndex;
                } else {
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = startIndex;
            }
        } else {
            if(end.compareTo(middle) > 0) {
                if(start.compareTo(middle) > 0 ) {
                    pivotIndex = startIndex;
                } else{
                    pivotIndex = middleIndex;
                }
            } else {
                pivotIndex = endIndex;
            }
        }
        return pivotIndex;
    }

    public static boolean hasMoreElements(int start, int end) {
        return start < end;
    }
}