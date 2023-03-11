package org.example;

public class Robot extends Characters{
    public Robot(String name) {
        super(name);
    }


    @Override
    public void run(Treadmill treadmill) {
        if (treadmill.getLength() < 40)
            System.out.println("Робот пробежал необходимую длину");
        else {
            System.out.println("У робота не хватило энергии, чтобы добежать до конца!");
            isNoDefeats = false;
        }
    }

    @Override
    public void jump(Wall wall) {
        if (wall.getHeight() < 20)
            System.out.println("Робот перепрыгнул препятствие");
        else {
            System.out.println("Механизмы робота ещё не достаточно совершены, такую стену не перепрыгнуть!");
            isNoDefeats = false;
        }
    }
}
