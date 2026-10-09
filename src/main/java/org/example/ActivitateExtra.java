package org.example;

import java.util.HashSet;
import java.util.Set;

public class ActivitateExtra
{
    String numeActivitate;
    Profesor profesorCoordonator;
    Set<Elev> eleviInscrisi;


    public ActivitateExtra(String numeActivitate, Profesor profesorCoordonator)
    {
        this.numeActivitate = numeActivitate;
        this.profesorCoordonator = profesorCoordonator;
        this.eleviInscrisi = new HashSet<>();
    }

    void InscriereElev(Elev elev)
    {
        eleviInscrisi.add(elev);
        elev.inscrisActivitate = true;
    }

    void RetragereElev(Elev elev)
    {
        eleviInscrisi.remove(elev);
    }
}
