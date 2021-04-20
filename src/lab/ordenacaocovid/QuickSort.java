package lab.ordenacaocovid;

public class QuickSort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;
    private static final String MAX_VALUE = "ÿÿÿÿÿÿ";

    public static void sort(CovidData[] vector, int start, int end, int type) {
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

    public static boolean hasMoreElements(int start, int end) {
        return start < end;
    }
}
