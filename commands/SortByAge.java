package ru.gb.final_famly_tree.commands;


import ru.gb.final_famly_tree.View.ConsoleUI;

public class SortByAge extends Command {
    public SortByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "сортировать сриок по возросту";
    }

    public void execute() {
        consoleUI.sortByAge();
}
}