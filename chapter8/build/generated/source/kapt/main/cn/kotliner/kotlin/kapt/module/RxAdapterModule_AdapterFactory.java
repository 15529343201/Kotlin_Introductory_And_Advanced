package cn.kotliner.kotlin.kapt.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.CallAdapter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RxAdapterModule_AdapterFactory implements Factory<CallAdapter.Factory> {
  private final RxAdapterModule module;

  public RxAdapterModule_AdapterFactory(RxAdapterModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CallAdapter.Factory get() {
    return Preconditions.checkNotNull(
        module.adapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CallAdapter.Factory> create(RxAdapterModule module) {
    return new RxAdapterModule_AdapterFactory(module);
  }
}
