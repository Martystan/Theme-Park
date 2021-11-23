import attractions.Attraction;
import behaviours.IReviewed;
import jdk.nashorn.internal.parser.JSONParser;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.reviewed = new ArrayList<>();
    }

    
}

