package dhbk.android.testdesignandroid;


import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArticleListFragment extends ListFragment {
    /**
     * A callback interface. Called whenever a item has been selected.
     */
    public interface Callback {
        void onItemSelected(String id);
    }

    public ArticleListFragment() {
        // Required empty public constructor
    }
}
