package com.example.awillis.encorelink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrganizerProfile extends AppCompatActivity {

    private EditText organizationName;
    private EditText streetAddress;
    private EditText city;
    private EditText zipCode;
    private EditText contactName;
    private EditText contactJobTitle;
    private EditText phoneNumber;
    private EditText emailAddress;
    private String userId;
    private Button persistButton;

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer_profile);


        databaseReference = FirebaseDatabase.getInstance().getReference();


        organizationName = findViewById(R.id.organizationName);
        streetAddress = findViewById(R.id.streetAddress);
        city = findViewById(R.id.city);
        zipCode = findViewById(R.id.zipcode);
        contactName = findViewById(R.id.contactName);
        contactJobTitle = findViewById(R.id.contactJobTitle);
        phoneNumber = findViewById(R.id.phoneNumber);
        emailAddress = findViewById(R.id.email);

        userId = "1";

        persistButton = findViewById(R.id.pushToDB);
        persistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FacilityEntity facilityEntity = new FacilityEntity(userId, organizationName.getText().toString(), streetAddress.getText().toString(),
                        city.getText().toString(), zipCode.getText().toString(), contactName.getText().toString(), contactJobTitle.getText().toString(),
                        phoneNumber.getText().toString(), emailAddress.getText().toString());
                databaseReference.child("organizerProfile").child(userId).setValue(facilityEntity);
                finish();
            }

        });

    }




}
