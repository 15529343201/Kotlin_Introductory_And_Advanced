package cn.kotliner.kotlin.kapt.module;

@dagger.Module()
public final class BaseUrlModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEBUG_URL = "https://api.github.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RELEASE_URL = "https://api.github.com";
    public static final cn.kotliner.kotlin.kapt.module.BaseUrlModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String baseUrl() {
        return null;
    }
    
    public BaseUrlModule() {
        super();
    }
    
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}