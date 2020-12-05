package com.company;

import java.util.Scanner;

public class CaesarDecrypt implements MenuActions {

    private String name = "2 - расшифровать шифром цезаря";

    Scanner sc;
    StringCrypter crypter;

    public CaesarDecrypt(Scanner sc, StringCrypter crypter) {
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
        System.out.println("Введите строку для расшифровки Цезарем");
        String s = sc.nextLine();
        System.out.println("Расшифрованная строка " + crypter.decrypt(s));

    }
}
