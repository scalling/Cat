package com.zm.cat.mvp.ui.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log

import com.jess.arms.base.BaseActivity
import com.jess.arms.di.component.AppComponent
import com.jess.arms.utils.ArmsUtils

import com.zm.cat.di.component.DaggerMainComponent
import com.zm.cat.di.module.MainModule
import com.zm.cat.mvp.contract.MainContract
import com.zm.cat.mvp.presenter.MainPresenter

import com.zm.cat.R
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 03/25/2020 14:53
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
/**
 * 如果没presenter
 * 你可以这样写
 *
 * @ActivityScope(請注意命名空間) class NullObjectPresenterByActivity
 * @Inject constructor() : IPresenter {
 * override fun onStart() {
 * }
 *
 * override fun onDestroy() {
 * }
 * }
 */
class MainActivity : BaseActivity<MainPresenter>(), MainContract.View {

    override fun setupActivityComponent(appComponent: AppComponent) {

        DaggerMainComponent //如找不到该类,请编译一下项目
            .builder()
            .appComponent(appComponent)
            .view(this)
            .build()
            .inject(this)
    }


    override fun initView(savedInstanceState: Bundle?): Int {

        return R.layout.activity_main //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }


    override fun initData(savedInstanceState: Bundle?) {
        title="首页"
     //  tv_test.text="计算出的值："+((sqrt(360.0.pow(2)+640.0.pow(2)))/72)
    }

    override fun test(any: Any) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun showMessage(message: String) {
        ArmsUtils.snackbarText(message)
    }

    override fun launchActivity(intent: Intent) {
        ArmsUtils.startActivity(intent)
    }

    override fun killMyself() {
        finish()
    }
}
