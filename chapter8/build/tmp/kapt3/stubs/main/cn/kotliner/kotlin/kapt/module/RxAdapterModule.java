package cn.kotliner.kotlin.kapt.module;

@dagger.Module()
public final class RxAdapterModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.CallAdapter.Factory adapter() {
        return null;
    }
    
    public RxAdapterModule() {
        super();
    }
}