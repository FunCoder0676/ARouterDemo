package com.chinaoly.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Autowired
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter

@Route(path = "/test/home")
class HomeActivity : AppCompatActivity() {

    @Autowired
    @JvmField var name: String? = null

    @Autowired
    @JvmField var age : Int = 0

    // 通过 name 来映射 URK 中的不同参数
    @Autowired(name = "girl")
    @JvmField var boy: Boolean = false

  // 声明拦截器（拦截跳转过程，面向切面编程）





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        ARouter.getInstance().inject(this)
    }
}