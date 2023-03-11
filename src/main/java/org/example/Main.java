package org.example;

public class Main {
    public static void main(String[] args) {

        Characters[] members = {new Cat("Барсик"), new Robot("T80A"), new Human("Василий"),
                new Cat("Пушок"), new Human("Виктория")};

        Obstacles[] obstacles = {new Wall(45), new Treadmill(70), new Wall(37), new Treadmill(81)};



        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j] instanceof Wall){
                    members[i].jump((Wall) obstacles[j]);
                    if (members[i].getIsNoDefeats() == false){
                        System.out.println("Участник проиграл и выбывает!\n");
                        j = obstacles.length;
                    }
                }
                else {
                    members[i].run((Treadmill) obstacles[j]);
                    if (members[i].getIsNoDefeats() == false){
                        System.out.println("Участник проиграл и выбывает!\n");
                        j = obstacles.length;
                    }
                }
                if (j == obstacles.length - 1)
                    System.out.println("Ура победителю!\n");
            }
        }
    }
}