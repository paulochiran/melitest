package java;

public class Weather {

    public static void main(String[] args) {
        Weather w = new Weather();
        w.updateWeather(25);
    }

    public void updateWeather(int degrees){
        String description;
        Color color;

        if(degrees < 10){
            description = "cold";
            color = Color.BLUE;
        }
        else if(degrees <25){
            description ="mild";
            color = Color.ORANGE;
        }
        else{
            description="hot";
            color = Color.RED;
        }

        System.out.println("Description: "+description+" Color: "+color.toString());
    }
}
