package pl.sdacademy.java16poz.wstep.dataiczas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DataICzasMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 31.03.2019 10:08
 **/
public class DataICzasMain {

    public static void main(String[] args) {
        {
            System.out.println("=== zamienianie daty na napis === ");
            // zamienianie daty na napis
            LocalDateTime obecnaData = LocalDateTime.now();
            String formatDaty = "yyyy-MM-dd HH:mm:ss";

            // formaterDaty - formatuje date według formatu 'formatDaty'
            DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
            // metoda format zmienia datę na napis
            String dataSformatowanaJakoNapis = obecnaData.format(formaterDaty);

            System.out.println("Format daty: " + formatDaty);
            System.out.println("Data obiekt: " + obecnaData);
            System.out.println("Data jako napis: " + dataSformatowanaJakoNapis);

            System.out.println("---------------------------------------- ");

        }
        {
            System.out.println("=== zamienia napis na date === ");
            // zamienia napis na date
            String dataString = "2016-03-04 11:30";
            System.out.println("Napis: "+dataString);
            String formatDaty = "yyyy-MM-dd HH:mm";
            System.out.println("Format: "+formatDaty);



            DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
            // parser - zmienianie napisu na date typu LocalDateTime
            LocalDateTime dataObiekt = LocalDateTime.parse(dataString, formaterDaty);
            System.out.println("DataObiekt: "+dataObiekt);
            System.out.println("---------------------------------------- ");
        }


        LocalDateTime data1 = utworzDateZNapisu("yyyy-MM-dd HH:mm","2018-12-02 00:00");
        LocalDateTime data2 = utworzDateZNapisu("yyyy-MM-dd HH:mm","2019-01-22 00:00");
        boolean czyData1JestPrzedData2 = data1.isBefore(data2);
        // Zadanie: uzupełnij poniżej
        String formatTylkoDaty = "yyyy-MM-dd";
        String data1Napis = utworzNapisZDaty(formatTylkoDaty,data1);
        String data2Napis = utworzNapisZDaty(formatTylkoDaty,data2);
        String odpowiedz;
        if(czyData1JestPrzedData2){
            odpowiedz = "tak";
        }else{
            odpowiedz = "nie";
        }

        System.out.printf("Pytanie:\n\tCzy data %s jest przed %s\n\tOdp: %s\n",
                data1Napis,data2Napis,odpowiedz);

        String data3 = "2018-05-05";
        String data4 = "2012-10-10";
        boolean czyData3JestPrzedData4 = data3.isEmpty();

        // Zadanie: wyświetl w konsoli obecną datę.
        String dataObecnaNapis = obecnaData();
        System.out.println("Teraz: "+dataObecnaNapis);

    }

    /**
     * Zadanie: Zaimplementuj
     * @param format
     * @param dataNapis
     * @return
     */
    public static LocalDateTime utworzDateZNapisu(String format,String dataNapis){

//          1. napis daty - mamy jako argument
//          2. format daty - mamy jako argument
//          3. tworzymy formater, aby użyć go do parsowania
        DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(format);
//          4. używamy LocalDateTime.parse() i zamieniamy, z użyciem formatu i datyNapis
//          na dataObiekt czyli LocalDateTime

        LocalDateTime dataObiekt = LocalDateTime.parse(dataNapis,formaterDaty);
        return dataObiekt;
    }

    /**
     * Rozwiązanie: Metoda, która zamienia data w napis
     *
     * @param formatDaty
     * @param dataObiekt
     * @return
     */
    public static String utworzNapisZDaty(String formatDaty,LocalDateTime dataObiekt){
        // utworzono formaterDaty aby wykorzystać go podczas formatowania
        DateTimeFormatter formaterDaty = DateTimeFormatter.ofPattern(formatDaty);
        // formatowanie dataObiekt do napisu
        String dataJakoNapis = dataObiekt.format(formaterDaty);
        return dataJakoNapis;
    }

    /**
     * Metoda zwraca obecną datę w danym formacie
     * @return obecna data jako napis
     */
    public static String obecnaData(){
        return utworzNapisZDaty("dd-MM-yyyy HH:mm:ss",LocalDateTime.now());
    }
}
