package ${moudlePackageName};

<#if needActivity && needFragment>
import com.jess.arms.di.scope.ActivityScope;
<#elseif needActivity>
import com.jess.arms.di.scope.ActivityScope;
<#elseif needFragment>
import com.jess.arms.di.scope.FragmentScope;
</#if>

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import ${contractPackageName}.${pageName}Contract;
import ${modelPackageName}.${pageName}Model;

<#import "root://activities/MVPArmsTemplate/globals.xml.ftl" as gb>

<@gb.fileHeader />
@Module
 //构建${pageName}Module时,将View的实现类传进来,这样就可以提供View的实现类给presenter
abstract class ${pageName}Module {
    @Binds
    abstract fun bind${pageName}Model(model: ${pageName}Model): ${pageName}Contract.Model

}