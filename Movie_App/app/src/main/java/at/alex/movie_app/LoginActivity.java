package at.alex.movie_app;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private Button newAccount;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        newAccount = (Button) findViewById(R.id.btn_createaccount);
        newAccount.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.login_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_about:
                startActivity(new Intent(this, NewAccountActivity.class));
                return true;

        }
        return super.onOptionsItemSelected(item);
    }


    private void switchNewAccount()
    {
        Intent newAccountIntent = new Intent(this, NewAccountActivity.class);
        startActivity(newAccountIntent);
    }


    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;


        switch (clickedButton.getId()) {
            case R.id.btn_createaccount:
                switchNewAccount();
                break;
        }


    }
}