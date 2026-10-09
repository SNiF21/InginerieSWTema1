package org.example;

import java.util.Collection;
import java.util.Iterator;
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
        eleviInscrisi = new Set<Elev>()
        {
            @Override
            public int size()
            {
                return 0;
            }

            @Override
            public boolean isEmpty()
            {
                return false;
            }

            @Override
            public boolean contains(Object o)
            {
                return false;
            }

            @Override
            public @org.jetbrains.annotations.NotNull Iterator<Elev> iterator()
            {
                return null;
            }

            @Override
            public Object @org.jetbrains.annotations.NotNull [] toArray()
            {
                return new Object[0];
            }

            @Override
            public <T> T @org.jetbrains.annotations.NotNull [] toArray(T @org.jetbrains.annotations.NotNull [] a)
            {
                return null;
            }


            public boolean add(Elev elev)
            {
                eleviInscrisi.add(elev);
                return false;
            }

            @Override
            public boolean remove(Object o)
            {
                eleviInscrisi.remove(o);
                return false;
            }

            @Override
            public boolean containsAll(@org.jetbrains.annotations.NotNull Collection<?> c)
            {
                return false;
            }

            @Override
            public boolean addAll(@org.jetbrains.annotations.NotNull Collection<? extends Elev> c)
            {
                return false;
            }

            @Override
            public boolean retainAll(@org.jetbrains.annotations.NotNull Collection<?> c)
            {
                return false;
            }

            @Override
            public boolean removeAll(@org.jetbrains.annotations.NotNull Collection<?> c)
            {
                return false;
            }

            @Override
            public void clear()
            {

            }

            @Override
            public boolean equals(Object o)
            {
                return false;
            }

            @Override
            public int hashCode()
            {
                return 0;
            }
        };
    }

    void InscriereElev(Elev elev)
    {
        eleviInscrisi.add(elev);
    }

    void RetragereElev(Elev elev)
    {
        eleviInscrisi.remove(elev);
    }
}
