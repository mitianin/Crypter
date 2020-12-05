package com.company;

public class CloseAction implements MenuActions {
    private String name = "5 - выход";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doActions() {
        close();
    }

    @Override
    public boolean close() {
        return true;
    }


}
