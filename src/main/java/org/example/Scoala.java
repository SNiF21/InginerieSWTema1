package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<ActivitateExtra> lista = new ArrayList<>(activitatiValabile.values());

        for (int i = 0; i < lista.size() - 1; i++)
        {
            for (int j = i + 1; j < lista.size(); j++)
            {
                if (lista.get(j).eleviInscrisi.size() > lista.get(i).eleviInscrisi.size())
                {
                    ActivitateExtra aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }

        for (int i = 0; i < lista.size(); i++)
        {
            ActivitateExtra a = lista.get(i);
            System.out.println(a.numeActivitate + " " + a.eleviInscrisi.size() + " elevi inscrisi");
        }
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

    int getTotalEleviInscrisiUnici()
    {
        int total = 0;
        for (Clasa c : clase.values())
        {
            int i = 0;
            while (i < c.elevi.size())
            {
                Elev e = c.elevi.get(i);
                if (e.inscrisActivitate)
                    total++;
                i++;
            }
        }
        return total;
    }
}
