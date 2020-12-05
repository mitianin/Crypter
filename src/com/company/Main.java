package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StringCrypter crypter = new StringCrypter(new CaesarSymbolCrypter(1));
        StringCrypter xor = new StringCrypter(new XorSymbolCrypter(1));
        Scanner s = new Scanner(System.in);

        Menu menu = new Menu();
        menu.addAction(new CaesarEncrypt(s, crypter));
        menu.addAction(new CaesarDecrypt(s, crypter));
        menu.addAction(new XorEncrypt(s, xor));
        menu.addAction(new XorDecrypt(s, xor));
        menu.addAction(new CloseAction());


        while (true) {
            menu.run();
            int choice = Integer.parseInt(s.nextLine());

            if (menu.getActions().get(choice - 1).close()) return;
            menu.getActions().get(choice - 1).doActions();

        }

    }
}
