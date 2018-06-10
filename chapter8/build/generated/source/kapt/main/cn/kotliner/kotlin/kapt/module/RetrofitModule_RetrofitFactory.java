package cn.kotliner.kotlin.kapt.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RetrofitModule_RetrofitFactory implements Factory<Retrofit> {
  private final RetrofitModule module;

  private final Provider<String> baseUrlProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<CallAdapter.Factory> adapterFactoryProvider;

  private final Provider<Converter.Factory> converterFactoryProvider;

  public RetrofitModule_RetrofitFactory(
      RetrofitModule module,
      Provider<String> baseUrlProvider,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<CallAdapter.Factory> adapterFactoryProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    assert module != null;
    this.module = module;
    assert baseUrlProvider != null;
    this.baseUrlProvider = baseUrlProvider;
    assert okHttpClientProvider != null;
    this.okHttpClientProvider = okHttpClientProvider;
    assert adapterFactoryProvider != null;
    this.adapterFactoryProvider = adapterFactoryProvider;
    assert converterFactoryProvider != null;
    this.converterFactoryProvider = converterFactoryProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.retrofit(
            baseUrlProvider.get(),
            okHttpClientProvider.get(),
            adapterFactoryProvider.get(),
            converterFactoryProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Retrofit> create(
      RetrofitModule module,
      Provider<String> baseUrlProvider,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<CallAdapter.Factory> adapterFactoryProvider,
      Provider<Converter.Factory> converterFactoryProvider) {
    return new RetrofitModule_RetrofitFactory(
        module,
        baseUrlProvider,
        okHttpClientProvider,
        adapterFactoryProvider,
        converterFactoryProvider);
  }
}
