package android.cvl.udsm.com.denti.utils;

import android.cvl.udsm.com.denti.BuildConfig;
import android.os.Looper;

/**
 * Created by aronkondoro on 8/4/14.
 */
public class ThreadPreconditions {

    public static void checkOnMainThread() {
        if (BuildConfig.DEBUG) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("This method should be called from the Main Thread");
            }
        }
    }

}
