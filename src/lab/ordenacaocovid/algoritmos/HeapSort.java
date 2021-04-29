package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

import java.text.Collator;

public class HeapSort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;
    private static int heapSize;

    public static void sort(Vector<CovidData> vector, int type) {
        buildMaxHeap(vector, type);
        for (int i = vector.size() - 1; i >= 0; i--) {
            HeapSort.heapSize--;
            exchangeElements(vector, 0, i);
            maxHeapify(vector, 0, type);
        }
    }

    private static void buildMaxHeap(Vector<CovidData> vector, int type) {
        switch (type) {
            case OBITOS:
                buildMaxHeapDeaths(vector);
                break;
            case CASOS:
                buildMaxHeapConfirmeds(vector);
                break;
            case CIDADES:
                buildMaxHeapCitys(vector);
                break;
        }
    }

    private static void buildMaxHeapDeaths(Vector<CovidData> vector) {
        HeapSort.heapSize = vector.size() - 1;
        for (int i = (vector.size() - 1) / 2; i >= 0; i--) {
            maxHeapifyDeaths(vector, i);
        }
    }

    private static void buildMaxHeapConfirmeds(Vector<CovidData> vector) {
        HeapSort.heapSize = vector.size() - 1;
        for (int i = (vector.size() - 1) / 2; i >= 0; i--) {
            maxHeapifyConfirmeds(vector, i);
        }
    }

    private static void buildMaxHeapCitys(Vector<CovidData> vector) {
        HeapSort.heapSize = vector.size() - 1;
        for (int i = (vector.size() - 1) / 2; i >= 0; i--) {
            maxHeapifyCitys(vector, i);
        }
    }

    private static void maxHeapify(Vector<CovidData> vector, int index, int type) {
        switch (type) {
            case OBITOS:
                maxHeapifyDeaths(vector, index);
                break;
            case CASOS:
                maxHeapifyConfirmeds(vector, index);
                break;
            case CIDADES:
                maxHeapifyCitys(vector, index);
                break;
        }
    }

    private static void maxHeapifyDeaths(Vector<CovidData> vector, int index) {
        int bigger;
        int left = getLeftIndex(index);
        int right = getRightIndex(index);

        if(left <= HeapSort.heapSize && vector.findWithIndex(left).getMortes() > vector.findWithIndex(index).getMortes()) bigger = left;
        else bigger = index;

        if(right <= HeapSort.heapSize && vector.findWithIndex(right).getMortes() > vector.findWithIndex(bigger).getMortes()) bigger = right;

        if(bigger != index) {
            exchangeElements(vector, index, bigger);
            maxHeapifyDeaths(vector, bigger);
        }
    }

    private static void maxHeapifyConfirmeds(Vector<CovidData> vector, int index) {
        int bigger;
        int left = getLeftIndex(index);
        int right = getRightIndex(index);

        if(left <= HeapSort.heapSize && vector.findWithIndex(left).getCasosConfirmados() > vector.findWithIndex(index).getCasosConfirmados()) bigger = left;
        else bigger = index;

        if(right <= HeapSort.heapSize && vector.findWithIndex(right).getCasosConfirmados() > vector.findWithIndex(bigger).getCasosConfirmados()) bigger = right;

        if(bigger != index) {
            exchangeElements(vector, index, bigger);
            maxHeapifyConfirmeds(vector, bigger);
        }
    }

    private static void maxHeapifyCitys(Vector<CovidData> vector, int index) {
        int bigger;
        int left = getLeftIndex(index);
        int right = getRightIndex(index);

        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.NO_DECOMPOSITION);

        if(left <= HeapSort.heapSize && collator.compare(vector.findWithIndex(left).getCidade(), vector.findWithIndex(index).getCidade()) > 0) bigger = left;
        else bigger = index;

        if(right <= HeapSort.heapSize && collator.compare(vector.findWithIndex(right).getCidade(), vector.findWithIndex(bigger).getCidade()) > 0) bigger = right;

        if(bigger != index) {
            exchangeElements(vector, index, bigger);
            maxHeapifyCitys(vector, bigger);
        }
    }

    public static void exchangeElements(Vector<CovidData> vector, int source, int destination) {
        CovidData itemHoldedFromSource = vector.findWithIndex(source);
        vector.insert(vector.findWithIndex(destination), source);
        vector.insert(itemHoldedFromSource, destination);
    }

    private static int getLeftIndex(int index) {
        return 2 * index + 1;
    }

    private static int getRightIndex(int index) {
        return 2 * index + 2;
    }

}
