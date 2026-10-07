package org.example;

import java.util.Map;

public class Scoala
{
    public Map<String, Clasa> clase;

    public Scoala(Map<String, Clasa> clase)
    {
        this.clase = clase;
    }

    void addClasa(String s, Clasa c)
    {
        clase.put(s, c);
    }

    void removeClasa(String s)
    {
        clase.remove(s);
    }

    void addElevInClasa(String s, Elev e)
    {
        clase.get(s).addElev(e);
    }

    void removeElevByNume(String s)
    {
        for (Clasa c : clase.values())
        {
            int i = 0;
            while (i < c.elevi.size())
            {
                Elev e = c.elevi.get(i);
                if (e.nume.equals(s))
                    c.elevi.remove(i);
                else
                    i++;
            }
        }
    }

    int getNumarClase()
    {
        return clase.size();
    }

    int getTotalElevi()
    {
        int total = 0;
        for (Clasa c : clase.values())
        {
            int i = 0;
            total += c.elevi.size();
        }
        return total;
    }
}
