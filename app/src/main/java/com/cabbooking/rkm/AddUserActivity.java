package com.cabbooking.rkm;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class AddUserActivity extends Activity {
    private EditText editTextName;
    private EditText editTextPhone;
    private EditText editTextEmail;
    private CheckBox chkAdmin;
    private CheckBox chkHOI;
    private CheckBox chkBookingRequester;
    private CheckBox chkDriver;
    private Button btnSave;
    private Button btnCancel;

    private Users user = new Users();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DBHelper db = new DBHelper(this);
        String UserKeyId = db.GenerateIdForTable(2,DBHelper.USERS_TABLE,DBHelper.USERS_COLUMN_GlobalUserID);
        db.AddUser(new Users(UserKeyId,"Mohan","Mohan@gmail.com","","98745632110","A",true));

        setContentView(R.layout.activity_add_user);

        addListeronButton();

       Users user =  db.GetUser("ABCDE");
        Toast.makeText(AddUserActivity.this,user.getName() ,
                Toast.LENGTH_LONG).show();
    }

    public void addListeronButton() {
        editTextName = (EditText) findViewById(R.id.Name);
        editTextEmail = (EditText) findViewById(R.id.Email);
        editTextPhone = (EditText) findViewById(R.id.phone);

        chkAdmin = (CheckBox) findViewById(R.id.checkBoxAdmin);
        chkHOI = (CheckBox) findViewById(R.id.checkBoxHOI);
        chkBookingRequester = (CheckBox) findViewById(R.id.checkBoxBookingRequester);
        chkDriver = (CheckBox) findViewById(R.id.checkBoxDriver);

        btnSave = (Button) findViewById(R.id.buttonSave);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("Name : ").append(editTextName.getText());
                result.append("Email : ").append(editTextEmail.getText());
                result.append("Phone : ").append(editTextPhone.getText());

                result.append("Admin : ").append(chkAdmin.isChecked());
                result.append("\nHOI Chencked : ").append(chkHOI.isChecked());
                result.append("\nBookingRequester check :").append(chkBookingRequester.isChecked());
                result.append("\nchkDriver check :").append(chkDriver.isChecked());
                Toast.makeText(AddUserActivity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

               /* user.setName(editTextName.getText().toString());
                user.setEmail(editTextEmail.getText().toString());
                user.setMobileNumber(editTextPhone.getText().toString());
                user.setUserRoleId(chkAdmin.isChecked()?"A":"Z");
*/
            }

        });


    }
}
