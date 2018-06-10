package cn.kotliner.kotlin.kapt;

@dagger.Component(modules = {cn.kotliner.kotlin.kapt.module.RetrofitModule.class})
@javax.inject.Singleton()
public abstract interface RESTFulComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract retrofit2.Retrofit retrofit();
}