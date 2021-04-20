package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;

public class MergeSort {

    public static final int OBITOS = 0;
    public static final int CASOS = 1;
    public static final int CIDADES = 2;
    private static final String MAX_VALUE = "ÿÿÿÿÿÿ";

    public static void sort(CovidData[] vector, int start, int end, int type) {
        if(hasMoreElements(start, end)) {
            int middle = (int) Math.floor((start + end)/ 2);
            sort(vector, start, middle, type);
            sort(vector, middle + 1, end,  type);

            switch (type) {
                case OBITOS:
                    intercalaObitos(vector, start, middle, end);
                    break;
                case CASOS:
                    intercalaCasos(vector, start, middle, end);
                    break;
                case CIDADES:
                    intercalaCidades(vector, start, middle, end);
                    break;
            }
        }
    }

    public static void intercalaObitos(CovidData[] vector, int start, int middle, int end) {
        int sizeStartToMiddle = middle - start + 1;
        int sizeMiddleToEnd = end - middle;

        CovidData[] vectorStartToMid = new CovidData[sizeStartToMiddle + 1];
        CovidData[]  vectorMidToEnd = new CovidData[sizeMiddleToEnd + 1];

        for (int currentIndex = 0; currentIndex < sizeStartToMiddle; currentIndex++) {
            vectorStartToMid[currentIndex] = vector[start + currentIndex];
        }

        for(int currentIndex = 0; currentIndex < sizeMiddleToEnd; currentIndex++) {
            vectorMidToEnd[currentIndex] = vector[middle + currentIndex + 1];
        }

        vectorStartToMid[sizeStartToMiddle] = new CovidData();
        vectorStartToMid[sizeStartToMiddle].setMortes(Integer.MAX_VALUE);

        vectorMidToEnd[sizeMiddleToEnd] = new CovidData();
        vectorMidToEnd[sizeMiddleToEnd].setMortes(Integer.MAX_VALUE);

        int currentStartToMiddleIndex = 0;
        int currentMiddleToEndIndex = 0;

        for (int currentVectorIndex = start; currentVectorIndex <= end; currentVectorIndex++) {
            if(vectorStartToMid[currentStartToMiddleIndex].getMortes() <= vectorMidToEnd[currentMiddleToEndIndex].getMortes()) {
                vector[currentVectorIndex] = vectorStartToMid[currentStartToMiddleIndex];
                currentStartToMiddleIndex++;
            } else {
                vector[currentVectorIndex] = vectorMidToEnd[currentMiddleToEndIndex];
                currentMiddleToEndIndex++;
            }
        }
    }

    public static void intercalaCasos(CovidData[] vector, int start, int middle, int end) {
        int sizeStartToMiddle = middle - start + 1;
        int sizeMiddleToEnd = end - middle;

        CovidData[] vectorStartToMid = new CovidData[sizeStartToMiddle + 1];
        CovidData[]  vectorMidToEnd = new CovidData[sizeMiddleToEnd + 1];

        for (int currentIndex = 0; currentIndex < sizeStartToMiddle; currentIndex++) {
            vectorStartToMid[currentIndex] = vector[start + currentIndex];
        }

        for(int currentIndex = 0; currentIndex < sizeMiddleToEnd; currentIndex++) {
            vectorMidToEnd[currentIndex] = vector[middle + currentIndex + 1];
        }

        vectorStartToMid[sizeStartToMiddle] = new CovidData();
        vectorStartToMid[sizeStartToMiddle].setCasosConfirmados(Integer.MAX_VALUE);

        vectorMidToEnd[sizeMiddleToEnd] = new CovidData();
        vectorMidToEnd[sizeMiddleToEnd].setCasosConfirmados(Integer.MAX_VALUE);

        int currentStartToMiddleIndex = 0;
        int currentMiddleToEndIndex = 0;

        for (int currentVectorIndex = start; currentVectorIndex <= end; currentVectorIndex++) {
            if(vectorStartToMid[currentStartToMiddleIndex].getCasosConfirmados() <= vectorMidToEnd[currentMiddleToEndIndex].getCasosConfirmados()) {
                vector[currentVectorIndex] = vectorStartToMid[currentStartToMiddleIndex];
                currentStartToMiddleIndex++;
            } else {
                vector[currentVectorIndex] = vectorMidToEnd[currentMiddleToEndIndex];
                currentMiddleToEndIndex++;
            }
        }
    }

    public static void intercalaCidades(CovidData[] vector, int start, int middle, int end) {
        int sizeStartToMiddle = middle - start + 1;
        int sizeMiddleToEnd = end - middle;

        CovidData[] vectorStartToMid = new CovidData[sizeStartToMiddle + 1];
        CovidData[]  vectorMidToEnd = new CovidData[sizeMiddleToEnd + 1];

        for (int currentIndex = 0; currentIndex < sizeStartToMiddle; currentIndex++) {
            vectorStartToMid[currentIndex] = vector[start + currentIndex];
        }

        for(int currentIndex = 0; currentIndex < sizeMiddleToEnd; currentIndex++) {
            vectorMidToEnd[currentIndex] = vector[middle + currentIndex + 1];
        }

        vectorStartToMid[sizeStartToMiddle] = new CovidData();
        vectorStartToMid[sizeStartToMiddle].setCidade(MAX_VALUE);

        vectorMidToEnd[sizeMiddleToEnd] = new CovidData();
        vectorMidToEnd[sizeMiddleToEnd].setCidade(MAX_VALUE);

        int currentStartToMiddleIndex = 0;
        int currentMiddleToEndIndex = 0;

        for (int currentVectorIndex = start; currentVectorIndex <= end; currentVectorIndex++) {
            if (vectorStartToMid[currentStartToMiddleIndex].getCidade().compareTo(vectorMidToEnd[currentMiddleToEndIndex].getCidade()) < 0) {
                vector[currentVectorIndex] = vectorStartToMid[currentStartToMiddleIndex];
                currentStartToMiddleIndex++;
            } else  {
                vector[currentVectorIndex] = vectorMidToEnd[currentMiddleToEndIndex];
                currentMiddleToEndIndex++;
            }
        }
    }

    public static boolean hasMoreElements(int start, int end) {
        return start < end;
    }

}
