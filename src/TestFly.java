import java.util.Scanner;

public class TestFly
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;//количество обьектов в компании
        System.out.println("Введите количество объектов в аваикомпании");
        n=s.nextInt();
        Company c=new Company();
        for(int i=0;i<n;i++)
        {
            int type,max;
            System.out.println("Если желаете добавить самолет введите 1, вертолет - 0");
            type=s.nextInt();
            System.out.println("Введите наименование");
            String name=s.next();
            System.out.println("Введите максимальную высоту");
            int maxheigh=s.nextInt();
            if (type==1)
            {
                System.out.println("Введите размах крыльев");
                max=s.nextInt();
                Plane p=new Plane(name,maxheigh,max);
                c.Add(p);
            }
            else
            {
                System.out.println("Введите максимальную скорость");
                max=s.nextInt();
                Helicopter h=new Helicopter(name,maxheigh,max);
                c.Add(h);
            }

        }
        c.printCompany();
        c.count();
    }

}
