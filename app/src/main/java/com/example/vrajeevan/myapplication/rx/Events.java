package com.example.vrajeevan.myapplication.rx;

import android.widget.AbsListView;

import rx.Observable;
import rx.subjects.PublishSubject;

/*Copyright 2013 Andrew Rosa

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*
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
