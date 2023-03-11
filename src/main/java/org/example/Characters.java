package org.example;

import org.example.Interfaces.ForwardMovement;
import org.example.Interfaces.UpwardMovement;

public class Characters implements ForwardMovement, UpwardMovement {

    public Characters(String name){
        this.name = name;
    }
    private String name;

    /**
     * Проверка на то, что персонаж ещё не встречал препятствий, которые не мог пройти
     */
    protected boolean isNoDefeats = true;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getIsNoDefeats() {
        return isNoDefeats;
    }

    public void setNoDefeats(boolean isNoDefeats) {
        this.isNoDefeats = isNoDefeats;
    }

    /**
     *
     * @param treadmill проверка возможности персонажа пробежать по беговой дорожке через экземпляра класса Treadmill
     */
    @Override
    public void run(Treadmill treadmill) {}

    /**
     *
     * @param wall проверка возможности персонажа перепрыгнуть стену через экземпляра класса Wall
     */
    @Override
    public void jump(Wall wall) {}
}
