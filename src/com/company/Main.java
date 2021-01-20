package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday;
        int monthOfBirthday;
        int dayOfBirthday;
        yearOfBirthday = 1984;
        monthOfBirthday = 3;
        dayOfBirthday =17;
        int sum;
        sum =  yearOfBirthday+monthOfBirthday+dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения: "+sum);

        boolean monthBiggerDay;
        monthBiggerDay=monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: "+monthBiggerDay);

        char [] name = new char[4];
        name[0]='К';
        name[1]='а';
        name[2]='т';
        name[3]='я';
        System.out.print("Массив с моим именем:");

        for (int i = 0; i <=3; i++) {
            System.out.print(name[i]);
        }
        System.out.println();

        double myAge =36;
        double partYear = 10.00/12.00;
        DecimalFormat df= new DecimalFormat("#.##");
        System.out.println("Мне  "+(df.format(myAge + partYear))+ " лет" );
    }
}
