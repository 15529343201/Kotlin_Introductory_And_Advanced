package cn.kotliner.kotlin.kapt.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Converter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GsonConverterModule_ConverterFactory implements Factory<Converter.Factory> {
  private final GsonConverterModule module;

  private final Provider<Gson> gsonProvider;

  public GsonConverterModule_ConverterFactory(
      GsonConverterModule module, Provider<Gson> gsonProvider) {
    assert module != null;
    this.module = module;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Converter.Factory get() {
    return Preconditions.checkNotNull(
        module.converter(gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Converter.Factory> create(
      GsonConverterModule module, Provider<Gson> gsonProvider) {
    return new GsonConverterModule_ConverterFactory(module, gsonProvider);
  }
}
