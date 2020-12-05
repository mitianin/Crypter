package com.company;

public class StringCrypter {

    SymbolCrypter symbolCrypter;

    public StringCrypter(SymbolCrypter symbolCrypter) {
        this.symbolCrypter = symbolCrypter;
    }

    String crypt(String s) {
        StringBuilder crypt = new StringBuilder();

        for (Character ch : s.toCharArray()
        ) {
            crypt.append(symbolCrypter.crypt(ch));
        }

        return crypt.toString();
    }

    String decrypt(String s) {
        StringBuilder crypt = new StringBuilder();

        for (Character ch : s.toCharArray()
        ) {
            crypt.append(symbolCrypter.decrypt(ch));
        }

        return crypt.toString();
    }
}
