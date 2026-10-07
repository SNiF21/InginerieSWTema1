import java.util.Map;

public class Scoala
{
    public Map<String, Clasa> clase;

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
    void removeElevAfterNume(String s)
    {
        clase.get(s).removeElev(s);
    }
    getNumarClase(): int
    getTotalElevi(): int
}
