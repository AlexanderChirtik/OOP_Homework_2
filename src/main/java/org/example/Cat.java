package org.example;

public class Cat extends Characters{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() < 100)
            System.out.println("Кот успешно пробежал");
        else {
            System.out.println("Коту лень столько бежать!");
            isNoDefeats = false;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() < 100)
            System.out.println("Кот преодалел стену");
        else {
            System.out.println("Слишком высокая стена для кота!");
            isNoDefeats = false;
        }
    }
}
