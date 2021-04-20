package lab.ordenacaocovid.testes;

import lab.ordenacaocovid.utils.CovidData;
import lab.ordenacaocovid.utils.Vector;

public class CreateStuntDataSets {

    public static Vector<CovidData> generateUnorderedDeathsVector() {
        int size = 10, j = 0;
        Vector<CovidData> data = new Vector<>(size);
        for (int i = 0; i < size;  i++)  {
            data.add(new CovidData(), i);
            data.findWithIndex(i).setMortes(size - j++);
        }
        return data;
    }

    public static Vector<CovidData> generateOrderedDeathsVector() {
        int size = 10, j = 1;
        Vector<CovidData> data = new Vector<>(size);
        for (int i = 0; i < size;  i++)  {
            data.add(new CovidData(), i);
            data.findWithIndex(i).setMortes(j++);
        }
        return data;
    }

    public static Vector<CovidData> generateUnorderedConfirmedVector() {
        int size = 10, j = 0;
        Vector<CovidData> data = new Vector<>(size);
        for (int i = 0; i < size;  i++)  {
            data.add(new CovidData(), i);
            data.findWithIndex(i).setCasosConfirmados(size - j++);
        }
        return data;
    }

    public static Vector<CovidData> generateOrderedConfirmedVector() {
        int size = 10, j = 1;
        Vector<CovidData> data = new Vector<>(size);
        for (int i = 0; i < size;  i++)  {
            data.add(new CovidData(), i);
            data.findWithIndex(i).setCasosConfirmados(j++);
        }
        return data;
    }

    public static Vector<CovidData> generateUnorderedCitysVector() {
        int size = 10;
        Vector<CovidData> data = new Vector<CovidData>(size);
        String[] citys = new String[] {
                "São Paulo",
                "Rio de Janeiro",
                "Alvorada",
                "Castanhal",
                "Zé Doca",
                "Alvaro de Carvalho",
                "Maceió",
                "Florianópolis",
                "Olinda",
                "Palmas"
        };

        for (int i = 0 ; i < size; i++) {
            data.add(new CovidData(), i);
            data.findWithIndex(i).setCidade(citys[i]);
        }
        return data;
    }

    public static Vector<CovidData> generateOrderedCitysVector() {
        int size = 10;
        Vector<CovidData> data = new Vector<CovidData>(size);
        String[] citys = new String[] {
                "Alvaro de Carvalho",
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
            data.add(new CovidData(), i);
            data.findWithIndex(i).setCidade(citys[i]);
        }
        return data;
    }
}
