
import java.util.Scanner;

class Patient {

    private String name;
    private int age;
    private double weightKg;
    private double heightMeters;
    private double fatRate;

    public Patient() {
    }

    public Patient(String name, int age, double weightKg, double heightMeters, double fatRate) {
        this.name = name;
        this.age = age;
        this.weightKg = weightKg;
        this.heightMeters = heightMeters;
        this.fatRate = fatRate;
    }

    public double calculateBMI() {
        return weightKg / (heightMeters * heightMeters);
    }

    public String getBMICategory() {
        double bmi = calculateBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public double calculateBodyAge() {

        double bmi = calculateBMI();
        return age + (bmi - 22.0);
    }

    public void printReport() {
        double bmi = calculateBMI();
        double bodyAge = calculateBodyAge();

        System.out.println("\n----- Health Report -----");
        System.out.println("Name      : " + getName());
        System.out.println("Age       : " + getAge());
        System.out.println("Weight    : " + getWeightKg() + " kg");
        System.out.println("Height    : " + getHeightMeters() + " m");
        System.out.println("Fat Rate  : " + getFatRate() + " %");
        System.out.printf("BMI       : %.1f\n", bmi);
        System.out.println("BMI Type  : " + getBMICategory());
        System.out.printf("Body Age  : %.1f\n", bodyAge);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setHeightMeters(double heightMeters) {
        this.heightMeters = heightMeters;
    }

    public void setFatRate(double fatRate) {
        this.fatRate = fatRate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getHeightMeters() {
        return heightMeters;
    }

    public double getFatRate() {
        return fatRate;
    }
}

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter weight (kg): ");
        double weightKg = scanner.nextDouble();

        System.out.print("Enter height (m): ");
        double heightMeters = scanner.nextDouble();

        System.out.print("Enter fat rate (%): ");
        double fatRate = scanner.nextDouble();

        Patient profile = new Patient();
        profile.setName(name);
        profile.setAge(age);
        profile.setWeightKg(weightKg);
        profile.setHeightMeters(heightMeters);
        profile.setFatRate(fatRate);
        profile.printReport();

        scanner.close();
    }
}
