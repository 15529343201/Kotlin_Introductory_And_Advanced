package cn.kotliner.kotlin.kapt.module;

@dagger.Module(includes = {cn.kotliner.kotlin.kapt.module.CacheModule.class})
public final class OkHttpClientModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient okHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.Cache cache) {
        return null;
    }
    
    public OkHttpClientModule() {
        super();
    }
}