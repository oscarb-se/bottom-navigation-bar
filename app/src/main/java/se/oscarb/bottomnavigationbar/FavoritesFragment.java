package se.oscarb.bottomnavigationbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FavoritesFragment extends Fragment {

    /*
        Jämför med onCreate i en Activity
        Metod som körs när Fragmentets layout ska skapas
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Skapa en View i Java av vår XML-fil
        View view = inflater.inflate(R.layout.fragment_favorites, container, false);

        // Returnera denna view
        return view;
    }
}
