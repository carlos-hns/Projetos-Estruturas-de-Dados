# Análise comparativa de algoritmos de ordenação aplicado a dados da COVID-19.

O projeto consiste das seguintes fases:

1. Preparação do [dataset](https://data.brasil.io/dataset/covid19/caso.csv.gz). Compreende um registro histórico de ocorrência de COVID-19 para todas as cidades e estados do Brasil.
    1. Você deve baixar a planilha localmente para poder processá-la no seu código Java. Atenção, quando descompacta se torna algo bem maior.
    2. Você deve tratar apenas com os dados mais atuais (tem um campo chamado "É a última atualização?" ou "is_last" que deve eestar marcado como True). Valores antigos não interessam
    
2. Gerar um arquivo formatado para ser processado na próxima fase
Análise dos algoritmos de ordenação
    1. Implemente e utilize todos os algoritmos de ordenação estudados (Selection Sort, Insertion Sort, Merge Sort, Quick Sort, QuickSort com Mediana de 3, counting, e HeapSort) para ordenar os registros de acordo com os seguintes parâmetros:
        * Ordenação crescente por quantidade acumulada de óbitos;
        * Ordenação crescente por quantidade acumulada de casos;
        * Ordenação crescente por ordem alfabética pelo nome das cidades.
    2. Cada arquivo de saída de ordenação deve ser gerado com base no método de ordenação e no elemento ordenado. Por exemplo, para o quick sort devem ser gerado 3 arquivos: qSort_ordena_obitos.csv e qSort_ordena_casos.csv, qSort_ordena_cidades.csv. Isso deve continuar para cada um dos métodos de ordenação.
    3. Para cada algoritmo, registre o tempo necessário para ordenar o vetor de senhas (em milissegundos).
    4. Elabore uma tabela para comparar o tempo de execução dos algoritmos.
3. Opcional: Para a elaboração dos comparativos devem ser usados ferramentas de code profiling, como por exemplo o https://visualvm.github.io/. Elabore gráficos mostrando o consumo de tempo e memória quando da execução do algoritmo.

# Instalação

1. Instale a JRE/JDK do Java 1.8 ou superior.
  * No linux você pode usar o comando: sudo apt install openjdk-8-jdk
  * No windows: você pode usar este [link](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)

2. Faça alteração da versão que será utilizada, caso seja necessário, usando este comando: 
  * No linux: sudo update-alternatives --config java
  * No windows dê uma olhada neste [link](https://www.java.com/pt-BR/download/help/update_runtime_settings.html)

3. Faça o download do [dataset](https://data.brasil.io/dataset/covid19/caso.csv.gz)

4. Faça o download dos [arquivos compilados](https://drive.google.com/file/d/1dqpuIVC6F3H617xh-iiWQ6KfFcVv7TkT/view?usp=sharing)

5. Extraia ambos em um local adequado e que seja fácil pegar o caminho, pois precisaremos dele

6. Com os arquivos descompactados, você terá um arquivo chamado caso.csv e uma pasta chamada CovidAnalyser, insira o arquivo caso.csv na pasta de dadosbrutos, você pode achá-la seguindo esta estrutura CovidAnalyser > data > dadosbrutos

7. Abra seu terminal/cmd/powershell percorra o caminho até a pasta onde se encontra o jar chamado CovidAnalyser.jar, use o comando cd "caminhho" para esse propósito.

8. Execute o seguinte comando: java -jar CovidAnalyser.jar "caminho-da-pasta-extraida-que-possui-o-jar-e-a-pasta-data"

OBS: se estiver no windows provavelmente será ./CovidAnalyser.jar ao invés de CovidAnalyser.jar

OBS 2: As aspas são obrigatórias e as barras do caminho devem ser invertidas. Exemplo: /home/carlos/IdeaProjects/Projetos ED, ao invés de,  C:\carlos\IdeaProjects\Projetos ED

Exemplo: java -jar CovidAnalyser.jar "/home/carlos/IdeaProjects/Projetos ED/out/artifacts/covidanalyser"

9. Os dados gerados na pasta data/dadosfinais são os arquivos csv que foram ordenados no processo para cada variável e cada caso. Na pasta data/dadosbrutos ficam todos os arquivos que foram gerados no processo e foram usados como fonte de dados, por exemplo, caso-limpo que é o arquivo gerado ao filtrar os dados. O arquivo de tempos fica na pasta data/dadosfinais/tempos.txt.