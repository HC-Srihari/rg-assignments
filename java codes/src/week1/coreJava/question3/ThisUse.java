package week1.coreJava.question3;

//output of the below code
//display method
//display method
//10
//10
public class ThisUse extends Super{
    int num;
    public ThisUse(int num)
    {
        this.num=num;
    }
    public void display()
    {
        System.out.println("display method");
    }
    public void show()
    {
        this.display();
        display();
        System.out.println(this.num);
        System.out.println(num);
    }
    public static void main(String[]args)
    {
        ThisUse o=new ThisUse(10);
        o.show();
    }

}
