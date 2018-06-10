package cn.kotliner.kotlin.kapt.module;

@dagger.Module()
public final class GsonModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.google.gson.Gson gson() {
        return null;
    }
    
    public GsonModule() {
        super();
    }
}