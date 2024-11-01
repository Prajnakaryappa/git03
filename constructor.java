public class const
{
    int num;
    String name;
    const(int num, String name);
    {
        this.name=name;
        this.num=num;
    }
    public static void main(String arg[])
    {
        const c= new const();
        c.const();
    }
}