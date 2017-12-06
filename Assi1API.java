package com.example.anki7.assignment;


import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class Assi1API
{
    private static final String key="photos";
    private static final String url="https://jsonplaceholder.typicode.com/";

    public static Postservice postService=null;

    public static Postservice getService()
    {
        if(postService==null)
        {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService=retrofit.create(Postservice.class);
        }
        return postService;

    }

    public interface Postservice{
        @GET("?key=" +key)
        Call<PostList> getPostList();
    }

}
