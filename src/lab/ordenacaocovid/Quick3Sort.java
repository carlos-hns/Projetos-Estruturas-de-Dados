package lab.ordenacaocovid;

import java.util.Arrays;

public class Quick3Sort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;
    private static final String MAX_VALUE = "ÿÿÿÿÿÿ";

    public static void sort(CovidData[] vector, int start, int end, int type) {
        if(hasMoreElements(start, end)) {
            int pivot3Index;
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

    public static int particionaObitos(CovidData[] vector, int start, int end) {
        int pivot = vector[end].getMortes();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(vector[largerItemsThanPivotIndexController].getMortes() <= pivot) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static int particionaCasos(CovidData[] vector, int start, int end) {
        int pivot = vector[end].getCasosConfirmados();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(vector[largerItemsThanPivotIndexController].getCasosConfirmados() <= pivot) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static int particionaCidades(CovidData[] vector, int start, int end) {
        String pivot = vector[end].getCidade();
        int smallerItemsThanPivotIndexController = start - 1;
        for (int largerItemsThanPivotIndexController = start; largerItemsThanPivotIndexController < end; largerItemsThanPivotIndexController++) {
            if(vector[largerItemsThanPivotIndexController].getCidade().compareTo(pivot) <= 0) {
                smallerItemsThanPivotIndexController++;
                exchangeElements(vector, smallerItemsThanPivotIndexController, largerItemsThanPivotIndexController);
            }
        }
        exchangeElements(vector, smallerItemsThanPivotIndexController + 1, end);
        return smallerItemsThanPivotIndexController + 1;
    }

    public static void exchangeElements(CovidData[] vector, int source, int destination) {
        CovidData itemHoldedFromSource = vector[source];
        vector[source] = vector[destination];
        vector[destination] = itemHoldedFromSource;
    }

    public static int findPivotObitosIndex(CovidData[] vector, int startIndex, int endIndex) {
        int middleIndex = 0;
        if (vector.length % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        int start = vector[startIndex].getMortes();
        int end = vector[endIndex].getMortes();
        int middle = vector[middleIndex].getMortes();
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

    public static int findPivotCasosIndex(CovidData[] vector, int startIndex, int endIndex) {
        int middleIndex = 0;
        if (vector.length % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        int start = vector[startIndex].getCasosConfirmados();
        int end = vector[endIndex].getCasosConfirmados();
        int middle = vector[middleIndex].getCasosConfirmados();
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

    public static int findPivotCidadesIndex(CovidData[] vector, int startIndex, int endIndex) {
        int middleIndex = 0;
        if (vector.length % 2 == 0) middleIndex = (endIndex / 2) - 1;
        else middleIndex  = endIndex / 2;

        String start = vector[startIndex].getCidade();
        String end = vector[endIndex].getCidade();
        String middle = vector[middleIndex].getCidade();
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