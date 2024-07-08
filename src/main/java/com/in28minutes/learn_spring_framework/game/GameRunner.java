package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println(game + " is running");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
