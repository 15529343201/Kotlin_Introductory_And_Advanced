package cn.kotliner.kotlin.kapt.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.Cache;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CacheModule_CacheFactory implements Factory<Cache> {
  private final CacheModule module;

  public CacheModule_CacheFactory(CacheModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Cache get() {
    return Preconditions.checkNotNull(
        module.cache(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cache> create(CacheModule module) {
    return new CacheModule_CacheFactory(module);
  }
}
