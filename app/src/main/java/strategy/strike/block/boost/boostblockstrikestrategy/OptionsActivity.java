package strategy.strike.block.boost.boostblockstrikestrategy;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import strategy.strike.block.boost.boostblockstrikestrategy.databinding.ActivityOptionsBinding;


public class OptionsActivity extends AppCompatActivity {

    ActivityOptionsBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_options);

    }

    public void openDetailsActivity(View view) {
        startActivity(new Intent(OptionsActivity.this, DetailsActivity.class));
    }


    public void openDetailsActivity2(View view) {
        startActivity(new Intent(OptionsActivity.this, DetailsActivity2.class));
    }
}
