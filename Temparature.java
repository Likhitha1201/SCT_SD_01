/*** 
    @Author: Likhitha S
    @Date: 05-01-2025 17:30
    @Last Modified by: Likhitha S
    @Last Modified time: 06-01-2025 11:30
    @Title:create a program that converts temparature to celsius, fahrenheit, kelvin scales.
           
*/

import java.util.Scanner;

class Temparature{

    /***
            Description: 
                This methods are used to convert given scales to prefereed type of tempareature.
            Parameters: 
                celsius, fahrenheit, kelvin are the temparature used to convert into preffered one.
            return:
                It returns in the finally converted value og given temparature.
     */

    static float celsiusToFahrenheit(float celsius){
        return (celsius * 9/5) + 32;
    }

    static double celsiusToKelvin(float celsius){
        return celsius + 273.15;
    }

    static float fahrenheitToCelsius(float fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

    static double fahrenheitToKelvin(float fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    static double kelvinToCelsius(float kelvin){
        return kelvin - 273.15;
    }

    static double kelvinToFahrenheit(float kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }
    public static void main(String[] args){
        System.out.println("Convertion of Temparature...!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice between 1 to 6 :\n 1. Celsius To Fahrenheit \n 2. Celsius To Kelvin \n 3. Fahrenheit To Celsius \n 4. Fahrenheit To Kelvin \n 5. Kelvin To Celsius \n 6. Kelvin To Fahrenheit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Celsius number:");
                float celsius = sc.nextFloat();
                System.out.println("Celsius To Fahrenheit will be:"+celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Enter Celsius number:");
                float celsiuss = sc.nextFloat();
                System.out.println("Celsius To Kelvin will be:"+celsiusToKelvin(celsiuss));  
                break;
            case 3:
                System.out.println("Enter Fahrenheit number:");
                float fahrenheit = sc.nextFloat();
                System.out.println("Fahrenheit To Celsius will be:"+fahrenheitToCelsius(fahrenheit));   
                break;
            case 4:
                System.out.println("Enter Fahrenheit number:");
                float fahrenheitt = sc.nextFloat();
                System.out.println("Fahrenheit To Kelvin will be:"+fahrenheitToKelvin(fahrenheitt));   
                break;
            case 5:
                System.out.println("Enter Kelvin number:");
                float kelvin = sc.nextFloat();
                System.out.println("Kelvin To Celsius will be:"+kelvinToCelsius(kelvin));   
                break;
            case 6:
                System.out.println("Enter Kelvin number:");
                float kelvinn = sc.nextFloat();
                System.out.println("Kelvin To Celsius will be:"+kelvinToFahrenheit(kelvinn));
                break;
            default:
                System.out.println("Invalid Choice");
            sc.close();
        }
    }
}