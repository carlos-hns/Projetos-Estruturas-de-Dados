package lab.ordenacaocovid.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TimerWriter {

    private static final String OBITOS = "Obitos";
    private static final String CASOS = "Casos";
    private static final String CIDADES = "Cidades";

    public static void writeTime(Timer timer, String caminhoParaSalvar) {
        try {
            File arquivo = new File(caminhoParaSalvar);
            FileWriter fileWriter = new FileWriter(arquivo);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(timer.insertionTimeObitos, "InsertionSort", OBITOS);
            writer.append(timer.insertionTimeCasos, "InsertionSort", CASOS);
            writer.append(timer.insertionTimeCidades, "InsertionSort", CIDADES);

            writer.append(timer.selectionTimeObitos, "SelectionSort", OBITOS);
            writer.append(timer.selectionTimeCasos, "SelectionSort", CASOS);
            writer.append(timer.selectionTimeCidades, "SelectionSort", CIDADES);

            writer.append(timer.mergeTimeObitos, "MergeSort", OBITOS);
            writer.append(timer.mergeTimeCasos, "MergeSort", CASOS);
            writer.append(timer.mergeTimeCidades, "MergeSort", CIDADES);

            writer.append(timer.quickTimeObitos, "QuickSort", OBITOS);
            writer.append(timer.quickTimeCasos, "QuickSort", CASOS);
            writer.append(timer.quickTimeCidades, "QuickSort", CIDADES);

            writer.append(timer.quickMedTimeObitos, "QuickSort Mediana de Três", OBITOS);
            writer.append(timer.quickMedTimeCasos, "QuickSort Mediana de Três", CASOS);
            writer.append(timer.quickMedTimeCidades, "QuickSort Mediana de Três", CIDADES);

            writer.append(timer.countingTimeObitos, "CountingSort", OBITOS);
            writer.append(timer.countingTimeCasos, "CountingSort", CASOS);

            writer.append(timer.heapTimeObitos, "InsertionSort", OBITOS);
            writer.append(timer.heapTimeCasos, "InsertionSort", CASOS);
            writer.append(timer.heapTimeCidades, "InsertionSort", CIDADES);

            writer.close();
            fileWriter.close();

        } catch (IOException error) {
            System.err.println("Erro ao escrever linha.");
        }
    }

    private static String makeString(long[] times, String algorithmName, String orderType) {
        StringBuilder builder = new StringBuilder();
        builder.append("# ----------------------- #");
        builder.append(algorithmName);
        builder.append("# ----------------------- #");
        builder.append("Melhor Caso - " + orderType + ": " + times[Timer.MELHOR]);
        builder.append("Médio Caso - " + orderType + ": " + times[Timer.MEDIO]);
        builder.append("Pior Caso - " + orderType + ": " + times[Timer.PIOR]);
        builder.append("\n");
        return builder.toString();
    }

}
