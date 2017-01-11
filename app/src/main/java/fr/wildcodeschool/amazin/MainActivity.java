package fr.wildcodeschool.amazin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.algolia.instantsearch.helpers.Searcher;
import com.algolia.instantsearch.ui.InstantSearchHelper;

public class MainActivity extends AppCompatActivity {
    private static final String ALGOLIA_APP_ID = "DB842M0JOU";
    private static final String ALGOLIA_INDEX_NAME = "products";
    private static final String ALGOLIA_API_KEY = "d95879b006e4c32b79dbdb875c2bad47";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Searcher searcher = new Searcher(ALGOLIA_APP_ID, ALGOLIA_API_KEY, ALGOLIA_INDEX_NAME); // Initialize Algolia
        new InstantSearchHelper(this, searcher); // Link this activity to the Searcher
        searcher.search(); // Show results for empty query on app launch
    }
}
