package com.company;

import java.util.Scanner;

public class XorEncrypt implements MenuActions {
    private String name = "3 - зашифровать шифром xor";

    Scanner sc;
    StringCrypter crypter;

    public XorEncrypt(Scanner sc, StringCrypter crypter) {
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
        System.out.println("Введите строку для зашифровки XOR");
        String s = sc.nextLine();
        System.out.println("Зашифрованная строка " + crypter.crypt(s));
    }
}
