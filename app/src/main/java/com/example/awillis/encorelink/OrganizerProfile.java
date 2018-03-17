package com.example.awillis.encorelink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class OrganizerProfile extends AppCompatActivity {

    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer_profile);


        databaseReference = FirebaseDatabase.getInstance().getReference();
    }

    public void createFacilityProfile(String userId, String organizationName, String streetAddress, String city,
                                      String zipcode, String contactName, String contactJobTitle, String phoneNumber,
                                      String emailAddress) {
        FacilityEntity facilityEntity = new FacilityEntity(userId, organizationName, streetAddress, city,
                zipcode, contactName, contactJobTitle, phoneNumber, emailAddress);
        databaseReference.child("facilityProfile").child(userId).setValue(facilityEntity);
    }


}
