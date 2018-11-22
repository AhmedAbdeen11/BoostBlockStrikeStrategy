package strategy.strike.block.boost.boostblockstrikestrategy;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import strategy.strike.block.boost.boostblockstrikestrategy.databinding.ActivityDetails2Binding;


public class DetailsActivity2 extends AppCompatActivity {

    ActivityDetails2Binding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_details2);

    }


    public void openLink(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://blockstrike9999999.blogspot.com/"));
        startActivity(browserIntent);
    }
}
