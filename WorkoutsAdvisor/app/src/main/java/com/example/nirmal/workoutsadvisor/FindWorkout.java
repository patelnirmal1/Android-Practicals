package com.example.nirmal.workoutsadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkout extends Activity {

//    private WorkoutExpert Expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }

    public void onClickFindWorkout(View v)
    {
        TextView workouts = (TextView)findViewById(R.id.workout);
        Spinner workouttypes = (Spinner)findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttypes.getSelectedItem());

        /*List <String> workoutlist = Expert.getWorkouts(workout);

        StringBuilder workoutsformatted = new StringBuilder();
        for (String work : workoutlist)
        {
            workoutsformatted.append(work).append("\n");
        }
        workouts.setText(workoutsformatted);*/

        if (workout.equals("Chest"))
        {
            workouts.setText("Bench Press" + "\n\n" + "Bench Flys");
        }
        else if (workout.equals("Shoulders"))
        {
            workouts.setText("Shoulder Press");
        }
        else if (workout.equals("Biceps"))
        {
            workouts.setText("Biceps Curls");
        }
        else if (workout.equals("Triceps"))
        {
            workouts.setText("Triceps Exp" + "\n\n" + "Triceps PushDown");
        }


    }
}
