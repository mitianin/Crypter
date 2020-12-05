package com.company;

public class XorSymbolCrypter implements SymbolCrypter {
    private int key;

    public XorSymbolCrypter(int key) {
        this.key = key;
    }

    @Override
    public char crypt(char ch) {
        return (char) (ch ^ key);
    }

    @Override
    public char decrypt(char ch) {
        return (char) (ch ^ key);
    }
}
