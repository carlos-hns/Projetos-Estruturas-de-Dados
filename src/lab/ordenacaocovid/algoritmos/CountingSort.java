package lab.ordenacaocovid.algoritmos;

import lab.ordenacaocovid.utils.CovidData;

public class CountingSort {

    public static CovidData[] ordenarPorObitos(CovidData[] originalVector) {
        CovidData[] exitVector = new CovidData[originalVector.length];

        int numberMaximum = findMaximumNumberObitos(originalVector);
        int[] vectorOfPositionsInExitVector = new int[numberMaximum + 1];

        // Here has the amount of each number possible in original vector
        for (int i = 0; i < originalVector.length; i++) {
            vectorOfPositionsInExitVector[originalVector[i].getMortes()] += 1;
        }

        // Here has the positions of each number in exit vector
        for (int i = 1; i <= numberMaximum; i++) {
            vectorOfPositionsInExitVector[i] += vectorOfPositionsInExitVector[i - 1];
        }

        for(int i = originalVector.length - 1; i >= 0; i--) {
            exitVector[vectorOfPositionsInExitVector[originalVector[i].getMortes()] - 1] = originalVector[i];
            vectorOfPositionsInExitVector[originalVector[i].getMortes()] -= 1;
        }
        return exitVector;
    }
    public static CovidData[] ordenarPorCasos(CovidData[] originalVector) {
        CovidData[] exitVector = new CovidData[originalVector.length];

        int numberMaximum = findMaximumNumberCasos(originalVector);
        int[] vectorOfPositionsInExitVector = new int[numberMaximum + 1];

        // Here has the amount of each number possible in original vector
        for (int i = 0; i < originalVector.length; i++) {
            vectorOfPositionsInExitVector[originalVector[i].getCasosConfirmados()] += 1;
        }

        // Here has the positions of each number in exit vector
        for (int i = 1; i <= numberMaximum; i++) {
            vectorOfPositionsInExitVector[i] += vectorOfPositionsInExitVector[i - 1];
        }

        for(int i = originalVector.length - 1; i >= 0; i--) {
            exitVector[vectorOfPositionsInExitVector[originalVector[i].getCasosConfirmados()] - 1] = originalVector[i];
            vectorOfPositionsInExitVector[originalVector[i].getCasosConfirmados()] -= 1;
        }

        return exitVector;
    }

    private static int findMaximumNumberObitos(CovidData[] vector) {
        int numberMaximum = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i].getMortes() > numberMaximum) numberMaximum = vector[i].getMortes();
        }
        return numberMaximum;
    }

    private static int findMaximumNumberCasos(CovidData[] vector) {
        int numberMaximum = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i].getCasosConfirmados() > numberMaximum) numberMaximum = vector[i].getCasosConfirmados();
        }
        return numberMaximum;
    }
}
