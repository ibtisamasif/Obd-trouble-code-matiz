package com.example.ibtisam.fenixjar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bLookup).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText etCode = findViewById(R.id.etCode);
                if (etCode.getText().toString().isEmpty()) {
                    etCode.setError("Enter 4 digit code");
                } else {
                    TextView tvFaultResult = findViewById(R.id.tvFaultResult);
                    tvFaultResult.setText(code2text(etCode.getText().toString()));
                }
            }
        });

        findViewById(R.id.tvWebLink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("http://reventon4matiz.blogspot.com/"));
                startActivity(i);
            }
        });
    }

    public static String code2text(String var0) {
        if (var0.equals("0105")) {
            return "Manifold air pressure sensor (MAP)";
        } else if (var0.equals("0110")) {
            return "Manifold air temperature sensor (MAT)";
        } else if (var0.equals("0115")) {
            return "Engine coolant temperature sensor (CTS)";
        } else if (var0.equals("0120")) {
            return "Throttle position sensor (TPS)";
        } else if (var0.equals("0130")) {
            return "Oxygen sensor circuit (EOC)";
        } else if (var0.equals("0201")) {
            return "Injector cylinder #1 malfunction";
        } else if (var0.equals("0202")) {
            return "Injector cylinder #2 malfunction";
        } else if (var0.equals("0203")) {
            return "Injector cylinder #3 malfunction";
        } else if (var0.equals("0320")) {
            return "Engine speed circuit malfunction";
        } else if (var0.equals("0325")) {
            return "Knock sensor circuit malfunction";
        } else if (var0.equals("0340")) {
            return "Camshaft position sensor malfunction";
        } else if (var0.equals("0350")) {
            return "Ignition coil circuit malfunction";
        } else if (var0.equals("0400")) {
            return "Exhaust gas recirculation flow (EGR)";
        } else if (var0.equals("0440")) {
            return "Evaporative emission control system (EVAP)";
        } else if (var0.equals("0500")) {
            return "vehicle speed sensor (VSS)";
        } else if (var0.equals("0505")) {
            return "Idle air control system (IAC)";
        } else if (var0.equals("0560")) {
            return "Battery voltage malfunction";
        } else if (var0.equals("0601")) {
            return "ECM malfunction";
        } else if (var0.equals("1100")) {
            return "A/F correction malfunction";
        } else if (var0.equals("1110")) {
            return "Adaptive A/F correction malfunction";
        } else if (var0.equals("1500")) {
            return "A/C evaporator thermistor malfunction";
        } else if (var0.equals("1510")) {
            return "Main relay output malfunction";
        } else if (var0.equals("1600")) {
            return "Immobilizer error (no answer)";
        } else if (var0.equals("1601")) {
            return "Immobilizer error (incorrect answer)";
        } else if (var0.equals("1602")) {
            return "Immobilizer error (ECM locked)";
        } else if (var0.equals("1610")) {
            return "Main relay solenoid malfunction";
        } else if (var0.equals("1620")) {
            return "A/C compressor relay malfunction";
        } else if (var0.equals("1630")) {
            return "Low speed cooling fan relay malfunction (LS/FAN)";
        } else {
            return var0.equals("1631") ? "High speed cooling fan relay malfunction (HS/FAN)" : var0;
        }
    }
}
