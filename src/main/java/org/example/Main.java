package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Policeman otherPoliceman = new Policeman("Другой полицейский", 27, "31fad43bc6");
        System.out.println(otherPoliceman.toString() + " - Создан");

        Policeman thirdPoliceman = new Policeman("Третий полицейский", 33, "31f1113bc6");
        System.out.println(thirdPoliceman.toString() + " - Создан");
        thirdPoliceman.setStatus(Status.Suffocating);
        Gag gag = new Gag("Кляп обычный", "Просто обычный кляп", Material.Undefined, 5);
        thirdPoliceman.putOn(gag);

        Policeman fourthPoliceman = new Policeman("Четвертый полицейский", 44, "31faa144c6");
        System.out.println(fourthPoliceman.toString() + " - Создан");
        Hat hat1 = new Hat("Каска", "Какая-то каска", Material.Undefined, 6);
        fourthPoliceman.putOn(hat1);

        Policeman fifthPoliceman = new Policeman("Пятый полицейский", 55, "31faa1c4c6");
        System.out.println(fifthPoliceman.toString() + " - Создан");
        fifthPoliceman.setStatus(Status.Puking);

        Policeman randomPoliceman1 = new Policeman("Случайный полицейский 1", 69, "f228a13376");
        System.out.println(randomPoliceman1.toString() + " - Создан");
        randomPoliceman1.setStatus(Status.Puking);

        Policeman randomPoliceman2 = new Policeman("Случайный полицейский 2", 29, "f218a1369b");
        System.out.println(randomPoliceman2.toString() + " - Создан");
        randomPoliceman2.setStatus(Status.Easiness);

        System.out.println();

        otherPoliceman.say("Я внезапно ощутил как бы толчок в грудь, да такой сильный, что полетел вверх тормашками, однако не упал на землю, а принялся носиться по воздуху, словно воздушный шар.");
        thirdPoliceman.say("В первый момент у меня неожиданно захватило дыхание и было такое ощущение, будто в рот мне сунули кляп, а когда я очнулся, то увидел, что парю в воздухе вместе с остальными полицейскими.");
        fourthPoliceman.say("У меня не было ощущения кляпа во рту, но вместо этого я почувствовал, будто волосы у меня на голове зашевелились и встали дыбом. Боясь, как бы каска не слетела с моей головы, я протянул руки кверху, но тут же опрокинулся навзничь и, вместо того чтоб упасть на землю, заскользил на спине по воздуху, словно по льду.");
        fifthPoliceman.say("Абсолютно не помню, что со мной происходило, помню лишь, что летал по воздуху и при этом меня тошнило с такой страшной силой, что я чуть не потерял сознание.");
        randomPoliceman1.say("Меня тоже тошнило от страха");
        randomPoliceman2.say("Я ощущал во всем теле необычайную легкость. Руки у меня и ноги как бы отнялись и ничего не весили, то есть я вовсе не замечал, что они у меня есть");
        System.out.println("Остальные полицейские тотчас же подтвердили, что и у них были такие же ощущения.");
        System.out.println();

        Tunnel tunnel = new Tunnel(10);
        Child alice = new Child("Алиса", 14);
        Rabbit rabbit = new Rabbit("Белый кролик", 4, Color.WHITE);
        try {
            tunnel.entrance1.Enter(rabbit);
            tunnel.entrance2.Exit(rabbit);
            tunnel.entrance1.Enter(alice);
        }
        catch (TunnelException e){
            System.out.println("\u001B[31m" + e.getMessage() + "\u001B[37m");
        }
        //Tunnel tunnel2 = new Tunnel(14);
        //Tunnel longestTunnel = Tunnel.TunnelCalculator.getLongerTunnel(tunnel, tunnel2);
        //System.out.println(longestTunnel.getTunnelLength());
        //System.out.println(tunnel.getIronMoleculesAmount());
    }
}