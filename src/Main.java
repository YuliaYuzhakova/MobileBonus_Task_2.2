public class Main {
    public static void main(String[] args) {
        int startAmount = 100; //Сумма на счете
        int topUp = 1000; //Сумма пополнения счета

        if (topUp >= 1000) {
            int bonus = (topUp / 100); //Величина бонуса
            int totalAmount = (startAmount + topUp + bonus);
            System.out.println("Ваш бонус равен:" + bonus);
            System.out.println("Сумма на вашем счете:" + totalAmount);
        } else {
            int bonus = 0; //Величина бонуса
            int totalAmount = (startAmount + topUp + bonus);
            System.out.println("Ваш бонус равен:" + bonus);
            System.out.println("Сумма на вашем счете:" + totalAmount);
        }
    }
}
