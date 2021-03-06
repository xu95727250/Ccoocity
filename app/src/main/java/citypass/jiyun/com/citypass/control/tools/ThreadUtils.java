package citypass.jiyun.com.citypass.control.tools;

import android.os.Handler;
import android.os.Looper;

/**
 *
 * 线程切换
 * Created by my on 2017/5/14.
 */

public class ThreadUtils {
    private static Handler sHander = new Handler(Looper.getMainLooper());

    public static void runOnMain(Runnable runnable) {
        sHander.post(runnable);
    }

    public static void runOnSubThread(Runnable runnable) {
        new Thread(runnable).start();
    }
}
