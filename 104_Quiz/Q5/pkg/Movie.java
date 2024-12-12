package pkg;

public class Movie{
    String name;
    double rating;
    int numRating;
    int revinue;
    public Movie(){
        name = "Avengers";
        rating = 8.0;
        numRating = 33;
        revinue = 623357810;
    }
    public Movie(String na, double rate, int numRate, int rev){
        name = na;
        rating = rate;
        numRating = numRate;
        revinue = rev;
    }
    public void movieToString(){
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRating);
        System.out.println("Revinue: " + revinue + "\n");
    }
    public String getMovieName(){
        return name;
    }
    public int getRevenue(){
        return revinue;
    }
    public double getRating(){
        return rating;
    }
    public void addRating(double rate){
       
        rating = rating *numRating;
         numRating ++;
         rating = rating + rate;
        rating =rating/numRating;
    }
    public boolean compareRatings(Movie b){
        if(rating > b.getRating()){
            return true;
        }
        return false;
    }
    public String revenueToString(){
        int num1 = revinue/ 100000000;
        int num2 = revinue % 100000000 / 1000000;
        int num3 = revinue % 1000000 / 1000;
        int num4 = revinue % 100;
        String he = "" +num1 + num2 + "," + num3 + "," + num4; 
        return he;
    }
    public 
}
