
public class Main {
    public static void main(String[] args) {

        // TASK 1
        int monthNum = 0 ;
        int endSum =  2_459_000;
        int currentSum =  0;
        int fromSalary = 15000;
        float percSum = 0;
        while ((currentSum + percSum )< endSum) {
            percSum = percSum + currentSum * 0.01f ; // 12% в год - 1% в месяц
            currentSum = currentSum + fromSalary;

            monthNum ++ ;
            System.out.println("Задание 1. Месяц " + monthNum + ", cумма накоплений равна " + (currentSum + percSum) + " рублей. Из них  "+ percSum + " рублей - некапитализированные %% ");
        }
        // TASK 2
        String sStr = "";
        int i1 = 1;
        while (i1 <= 10){
            sStr = sStr + " " + i1;
            i1++;
        }
        System.out.println("Задание 2. ");
        System.out.println(sStr);
        sStr = "";
        for (i1 = 10; i1 != 0; i1--) {
            sStr = sStr + " " + i1;
        }
        System.out.println(sStr);

        System.out.println("Задание 3. ");
        int totalPopulation = 12_000_000;
        int yearlyBornPer1000 = 17;
        int yearlyDeathPer1000 = 8;
        for (i1=1; i1<=10;i1++) {
            totalPopulation = totalPopulation + totalPopulation/1000*(yearlyBornPer1000 - yearlyDeathPer1000);
            System.out.println("Год " + i1 + " прошёл, численность населения составляет " + totalPopulation);
        }
//      TASK 4 - 5
        System.out.println("Задание 4. ");
        monthNum = 0 ;
        endSum =  12_000_000;
        float currentSumF =  15000;
        while (currentSumF < endSum) {

            currentSumF = currentSumF + currentSumF * 0.07f ; //  7% в месяц;

            monthNum ++ ;
            if (monthNum % 6 ==0 )
            System.out.println("Задание 5. Месяц " + monthNum + ", cумма накоплений равна " + currentSumF + " рублей. ");
        }
        System.out.println("Что бы накопить более " + endSum + " руб. понадобилось " + monthNum + " месяцев . ");

        //      TASK 6
        System.out.println("Задание 6. ");

        currentSumF =  15000;
        for ( monthNum=1; monthNum<=(9*12);monthNum++) {

            currentSumF = currentSumF + currentSumF * 0.07f ; //  7% в месяц;

            if (monthNum % 6 ==0 )
                System.out.println("Задание 6. Месяц " + monthNum + ", cумма накоплений равна " + currentSumF + " рублей. ");
        }
        System.out.println("Через 9 лет сумма накоплений =  " + currentSumF + " руб.");
    }
}