package com.quoders.apps.madridbus;

import android.support.annotation.NonNull;

public class HomePresenter implements HomeContract.Presenter {

    private HomeContract.View mView;

    public HomePresenter(@NonNull HomeContract.View view) {
        mView = view;
    }

    @Override
    public void onMapTabSelected() {
        mView.displayMapView();
    }

    @Override
    public void onLinesTabSelected() {
        mView.displayLinesView();
    }

    @Override
    public void onFavoritesTabSelected() {
        mView.displayFavoritesView();
    }

    @Override
    public void onViewAttached(BaseView view) {

    }

    @Override
    public void onViewDetached() {

    }
}
