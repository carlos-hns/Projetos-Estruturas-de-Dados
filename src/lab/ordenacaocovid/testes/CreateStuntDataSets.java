package lab.ordenacaocovid.testes;

import lab.ordenacaocovid.utils.CovidData;

public class CreateStuntDataSets {

    public static CovidData[] generateUnorderedDeathsVector() {
        int size = 10, j = 0;;
        CovidData[] data = new CovidData[size];

        for (int i = 0; i < size;  i++)  {
            data[i] = new CovidData();
            data[i].setMortes(size - j++);
        }
        return data;
    }

    public static CovidData[] generateOrderedDeathsVector() {
        int size = 10, j = 1;
        CovidData[] data = new CovidData[size];
        for (int i = 0; i < size; i++) {
            data[i] = new CovidData();
            data[i].setMortes(j++);
        }
        return data;
    }

    public static CovidData[] generateUnorderedConfirmedVector() {
        int size = 10, j = 0;;
        CovidData[] data = new CovidData[size];

        for (int i = 0; i < size;  i++)  {
            data[i] = new CovidData();
            data[i].setCasosConfirmados(size - j++);
        }
        return data;
    }

    public static CovidData[] generateOrderedConfirmedVector() {
        int size = 10, j = 1;
        CovidData[] data = new CovidData[size];
        for (int i = 0; i < size; i++) {
            data[i] = new CovidData();
            data[i].setCasosConfirmados(j++);
        }
        return data;
    }


    public static CovidData[] generateUnorderedCitysVector() {
        int size = 10;
        CovidData[] data = new CovidData[size];
        String[] citys = new String[] {
                "São Paulo",
                "Rio de Janeiro",
                "Alvorada",
                "Castanhal",
                "Zé Doca",
                "Álvaro de Carvalho",
                "Maceió",
                "Florianópolis",
                "Olinda",
                "Palmas"
        };

        for (int i = 0 ; i < size; i++) {
            data[i] = new CovidData();
            data[i].setCidade(citys[i]);
        }
        return data;
    }

    public static CovidData[] generateOrderedCitysVector() {
        int size = 10;
        CovidData[] data = new CovidData[size];
        String[] citys = new String[] {
                "Álvaro de Carvalho",
                "Alvorada",
                "Castanhal",
                "Florianópolis",
                "Maceió",
                "Olinda",
                "Palmas",
                "Rio de Janeiro",
                "São Paulo",
                "Zé Doca",
        };

        for (int i = 0; i < size; i++) {
            data[i] = new CovidData();
            data[i].setCidade(citys[i]);
        }
        return data;
    }
}
