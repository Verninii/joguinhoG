package br.senai.sp.jandira.model;

public class Scene {

    public String Scene(int optionScene){

        String scenario = "Senai Jandira";

        switch (optionScene){
            case 1:
                scenario = "Floresta";
                break;
            case 2:
                scenario = "Caverna";
                break;
            case 3:
                scenario = "Deserto";
                break;
        }

        return scenario;

    }
}
