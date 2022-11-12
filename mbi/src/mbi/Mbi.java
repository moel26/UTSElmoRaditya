package mbi;

import java.util.Scanner;
public class Mbi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        
        System.out.println("Masukkan berat badan:");
        berat = input.nextInt();
        System.out.println("Masukkan tinggi badan:");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("hasil BMI :"+ bmi);
        
        if(bmi<18.5){
            System.out.println("Kurang berat badan");
        }
        else if(bmi<22.9){
            System.out.println("Normal");
        }
        else if(bmi<24.9){
            System.out.println("Kelebihan berat badan");
        }
        else if(bmi<29.9){
            System.out.println("Obesitas tingkat 1");
        }
        else if(bmi>30){
            System.out.println("Obesitas tingkat 2");
        }
    }
    
}
