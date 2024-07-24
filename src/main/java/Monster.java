import java.util.HashMap;

public class Monster
{
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHP;
    private HashMap<String, Integer> items;


    public Monster(Integer MaxHP, Integer xp, HashMap<String, Integer> items){
        this.maxHP = MaxHP;
        this.hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    public Integer getHp()
    {
        return hp;
    }

    public HashMap<String, Integer> getItems()
    {
        return items;
    }

    public void setItems(HashMap<String, Integer> items)
    {
        this.items = items;
    }

    public Integer getXp()
    {
        return xp;
    }

    public Integer getMaxHP()
    {
        return maxHP;
    }

    @Override public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Monster monster = (Monster) o;

        if (!hp.equals(monster.hp))
            return false;
        if (!xp.equals(monster.xp))
            return false;
        if (!maxHP.equals(monster.maxHP))
            return false;
        return items.equals(monster.items);
    }

    @Override public int hashCode()
    {
        int result = hp.hashCode();
        result = 31 * result + xp.hashCode();
        result = 31 * result + maxHP.hashCode();
        result = 31 * result + items.hashCode();
        return result;
    }

    @Override public String toString()
    {
        return "hp=" + this.hp +"/"+ this.maxHP;
    }
}
