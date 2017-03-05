package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        // Verify the contents of the array by printing out each array element to the logs
        for (int i = 0; i < 10; i++) {
            Log.v("NumbersActivity", "Word at index " + i + ": " + words.get(i));
        }
    }
}
