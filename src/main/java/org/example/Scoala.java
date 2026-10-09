package org.example;

import java.util.HashMap;
import java.util.Map;

public class Scoala
{
    public Map<String, Clasa> clase;

    public Map<String, ActivitateExtra> activitatiValabile;

    public Scoala(Map<String, Clasa> clase)
    {
        this.clase = clase;
        activitatiValabile = new HashMap<>();
    }

    public void AfiseazaTopActivitati()
    {
        System.out.println(activitatiValabile.values());
    }

    void addActivitateExtra(ActivitateExtra activitate)
    {
        activitatiValabile.put(activitate.numeActivitate, activitate);
    }

    void removeActivitateExtra(ActivitateExtra activitate)
    {
        activitatiValabile.remove(activitate.numeActivitate, activitate);
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
