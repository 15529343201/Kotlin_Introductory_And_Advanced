package cn.kotliner.kotlin.kapt.module;

@dagger.Module(includes = {cn.kotliner.kotlin.kapt.module.GsonModule.class})
public final class GsonConverterModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Converter.Factory converter(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    public GsonConverterModule() {
        super();
    }
}