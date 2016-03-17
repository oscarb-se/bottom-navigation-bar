package se.oscarb.bottomnavigationbar;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Metod för att visa ett visst fragment, anropas när en knapp klickas på
    public void displayFragment(View view) {
        // Vad står det på knappen vi klickade på?
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Log.i("Fragment", "Klickade på knappen med texten " + buttonText);

        // TODO: Byt ut till rätt fragment (d.v.s det som matchar knappen vi klickade på)

        // Vilket fragment ska vi byta till?
        FavoritesFragment favoritesFragment = new FavoritesFragment();

        // För att hantera fragment behövs en FragmentManager
        FragmentManager manager = getFragmentManager();

        // För att lägga till/ta bort/byta ut ett Fragment så behövs FragmentTransaction
        // Vi får vår "transaktion" från vår manager
        FragmentTransaction transaction = manager.beginTransaction();

        // Byt ut ett Fragment
        transaction.replace(R.id.container, favoritesFragment);

        // Kör transaktionen
        transaction.commit();


    }
}
