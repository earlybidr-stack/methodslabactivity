/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.methodsliveactivity2;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
public class MethodsLiveActivity2 {

    public static double calculateConsumptionCharge(double consumption, double rate) {
        return consumption * rate;
    }

    public static double calculateAdditionalCharge(double consumptionCharge, double percentage) {
        return consumptionCharge * (percentage / 100.0);
    }

    public static double calculateTotalBill(double consumptionCharge, double additionalCharge) {
        return consumptionCharge + additionalCharge;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Electricity Bill Calculator");
        System.out.print("Enter Electricity Consumption (kWh): ");
        double consumption = scanner.nextDouble();

        System.out.print("Enter Rate per kWh (e.g., 12.50): ");
        double rate = scanner.nextDouble();
        double percentage = 5.0;
        double consumptionCharge = calculateConsumptionCharge(consumption, rate);
        double additionalCharge = calculateAdditionalCharge(consumptionCharge, percentage);
        double totalBill = calculateTotalBill(consumptionCharge, additionalCharge);

        System.out.println("BILL SUMMARY");
        System.out.println("Description           | Amount");
        System.out.printf("Consumption Charge     | P%,.2f", consumptionCharge);
        System.out.printf("Additional Charge (5%) | P%,.2f", additionalCharge);
        System.out.printf("Total Electricity Bill | P%,.2f", totalBill);

        scanner.close();
    }

}
