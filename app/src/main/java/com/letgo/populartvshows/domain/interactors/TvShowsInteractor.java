package com.letgo.populartvshows.domain.interactors;


import com.letgo.populartvshows.domain.interactors.base.Interactor;
import com.letgo.populartvshows.domain.model.entities.TvShow;
import com.letgo.populartvshows.domain.model.rest.RestData;
import com.letgo.populartvshows.presentation.presenters.impl.PopularTvShowsPresenterImpl;

import java.util.List;

/**
 * @author diego.galico
 *
 * TvShowsInteractor is an interface that define methods to obtain popular tv shows information
 *
 */
public interface TvShowsInteractor extends Interactor {

    /**
     * Request popular tv shows to {@link RestData} class
     */
    void requestPopularTvShows();

    /**
     * Set presenter to class variable in order to return information to {@link PopularTvShowsPresenterImpl} class
     * @param presenter
     */
    void setPresenter(PopularTvShowsPresenterImpl presenter);

    /**
     * Set page variable in order to return first tv show pagination to {@link PopularTvShowsPresenterImpl} class
     * @param page
     */
    void setPage(int page);

    /**
     * Interface implemented by {@link PopularTvShowsPresenterImpl} class
     */
    interface PopularTvShowsResponse {

        /**
         * Retrieve List<TvShow> response
         * @param popularTvShowList
         */
        void onPopularTvShowsResponse(List<TvShow> popularTvShowList);

        /**
         * Retrieve error response
         * @param error
         */
        void onErrorResponse(String error);
    }

}
