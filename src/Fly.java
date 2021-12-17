import java.util.ArrayList;

class Fly
{
    protected String name;
    protected int maxHeigh;
    public Fly()
    {
        name="Без названия";
        maxHeigh=0;
    }
    public Fly(String name,int maxHeigh)
    {
        this.name=name;
        this.maxHeigh=maxHeigh;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setHeigh(int maxHeigh)
    {
        this.maxHeigh=maxHeigh;
    }
    public int getHeigh()
    {
        return maxHeigh;
    }

}
class Plane extends Fly
{
    int scope;
    public Plane(String name,int maxHeigh,int scope)
    {
        super(name,maxHeigh);
        this.scope=scope;
    }
    public void setScope(int scope)
    {
        this.scope=scope;
    }
    public int getScope()
    {
        return scope;
    }
    public String toString()
    {
        String res="Название - "+getName()+" Максимальная высота - "+getHeigh()+" Размах крыльев - "+getScope();
        return res;
    }
}
class Helicopter extends Fly
{
    int maxSpeed;
    public Helicopter(String name,int maxHeigh,int maxSpeed)
    {
        super(name,maxHeigh);
        this.maxSpeed=maxSpeed;
    }
    public void setmaxSpeed(int maxSpeed)
    {
        this.maxSpeed=maxSpeed;
    }
    public int getmaxSpeed()
    {
        return maxSpeed;
    }
    public String toString()
    {
        String res="Название - "+getName()+" Максимальная высота - "+getHeigh()+" Максимальная скорость - "+getmaxSpeed();
        return res;
    }
}
class Company
{
    private ArrayList<Fly> masFly=new ArrayList<Fly>();

    public void Add(Fly m)
    {
        masFly.add(m);
    }

    public Company (){ }
    public void count()
    {
        int planes=0;
        int hel=0;
        for (Fly a:masFly)
            if (a instanceof Plane)
                planes++;
            else hel++;
        System.out.println("В авикомпании самолетов - "+planes);
        System.out.println("В авикомпании вертолетов - "+hel);
    }
    public Company(ArrayList<Fly> n)
    {
        masFly=n;
    }

    public void printCompany()
    {
        System.out.println("В Авиакомании: ");
        for (Fly a:masFly)
        {
            System.out.println("\t"+a.toString());
        }
    }
}
