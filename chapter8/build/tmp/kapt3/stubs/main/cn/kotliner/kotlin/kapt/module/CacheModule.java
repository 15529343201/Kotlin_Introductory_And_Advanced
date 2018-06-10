package cn.kotliner.kotlin.kapt.module;

@dagger.Module()
public final class CacheModule {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CACHE_DIR = "./cache";
    public static final long CACHE_SIZE = 10485760L;
    public static final cn.kotliner.kotlin.kapt.module.CacheModule.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.Cache cache() {
        return null;
    }
    
    public CacheModule() {
        super();
    }
    
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}