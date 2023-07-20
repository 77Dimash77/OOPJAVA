package ru.gb.final_famly_tree.commands;


import ru.gb.final_famly_tree.View.ConsoleUI;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }
    public String getDescription(){
        return description;
    }
    public abstract void execute();
}
