/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10);
        System.out.print("Программа задумала число от 0 до 9! Попробуй отгадать: ");
        int userNumber = scanner.nextInt();
        if(userNumber == number) {
            System.out.println("Ура! Ты выиграл!");
        }else{
            System.out.println(":(, проиграл, задумано: "+number);
        }
            
    }
    
}
