public class StepTracker{
    int minSteps;
    int activeDays = 0;
    int days = 0;
    int total = 0;
    public StepTracker(int min){
        minSteps = min;
    }
    public void addDailySteps(int steps){
        if(steps >= minSteps){
            activeDays ++;
        }
        total = total +steps;
    }
    public int activeDays(){
        return activeDays;
    }
    public double averageSteps(){
        return total/days;
    }
}