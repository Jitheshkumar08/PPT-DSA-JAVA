package day2;

import java.util.*;
import java.util.regex.*;

/*
KYC Validator
Consider that you are building console interface of customer's loan application where customer used to provide name, pan, aadhaar, email then they will set the password for their account. your role is to validate those information's using regex.

Example:
Input:
Name: "Raz",
Password: "razak$123",
Aadhaar: "765456787912",
PAN: "ABCDE1234F",
Email: "example@mail.com"

Output:
Account created

Example:
Input:
Name: "Ra",
Password: "razak$123",
Aadhaar: "7654567",
PAN: "ABCDE1234F",
Email: "example@mail.com"

Output:
Invalid name,invalid aadhaar

Example:
Input:
Name: "Raz",
Password: "razak123",
Aadhaar: "765456787912",
PAN: "ABCDE1234F",
Email: "example@mail.c"

Output:
Invalid password, invalid email
*/
public class KYCValidator {
    // Define regex patterns
    static Map<String, String> patterns = new HashMap<>();
    static {
        patterns.put("name", "^[A-Za-z ]{3,}$");
        patterns.put("password", "^(?=.*[@#$!])[A-Za-z0-9?=.@#$!*]{8,}$");
        patterns.put("aadhaar", "^[0-9]{12}$");
        patterns.put("pan", "^[A-Z]{5}[0-9]{4}[A-Z]{1}$");
        patterns.put("email", "^[a-z0-9-_]{2,}@[a-z]{3,}\\.[a-z]{2,}$");
    }
    // Validation method
    static String validateKYC(Map<String, String> userData) {
        boolean flag = true;
        for (Map.Entry<String, String> entry : userData.entrySet()) {
            String field = entry.getKey();
            String value = entry.getValue();
            String regex = patterns.get(field);
            if (!Pattern.matches(regex, value)) {
                System.out.println("Invalid " + field);
                flag = false;
            }
        }
        return flag ? "Account created" : "Invalid User data";
    }

    public static void main(String[] args) {
        // Valid case
        Map<String, String> user1 = new HashMap<>();
        user1.put("name", "Razak Mohamed S");
        user1.put("password", "Razak@123");
        user1.put("aadhaar", "987654567834");
        user1.put("pan", "ABCDE0882W");
        user1.put("email", "dlithe@gmail.com");

        System.out.println(validateKYC(user1));

        // Invalid case
        Map<String, String> user2 = new HashMap<>();
        user2.put("name", "Ra");
        user2.put("password", "Razak123");
        user2.put("aadhaar", "987567834");
        user2.put("pan", "ABCDE08");
        user2.put("email", "dlithe@gmil.m");

        System.out.println(validateKYC(user2));
    }
}
