
package com.Demo_01;
import java.util.Scanner;

public class Test_28 {

    public static void main(String[] args) {
        System.out.println("绋庡悗宸ヨ祫鏄細"+fianceSelect());
    }

    private static float fianceSelect(){
        Scanner scan = new Scanner(System.in);
        System.out.println("杈撳叆宸ヨ祫锛�");
        int salary = scan.nextInt();
        System.out.println("杈撳叆鍔犵彮琛ヨ创锛�");
        int gave = scan.nextInt();
        int before = salary + gave;

        if(before < 0)
            throw new IllegalArgumentException("宸ヨ祫涓嶈兘涓鸿礋鐨勶紒");

        if(before < 3000)
            return before;

        int[] standard = new int[]{3000,12000,25000,35000,55000,80000};
        int[] salaryStandard = new int[]{3000,9000,13000,10000,20000,25000};
        float after = 0;
        int shouldCount = before - 3000;
        for(int i = 0;i<= standard.length;i++){
            if(i == standard.length || standard[i] > shouldCount){
                after += (shouldCount - standard[i - 1]) * getPercent(i);
                break;
            }
            after += salaryStandard[i] * getPercent(i);
        }

        return before - after;
    }

    private static float getPercent(int type){
        return switch (type) {
            case 0 -> 0.03f;
            case 1 -> 0.1f;
            case 2 -> 0.2f;
            case 3 -> 0.25f;
            case 4 -> 0.3f;
            case 5 -> 0.35f;
            default -> 0.4f;
        };
    }
}