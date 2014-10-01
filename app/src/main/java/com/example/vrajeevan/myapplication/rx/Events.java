package com.example.vrajeevan.myapplication.rx;

import android.widget.AbsListView;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 * Created by vrajeevan on 10/1/14.
 */
public class Events {
    /*
     * Creates a subject that emits events for item clicks of list views
     */
    public static Observable<Integer> itemClick(AbsListView view) {
        final PublishSubject<Integer> subject = PublishSubject.create();
        view.setOnItemClickListener((adapterView, view1, position, l) -> subject.onNext(position));
        return subject;
    }
}
