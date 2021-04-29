package lab.ordenacaocovid.testes;

import lab.ordenacaocovid.algoritmos.*;
import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortAlgorithmsTest {

    // ---------------- //
    // Insertion Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInInsertionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        InsertionSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInInsertionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        InsertionSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInInsertionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        InsertionSort.ordenarPorNomeDasCidades(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    // ---------------- //
    // Selection Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInSelectionSortIncrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        SelectionSort.ordenarPorObitos(dataUnsorted, SelectionSort.INCREASE);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortDeathsInSelectionSortDecrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateOrderedDeathsVector();
        SelectionSort.ordenarPorObitos(dataUnsorted, SelectionSort.DECREASE);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInSelectionSortIncrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        SelectionSort.ordenarPorCasos(dataUnsorted, SelectionSort.INCREASE);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInSelectionSortDecrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        SelectionSort.ordenarPorCasos(dataUnsorted, SelectionSort.DECREASE);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }


    @Test
    public void shouldSortCitysInSelectionSortIncrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        SelectionSort.ordenarPorNomeDasCidades(dataUnsorted, SelectionSort.INCREASE);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInSelectionSortDecrease() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateTotallyUnorderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateOrderedCitysVector();
        SelectionSort.ordenarPorNomeDasCidades(dataUnsorted, SelectionSort.DECREASE);

        System.out.println(dataSorted);
        System.out.println(dataUnsorted);

        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    // ---------------- //
    // Counting Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInCountingSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        dataUnsorted = CountingSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInCountingSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        dataUnsorted = CountingSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    // ---------------- //
    // Merge Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInMergeSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInMergeSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInMergeSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CIDADES);


        System.out.println(dataSorted);
        System.out.println(dataUnsorted);


        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }


    // ---------------- //
    // Quick Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInQuickSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInQuickSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInQuickSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CIDADES);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    // --------------------------- //
    // Quick Sort Mediana de Três
    // --------------------------- //

    @Test
    public void tirashouldSortDeathsInQuick3Sort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateOrderedDeathsVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInQuick3Sort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInQuick3Sort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.size() - 1, MergeSort.CIDADES);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    // --------------------------- //
    // Heap Sort
    // --------------------------- //

    @Test
    public void shouldSortDeathsInHeapSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateOrderedDeathsVector();
        HeapSort.sort(dataUnsorted, HeapSort.OBITOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInHeapSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        HeapSort.sort(dataUnsorted, HeapSort.CASOS);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInHeapSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        HeapSort.sort(dataUnsorted, HeapSort.CIDADES);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }


}
