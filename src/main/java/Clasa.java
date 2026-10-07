import java.util.List;

public class Clasa
{
    Integer capacitate;
    NumarClasa numar;
    char litera;
    List<Elev> elevi;

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
