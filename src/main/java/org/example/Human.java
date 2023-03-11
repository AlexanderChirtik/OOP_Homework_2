package org.example;

public class Human extends Characters{
    public Human(String name) {
        super(name);
    }


    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() < 80)
            System.out.println("Человек смог пробежать по беговой дорожке");
        else {
            System.out.println("Дорожка слишком длинная, человек устал и не добежал!");
            isNoDefeats = false;
        }

    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() < 50)
            System.out.println("Человек перепрыгнул стену");
        else {
            System.out.println("Стена слишком высокая, человеку не перепрыгнуть!");
            isNoDefeats = false;
        }
    }
}
