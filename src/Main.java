public class Main {
    public static void main(String[] args) {

        // task 1
        int age = (int) (Math.random() * 30 + 1);
        String postfixAge = age % 10 == 1 && age != 11? " году" : " годам";

        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то он уже совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age +  postfixAge + ", то возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        // task 2
        int temperature = (int) (Math.random() * 30 - 10);

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, холодно, нужно надеть шапку.");
        } else {
            System.out.println("Сегодня +" + temperature + " градусов, тепло, можно идти без шапки.");
        }

        // task 3
        int speed = (int) (Math.random() * 60 + 30);

        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }

        // task 4
        if (age == 1) {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то ему хорошо с мамой.");
        } else if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то ему нужно ходить в школу.");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + age + postfixAge + ", то ему нужно ходить на работу.");
        }

        // task 5
        int childAge = (int) (Math.random() * 17 + 1);
        String postFixChildAge = childAge % 10 == 1 && childAge != 11? " году" : " годам";

        if(childAge <= 5) {
            System.out.println("Если возраст ребёнка равен " + childAge + postFixChildAge + ", то ему нельзя кататься на аттракционе.");
        } else if (childAge > 5 && age <= 14){
            System.out.println("Если возраст ребёнка равен " + childAge + postFixChildAge + ", то он может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребёнка равен " + childAge + postFixChildAge + ", то он может кататься без сопровождения взрослого.");
        }

        // task 6
        int passengers = (int) (Math.random() * 102);
        int freeSeats = 60 - passengers;
        int freeStandingSeats = 102 - passengers;

        String  postfixPassengers = passengers % 10 == 1 && passengers != 11? " пассажир"
                : (passengers % 10 > 1 && passengers % 10 < 5 && (passengers < 12 || passengers > 14)) ? " пассажира"
                : " пассажиров";
        String  postfixSeat = freeSeats % 10 == 1 && freeSeats != 11? " стоячее место"
                : (freeSeats % 10 > 1 && freeSeats % 10 < 5 && (freeSeats < 12 || freeSeats > 14)) ? " стоячих места"
                : " стоячих мест";
        String  postfixStandingSeat = freeStandingSeats % 10 == 1 && freeStandingSeats != 11? " сидячее место"
                : (freeStandingSeats % 10 > 1 && freeStandingSeats % 10 < 5 && (freeStandingSeats < 12 || freeStandingSeats > 14)) ? " сидячих места"
                : " сидячих мест";

        if ( passengers < 60 ) {
            System.out.println("В вагоне находятся " + passengers + postfixPassengers + ". поэтому есть " + (60 - passengers) + postfixSeat);
        } else if (passengers <= 102) {
            System.out.println("В вагоне находятся " + passengers + postfixPassengers + ", поэтому нет сидячих мест, но есть " + (102 - passengers) + postfixStandingSeat);
        } else {
            System.out.println("Вогон полностью забит");
        }

        // task 7
        int one = 123;
        int two = 789;
        int three = 456;

        String outString = String.valueOf(
                one > two? one > three?  one
                : two > three? two
                    : three
                : two > three? two
                    : three);
        System.out.println(outString);

    }
}