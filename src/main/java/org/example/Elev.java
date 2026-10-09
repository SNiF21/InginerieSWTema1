package org.example;

public class Elev
{
    String nume;
    Gen gen;
    Boolean inscrisActivitate;

    public Elev(Gen gen, String nume)
    {
        this.gen = gen;
        this.nume = nume;
        this.inscrisActivitate = false;
    }
}
