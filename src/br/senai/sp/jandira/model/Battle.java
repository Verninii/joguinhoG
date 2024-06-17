package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Battle {
    String scenarioBattle;
    Scanner scanner = new Scanner(System.in);
    Scene scenario = new Scene();

    public void battle(Player player, Enemy enemy){
        boolean exit = false;
        while(!exit){

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy <= 0 ){
                System.out.println("O player " + player.getName() + " é o vencedor");
                exit = true;
            }else if (lifePlayer <= 0 ){
                System.out.println("O enemy " + enemy.getName() + " é o vencedor");
                break;
            }

            System.out.println("/----------------- Battle -------------------/");
            System.out.println("Ataque Player [ A ] " + player.getName() + ", life: " + player.getLife());
            System.out.println("Ataque Enemy [ B ] " + enemy.getName() + ", life: " + enemy.getLife());
            System.out.println("/--------------------------------------------/");

            String attack = scanner.nextLine();

            if (attack.equalsIgnoreCase("A")){
                System.out.println("/---------------------------/");
                System.out.println("/------O player atacou------/");
                System.out.println("/---------------------------/");

                int danoPlayer = (int) (Math.random() +20) +1;
                enemy.reduceLife(danoPlayer);

                System.out.println("/---------------------------/");
                System.out.println("O ataque foi de: " + danoPlayer);
                System.out.println("/---------------------------/");


            } else if (attack.equalsIgnoreCase("B")){
                System.out.println("/---------------------------/");
                System.out.println("/------O Enemy atacou------/");
                System.out.println("/---------------------------/");

                int danoEnemy = (int) (Math.random()+ 20) +1;
                player.reduceLife(danoEnemy);

                System.out.println("/---------------------------/");
                System.out.println("O ataque foi de: " + danoEnemy);
                System.out.println("/---------------------------/");
            }else {
                System.out.println("Tecla inválida !!!");
            }

        }
    }
    public void choiceScene (){
        System.out.println("/-------------------------------------/");
        System.out.println("Escolha um cenario: [1- Floresta] [2- Caverna] [3- Deserto] [Default - Senai Jandira]");
        System.out.println("/-------------------------------------/");

        int choiceSceneUser = scanner.nextInt();
        scenarioBattle = scenario.Scene(choiceSceneUser);

        System.out.println(scenarioBattle);
    }




}
