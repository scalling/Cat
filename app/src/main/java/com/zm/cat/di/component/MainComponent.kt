package com.zm.cat.di.component;

import dagger.BindsInstance;
import dagger.Component;
import com.jess.arms.di.component.AppComponent;

import com.zm.cat.di.module.MainModule;
import com.zm.cat.mvp.contract.MainContract;

import com.jess.arms.di.scope.ActivityScope;
import com.zm.cat.mvp.ui.activity.MainActivity;


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
@ActivityScope
@Component(modules = [MainModule::class], dependencies = [AppComponent::class])
interface MainComponent {
    fun inject(activity: MainActivity)
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun view(view: MainContract.View): Builder

        fun appComponent(appComponent: AppComponent): Builder
        fun build(): MainComponent
    }

}
