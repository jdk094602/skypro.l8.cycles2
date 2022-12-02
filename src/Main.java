
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

        //      TASK 7
        System.out.println("Задание 7. ");

        int dayNumFirstFridai = 6 ; // номер дня , на который приходится первая пятница недели (1-7)
        for (int i = dayNumFirstFridai; i <= 31; i++) {
            if ( (i - dayNumFirstFridai) % 7 == 0 ) {
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");

            }
        }
        //      TASK 8
        /*Мы решили написать астрономическое приложение, которое считает, когда над Землей пролетают кометы и их можно будет увидеть. Для начала нам нужно посчитать траекторию движения кометы, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.

Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда мы увидим ее в следующий раз.

Условия задачи:

В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления.

Для вычисления периода можно создать две дополнительные переменные, которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта и 100 лет после в качестве завершения периода расчета.

В результате решения задачи в консоль должен вывестись следующий результат:

1896

1975

2054

*/
        System.out.println("Задание 8. ");
        int cometaYearsCycle = 79 ;
        int nowYear = 2022;
        int firstYear = nowYear - 200;
        int lastYear = nowYear + 79;
        for (int i = firstYear; i <= lastYear; i++) {
            if (i % cometaYearsCycle == 0) {
                System.out.println("Год пролёта кометы " + i);

            }
        }
/* task 9
* Напишите программу, которая выводит в консоль таблицу умножения на 2:

2*1=2

2*2=4

2*3=6

2*4=8

2*5=10

2*6=12

2*7=14

2*8=16

2*9=18

2*10=20




* */
        System.out.println("Задание 9. ");
        int osnova = 2;
        for (int i =1; i<=10; i++ ) {

            System.out.println(osnova + "*" + i + "=" + osnova*i );
        }
    }
}