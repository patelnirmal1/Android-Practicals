package com.example.nirmal.workoutsadvisor;


import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {


    List <String> getWorkouts (String workouttypes)
    {
        List <String> workout = new ArrayList<String>();

        if (workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");
        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Triceps Exp");
            workout.add("Triceps PushDown");
        }
        else if (workouttypes.equals("Shoulders"))
        {
            workout.add("Shoulder Press");
        }
        else if (workouttypes.equals("Biceps"))
        {
            workout.add("Biceps Curls");
        }
        return workout;
    }
}
