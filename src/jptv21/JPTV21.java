/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21;

/**
 *
 * @author pupil
 */
public class JPTV21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====Фигуры=====");
            System.out.println("----Фигура_1----");

        for(int j=0; j<10; j++){ 
        for(int i=0; i<10; i++){System.out.print("* ");
}       System.out.println();

    }
    System.out.println("----Фигура_2----");
    System.out.print("Введите длинну: ");
        int lenght = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите ширину: ");
        int weight = scanner.nextInt();
        scanner.nextLine();
        for(int j=1; j<=lenght; j++){  
            for(int i=1; i<=weight; i++){
            if(j ==1 || j==lenght || i==1 || i==weight){
        System.out.print("* ");
            }
            else{
        System.out.print("  ");
                            }
            }
        System.out.println();
    }
           
}
