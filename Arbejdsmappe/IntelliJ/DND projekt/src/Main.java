import java.io.IOException;

public class Main {

    public static void main(String[] args)
    {

        //Controller controller = new Controller();

        /*try
        {
            controller.convertTextFilestoSQLFiles();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }*/

        //controller.startOptions();


        ProgressBar progressBar = new ProgressBar(30);


       while (!progressBar.isComplete())
       {
           progressBar.displayProgressBar();
           progressBar.addProgress();

       }

        progressBar.displayProgressBar();

    }
}
