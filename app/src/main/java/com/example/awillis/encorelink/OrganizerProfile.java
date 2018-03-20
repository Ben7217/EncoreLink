package com.example.awillis.encorelink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class OrganizerProfile extends AppCompatActivity {

    private EditText organizationName;
    private EditText streetAddress;
    private EditText city;
    private EditText zipCode;
    private EditText contactName;
    private EditText contactJobTitle;
    private EditText phoneNumber;
    private EditText emailAddress;
    private EditText state;

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
        state = findViewById(R.id.state);
        zipCode = findViewById(R.id.zipcode);
        contactName = findViewById(R.id.contactName);
        contactJobTitle = findViewById(R.id.contactJobTitle);
        phoneNumber = findViewById(R.id.phoneNumber);
        emailAddress = findViewById(R.id.emailAddress);


        persistButton = findViewById(R.id.pushToDB);
        persistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FacilityEntity facilityEntity = new FacilityEntity(organizationName.getText().toString(), streetAddress.getText().toString(), city.getText().toString(), state.getText().toString(),
                        zipCode.getText().toString(), contactName.getText().toString(), contactJobTitle.getText().toString(), phoneNumber.getText().toString(), emailAddress.getText().toString());
                databaseReference.child("organizerProfile").push().setValue(facilityEntity);

                Toast.makeText(OrganizerProfile.this, "Saving to Database", Toast.LENGTH_SHORT).show();

                ValueEventListener eventListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot data : dataSnapshot.getChildren()) {
                            String organizerName = data.child("organizationName").getValue(String.class);
                            Log.d("Tag", organizerName + "/");
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                };

                databaseReference.addListenerForSingleValueEvent(eventListener);

            }


        });


    }



//    public void createFacilityProfile(String userId) {
//
//        String organizationName = this.organizationName.getText().toString();
//        String streetAddress = this.streetAddress.getText().toString();
//        String city = this.city.getText().toString();
//        String zipcode = this.zipCode.getText().toString();
//        String contactName = this.contactName.getText().toString();
//        String contactJobTitle = this.contactJobTitle.getText().toString();
//        String phoneNumber = this.phoneNumber.getText().toString();
//        String emailAddress = this.emailAddress.getText().toString();
//
//        FacilityEntity facilityEntity = new FacilityEntity(userId, organizationName, streetAddress, city,
//                zipcode, contactName, contactJobTitle, phoneNumber, emailAddress);
//        databaseReference.child("facilityProfile").child(userId).setValue(facilityEntity);
//    }


}
