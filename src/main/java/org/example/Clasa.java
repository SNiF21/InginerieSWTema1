package org.example;

import java.util.List;

public class Clasa
{
    Integer capacitate;
    NumarClasa numar;
    char litera;
    List<Elev> elevi;

    public Clasa(Integer capacitate, NumarClasa numar, char litera, List<Elev> elevi)
    {
        this.capacitate = capacitate;
        this.numar = numar;
        this.litera = litera;
        this.elevi = elevi;
    }

    void addElev(Elev elev)
    {
        elevi.add(elev);
    }

    void removeElev(Elev elev)
    {
        elevi.remove(elev);
    }

    int getTotalElevi()
    {
        return elevi.size();
    }
}
