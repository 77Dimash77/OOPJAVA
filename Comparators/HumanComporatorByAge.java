package ru.gb.homework1_famly_tree.Comparators;

import ru.gb.homework1_famly_tree.Interfaces.GroupItem;

import java.util.Comparator;

public class HumanComporatorByAge <T extends GroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}