package cn.kotliner.kotlin.kapt.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OkHttpClientModule_OkHttpClientFactory implements Factory<OkHttpClient> {
  private final OkHttpClientModule module;

  private final Provider<Cache> cacheProvider;

  public OkHttpClientModule_OkHttpClientFactory(
      OkHttpClientModule module, Provider<Cache> cacheProvider) {
    assert module != null;
    this.module = module;
    assert cacheProvider != null;
    this.cacheProvider = cacheProvider;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.okHttpClient(cacheProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(
      OkHttpClientModule module, Provider<Cache> cacheProvider) {
    return new OkHttpClientModule_OkHttpClientFactory(module, cacheProvider);
  }
}
