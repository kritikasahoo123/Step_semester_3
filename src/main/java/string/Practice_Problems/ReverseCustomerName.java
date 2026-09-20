package main.java.string.Practice_Problems;

public class ReverseCustomerName {

    public String reverseCustomerName(String customerName) {

        char[] characters = customerName.toCharArray();

        String reversed = "";

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }

        return reversed;
    }

    public static void main(String[] args) {

        ReverseCustomerName reverser =
            new ReverseCustomerName();

        String customerName = "Sunil";

        String reversedName =
            reverser.reverseCustomerName(customerName);

        System.out.println(
            "Original Name: " + customerName
        );

        System.out.println(
            "Reversed Name: " + reversedName
        );
    }
}