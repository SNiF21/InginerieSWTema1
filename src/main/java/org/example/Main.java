package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Elev e1 = new Elev(Gen.Masculin, "Ion");
        Elev e2 = new Elev(Gen.Feminin, "Maria");
        Elev e3 = new Elev(Gen.Feminin, "Larisa");

        List<Elev> listaElevi1 = new ArrayList<>();

        listaElevi1.add(e1);
        listaElevi1.add(e2);
        listaElevi1.add(e3);

        List<Elev> listaElevi2 = new ArrayList<>();

        listaElevi2.add(e2);
        listaElevi2.add(e3);
        listaElevi2.add(e1);

        Clasa clasa1 = new Clasa(30, NumarClasa.II, 'A', listaElevi1);
        Clasa clasa2 = new Clasa(28, NumarClasa.II, 'B', listaElevi2);

        System.out.println(clasa1.getTotalElevi());
        System.out.println(clasa2.getTotalElevi());
        System.out.println(" ");

        Elev e4 = new Elev(Gen.Feminin, "Ana");

        clasa1.addElev(e4);
        clasa2.addElev(e4);

        System.out.println(clasa1.getTotalElevi());
        System.out.println(clasa2.getTotalElevi());
        System.out.println(" ");

        clasa1.removeElev(e2);

        System.out.println(clasa1.getTotalElevi());
        System.out.println(clasa2.getTotalElevi());
        System.out.println(" ");

        Map<String, Clasa> clase = new HashMap<>();
        clase.put("Clasa 2", clasa2);

        Scoala scoala = new Scoala(clase);

        System.out.println("---");
        System.out.println(scoala.getNumarClase());
        System.out.println(scoala.getTotalElevi());
        System.out.println(" ");

        scoala.addClasa("Clasa 1", clasa1);

        System.out.println(scoala.getNumarClase());
        System.out.println(scoala.getTotalElevi());
        System.out.println(" ");

        scoala.addElevInClasa("Clasa 1", e2);
        scoala.removeElevByNume("Ion");

        System.out.println(scoala.getNumarClase());
        System.out.println(scoala.getTotalElevi());
        System.out.println(" ");

        scoala.removeClasa("Clasa 1");

        System.out.println(scoala.getNumarClase());
        System.out.println(scoala.getTotalElevi());
        System.out.println(" ");

        Profesor p1=new Profesor("Alex");
        Profesor p2=new Profesor("Tudor");

        ActivitateExtra a1=new ActivitateExtra("Cor", p1);
        ActivitateExtra a2=new ActivitateExtra("Fotbal", p2);

        System.out.println(" ");
        scoala.AfiseazaTopActivitati();
    }
}