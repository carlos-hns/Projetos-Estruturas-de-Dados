package lab.ordenacaocovid.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TimerWriter {

    private static final String OBITOS = "Obitos";
    private static final String CASOS = "Casos Confirmados";
    private static final String CIDADES = "Cidades";

    public static void writeTime(Timer timer, String caminhoParaSalvar) {
        try {
            File arquivo = new File(caminhoParaSalvar);
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(makeString(timer.insertionTimeObitos, "InsertionSort", OBITOS));
            writer.append(makeString(timer.insertionTimeCasos, "InsertionSort", CASOS));
            writer.append(makeString(timer.insertionTimeCidades, "InsertionSort", CIDADES));

            writer.append(makeString(timer.selectionTimeObitos, "SelectionSort", OBITOS));
            writer.append(makeString(timer.selectionTimeCasos, "SelectionSort", CASOS));
            writer.append(makeString(timer.selectionTimeCidades, "SelectionSort", CIDADES));

            writer.append(makeString(timer.mergeTimeObitos, "MergeSort", OBITOS));
            writer.append(makeString(timer.mergeTimeCasos, "MergeSort", CASOS));
            writer.append(makeString(timer.mergeTimeCidades, "MergeSort", CIDADES));

            writer.append(makeString(timer.quickTimeObitos, "QuickSort", OBITOS));
            writer.append(makeString(timer.quickTimeCasos, "QuickSort", CASOS));
            writer.append(makeString(timer.quickTimeCidades, "QuickSort", CIDADES));

            writer.append(makeString(timer.quickMedTimeObitos, "QuickSort Mediana de Três", OBITOS));
            writer.append(makeString(timer.quickMedTimeCasos, "QuickSort Mediana de Três", CASOS));
            writer.append(makeString(timer.quickMedTimeCidades, "QuickSort Mediana de Três", CIDADES));

            writer.append(makeString(timer.countingTimeObitos, "CountingSort", OBITOS));
            writer.append(makeString(timer.countingTimeCasos, "CountingSort", CASOS));

            writer.append(makeString(timer.heapTimeObitos, "HeapSort", OBITOS));
            writer.append(makeString(timer.heapTimeCasos, "HeapSort", CASOS));
            writer.append(makeString(timer.heapTimeCidades, "HeapSort", CIDADES));

            writer.close();
            fileWriter.close();

        } catch (IOException error) {
            System.err.println("Erro ao escrever linha.");
        }
    }

    private static String makeString(long[] times, String algorithmName, String orderType) {
        StringBuilder builder = new StringBuilder();
        builder.append("# ----------------------- #\n");
        builder.append(algorithmName + "\n");
        builder.append("# ----------------------- #\n");
        builder.append("\nMelhor Caso - " + orderType + ": " + times[Timer.MELHOR] + "\n");
        builder.append("Médio Caso - " + orderType + ": " + times[Timer.MEDIO] + "\n");
        builder.append("Pior Caso - " + orderType + ": " + times[Timer.PIOR] + "\n");
        builder.append("\n");
        return builder.toString();
    }

}
