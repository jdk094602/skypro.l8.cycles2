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

    }
}