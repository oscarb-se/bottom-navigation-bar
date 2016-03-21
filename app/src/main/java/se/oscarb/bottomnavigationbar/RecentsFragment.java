package se.oscarb.bottomnavigationbar;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RecentsFragment extends Fragment {

    // Instansvariabler
    ButtonListener activity;

    /*
        Jämför med onCreate i en Activity
        Metod som körs när Fragmentets layout ska skapas
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Skapa en View i Java av vår XML-fil
        View view = inflater.inflate(R.layout.fragment_recent, container, false);

        // Hämta knappen och lägg till vad som ska ske när man klickar på den
        Button button = (Button) view.findViewById(R.id.changeTextButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeTextInOtherFragment();
                Log.i("Button", "Klickade på knappen: changeTextButton");
            }
        });


        // Returnera denna view
        return view;
    }

    // Vi vill se till att när man klickar på något i Recents så ändras något i Favorites
    // Detta sker genom den Activity som hanterar fragmenten
    // Steg 1 - Hämta en referens till Activity

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (ButtonListener) context;
    }

    // Steg 2 - Skapa det interface som påtvingar en Activity att ha en viss metod
    // Vi skapar en lyssnare (ett interface)
    public interface ButtonListener {
        public void onRecentsButtonClick ();
    }

    // Metoden som triggas av knappen
    public void changeTextInOtherFragment() {
        // Anropa metoden i vår activity som i sin tur anropar en metod i ett annat fragment
        activity.onRecentsButtonClick();
    }

}
