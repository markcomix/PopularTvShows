package com.letgo.populartvshows.app.dependencyinjection.components;

import com.letgo.populartvshows.app.dependencyinjection.modules.SimilarTvShowsModule;
import com.letgo.populartvshows.app.dependencyinjection.scopes.PerActivity;
import com.letgo.populartvshows.presentation.ui.fragments.TvShowDetailFragment;

import dagger.Component;

/**
 * @author diego.galico
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = SimilarTvShowsModule.class)
public interface SimilarTvShowsComponent {

    void inject(TvShowDetailFragment tvShowDetailFragment);
}
