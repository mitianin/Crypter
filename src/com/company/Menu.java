package com.company;

import java.util.ArrayList;
import java.util.List;

public class Menu {


    private List<MenuActions> actions = new ArrayList<>();

    void addAction(MenuActions action) {
        actions.add(action);
    }

    void run() {
        for (MenuActions action : actions
        ) {
            System.out.println(action.getName());
        }
    }

    List<MenuActions> getActions() {
        return actions;
    }
}