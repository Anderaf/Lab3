package org.example;

public class Entrance {
    public void Enter(Object obj) throws TunnelException {
        System.out.println(obj.toString() + " вошёл через проход");
    }
    public void Exit(Object obj) throws TunnelException {
        System.out.println(obj.toString() + " вышел через проход");
    }
    @Override
    public String toString() {
        return "Проход";
    }
}
