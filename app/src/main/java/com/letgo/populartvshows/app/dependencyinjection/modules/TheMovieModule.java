package com.letgo.populartvshows.app.dependencyinjection.modules;

import com.letgo.populartvshows.domain.model.rest.TheMovieApiInterface;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * @author diego.galico
 */
@Module
public class TheMovieModule {

    @Provides
    public TheMovieApiInterface providesTheMovieInterface(Retrofit retrofit) {
        return retrofit.create(TheMovieApiInterface.class);
    }
}