package com.chinaoly.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.callback.NavigationCallback
import com.alibaba.android.arouter.launcher.ARouter

@Route(path ="/test/activity")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_hit).setOnClickListener {
            ARouter.getInstance().build("/test/home").navigation(this, object: NavigationCallback{
                override fun onFound(postcard: Postcard?) {
                    Log.e("Main","onFound")
                }

                override fun onLost(postcard: Postcard?) {
                    Log.e("Main","onLost")

                }

                override fun onArrival(postcard: Postcard?) {
                    Log.e("Main","onArrival")
                }

                override fun onInterrupt(postcard: Postcard?) {
                    Log.e("Main","onInterrupt")
                }
            })
        }
    }
}