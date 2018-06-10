package cn.kotliner.kotlin.kapt.module;

@dagger.Module(includes = {cn.kotliner.kotlin.kapt.module.GsonConverterModule.class, cn.kotliner.kotlin.kapt.module.OkHttpClientModule.class, cn.kotliner.kotlin.kapt.module.RxAdapterModule.class, cn.kotliner.kotlin.kapt.module.BaseUrlModule.class})
public final class RetrofitModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit retrofit(@org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.CallAdapter.Factory adapterFactory, @org.jetbrains.annotations.NotNull()
    retrofit2.Converter.Factory converterFactory) {
        return null;
    }
    
    public RetrofitModule() {
        super();
    }
}