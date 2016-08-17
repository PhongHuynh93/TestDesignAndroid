package dhbk.android.testdesignandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

public class MainActivity extends BaseActivity {
    /**
     * Whether or not the activity is running on a device with a large screen
     */
    private boolean twoPaneMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // todo 1 add toolbar
        setupToolbar();

        // TODO: 8/17/16 2 check tablet or mobile
        checkTabletOrMobile();

        // TODO: 8/17/16 3 add list
        addList();
    }

    private void addList() {

    }

    private void checkTabletOrMobile() {
        if (isTwoPaneLayoutUsed()) {
            twoPaneMode = true;
            LogUtil.logD("TEST","TWO POANE TASDFES");
            enableActiveItemState();
        }
    }

    /**
     * Is the container present? If so, we are using the two-pane layout.
     *
     * @return true if the two pane layout is used.
     */
    private boolean isTwoPaneLayoutUsed() {
        return findViewById(R.id.article_detail_container) != null;
    }

    /**
     * fixme - change home button icon
     */
    private void setupToolbar() {
        final ActionBar ab = getActionBarToolbar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);
    }



}
