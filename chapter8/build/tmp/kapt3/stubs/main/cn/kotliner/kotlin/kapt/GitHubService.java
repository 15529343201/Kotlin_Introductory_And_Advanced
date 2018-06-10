package cn.kotliner.kotlin.kapt;

public abstract interface GitHubService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/repos/enbandari/Kotlin-Tutorials/stargazers")
    public abstract retrofit2.Call<java.util.List<cn.kotliner.kotlin.kapt.User>> getStarGazers(@retrofit2.http.Query(value = "page")
    int p0, @retrofit2.http.Query(value = "per_page")
    int p1);
    
    public final class DefaultImpls {
    }
}