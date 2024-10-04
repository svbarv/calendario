package com.example.calendario;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.RatingBar;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private RatingBar ratingBar;
    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        ratingBar = findViewById(R.id.ratingBar);
        tableLayout = findViewById(R.id.tableLayout);


        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
            System.out.println("Fecha seleccionada: " + selectedDate);
        });


        ratingBar.setOnRatingBarChangeListener((bar, rating, fromUser) -> {
            System.out.println("Rating seleccionado: " + rating);
        });


        agregarFilaTabla("003", "Carlos");
    }


    private void agregarFilaTabla(String id, String nombre) {
        TableRow newRow = new TableRow(this);
        TextView idTextView = new TextView(this);
        TextView nameTextView = new TextView(this);


        idTextView.setText(id);
        nameTextView.setText(nombre);
        idTextView.setPadding(8, 8, 8, 8);
        nameTextView.setPadding(8, 8, 8, 8);


        newRow.addView(idTextView);
        newRow.addView(nameTextView);


        tableLayout.addView(newRow);
    }
}