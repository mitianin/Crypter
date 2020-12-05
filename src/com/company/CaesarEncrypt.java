package com.company;

import java.util.Scanner;

public class CaesarEncrypt implements MenuActions {
    private String name = "1 - зашифровать шифром цезаря";

    Scanner sc;
    StringCrypter crypter;

    public CaesarEncrypt(Scanner sc, StringCrypter crypter) {
        this.sc = sc;
        this.crypter = crypter;
    }

    @Override
    public boolean close() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void doActions() {
        System.out.println("Введите строку для зашифровки цезарем");
        String s = sc.nextLine();
        System.out.println("Зашифрованная строка " + crypter.crypt(s));
    }
}
