package labexcercise11;

public class TestThreadMany {
    public static void main(String[] args) throws InterruptedException
    {
        
        //typecasting the input in command line to integer
        
        int n=Integer.parseInt(args[0]);
        thread obj[]=new thread[n];
        for(int i=0;i<n;i++)
        {
            //creating objects for thread class
            obj[i]=new thread();
            
            //calling the thread class objects
            obj[i].start();
            
        }
        
    }   
}
//thread class
class thread extends Thread 
{
    static int z=0;
    @Override
    public void run()
    {
       System.out.println("Hello,I am Thread #"+(++z));
    }

// OUTPUT
/*
Hello,I am Thread #1
Hello,I am Thread #3
Hello,I am Thread #2
Hello,I am Thread #1
*/
}
