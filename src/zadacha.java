public class zadacha {

    public static void main (String [] args) {
        //Вася получает зарплату в 5,6 евро в час Он работает. 12 часов в день
        // у него нет выходных, кроме 31 декабря. Он работает 364 дня в год
        //Сколько часов отработает Вася за год и сколько он заработает денег

        //Ему дали отпуск в течение двух недель, он оплачивает в 50% от зп,
        // пересчитайте зарплату в год

        double salaryForHour = 5.6;
        int hoursPerDay = 12;
        int days = 364;

        System.out.println(hoursPerDay * days); // кол во часов за год
        System.out.println(salaryForHour* hoursPerDay * days); //зарплата за год


        double cashFromWork =salaryForHour * hoursPerDay * (days - 14);
        System.out.println(cashFromWork);

        double vacationMoney = salaryForHour * hoursPerDay * 14 / 2;
        System.out.println(vacationMoney);

        System.out.println(cashFromWork + vacationMoney);


    }
}
