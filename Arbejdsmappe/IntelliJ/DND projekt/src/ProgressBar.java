import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;

public class ProgressBar
{
    private HashMap<String, Float> progressBarStatus = new HashMap<>();
    private boolean complete = false;

    public ProgressBar(float barLength)
    {
        progressBarStatus.put("Length", barLength);
        progressBarStatus.put("Progress", 0f);

    }

    public void addProgress()
    {
        if(!Objects.equals(progressBarStatus.get("Length"), progressBarStatus.get("Progress")))
        {
            progressBarStatus.replace("Progress", progressBarStatus.get("Progress")+1f);

            if(Objects.equals(progressBarStatus.get("Length"), progressBarStatus.get("Progress")))
            {
                complete = true;
            }
        }

    }


    public void displayProgressBar()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);


        if(complete)
        {
            System.out.println("100%");
        }

        else
        {
            float percentile = (progressBarStatus.get("Progress")) / (progressBarStatus.get("Length"));

            System.out.println(df.format(percentile)+"%");
        }

    }

    public boolean isComplete() {
        return complete;
    }
}
