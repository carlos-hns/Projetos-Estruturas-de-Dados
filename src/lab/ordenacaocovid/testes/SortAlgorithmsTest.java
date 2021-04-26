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
    public void shouldSortDeathsInSelectionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        SelectionSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortConfirmedsInSelectionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        SelectionSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.size(); i++) Assertions.assertEquals(dataSorted.findWithIndex(i).toString(), dataUnsorted.findWithIndex(i).toString());
    }

    @Test
    public void shouldSortCitysInSelectionSort() {
        Vector<CovidData> dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        Vector<CovidData> dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        SelectionSort.ordenarPorNomeDasCidades(dataUnsorted);
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
    public void shouldSortDeathsInQuick3Sort() {
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
