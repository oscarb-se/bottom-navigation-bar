package se.oscarb.bottomnavigationbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FavoritesFragment extends Fragment {

    // Instansvariabler
    View view;

    /*
        Jämför med onCreate i en Activity
        Metod som körs när Fragmentets layout ska skapas
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Skapa en View i Java av vår XML-fil
        view = inflater.inflate(R.layout.fragment_favorites, container, false);

        // Returnera denna view
        return view;
    }

    // En instansmetod
    public void showMessage() {
        // Byt ut texten som visas till en annan
        TextView headlineTextView = (TextView) view.findViewById(R.id.headline);
        headlineTextView.setText("Någon annan text!");
    }
}
