package lab.ordenacaocovid.testes;

import lab.ordenacaocovid.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortAlgorithmsTest {

    // ---------------- //
    // Insertion Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInInsertionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        InsertionSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInInsertionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        InsertionSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortCitysInInsertionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        InsertionSort.ordenarPorNomeDasCidades(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    // ---------------- //
    // Selection Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInSelectionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        SelectionSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInSelectionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        SelectionSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortCitysInSelectionSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        SelectionSort.ordenarPorNomeDasCidades(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    // ---------------- //
    // Counting Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInCountingSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        dataUnsorted = CountingSort.ordenarPorObitos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInCountingSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        dataUnsorted = CountingSort.ordenarPorCasos(dataUnsorted);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    // ---------------- //
    // Merge Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInMergeSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInMergeSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortCitysInMergeSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CIDADES);

        System.out.println(Arrays.toString(dataSorted));
        System.out.println(Arrays.toString(dataUnsorted));

        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    // ---------------- //
    // Quick Sort
    // ---------------- //

    @Test
    public void shouldSortDeathsInQuickSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        QuickSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInQuickSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        QuickSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortCitysInQuickSort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        MergeSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CIDADES);

        System.out.println(Arrays.toString(dataSorted));
        System.out.println(Arrays.toString(dataUnsorted));

        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    // --------------------------- //
    // Quick Sort Mediana de Três
    // --------------------------- //

    @Test
    public void shouldSortDeathsInQuick3Sort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedDeathsVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedDeathsVector();
        Quick3Sort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.OBITOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortConfirmedsInQuick3Sort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedConfirmedVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedConfirmedVector();
        Quick3Sort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CASOS);
        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

    @Test
    public void shouldSortCitysInQuick3Sort() {
        CovidData[] dataSorted = CreateStuntDataSets.generateOrderedCitysVector();
        CovidData[] dataUnsorted = CreateStuntDataSets.generateUnorderedCitysVector();
        QuickSort.sort(dataUnsorted, 0, dataUnsorted.length - 1, MergeSort.CIDADES);

        System.out.println(Arrays.toString(dataSorted));
        System.out.println(Arrays.toString(dataUnsorted));

        for (int i = 0; i < dataSorted.length; i++) Assertions.assertEquals(dataSorted[i].toString(), dataUnsorted[i].toString());
    }

}
