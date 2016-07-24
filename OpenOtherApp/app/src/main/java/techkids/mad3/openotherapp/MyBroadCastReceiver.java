package techkids.mad3.openotherapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by TrungNT on 7/24/2016.
 */
public class MyBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Log.d("TAG", "Ban vua khoi dong lai may");
        }
        if (Intent.ACTION_SCREEN_ON.equals(intent.getAction())){
            Log.d("TAG", "SCREEN ON");
        }
    }
}
