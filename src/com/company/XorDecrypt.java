package com.company;

import java.util.Scanner;

public class XorDecrypt implements MenuActions {
    private String name = "4 - расшифровать шифром xor";

    Scanner sc;
    StringCrypter crypter;

    public XorDecrypt(Scanner sc, StringCrypter crypter) {
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
        System.out.println("Введите строку для расшифровки XOR");
        String s = sc.nextLine();
        System.out.println("Расшифрованная строка " + crypter.decrypt(s));
    }
}
