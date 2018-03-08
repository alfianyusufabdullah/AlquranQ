package com.alfianyusufabdullah.alquranq.base;

import java.util.ArrayList;

/**
 * Created by jonesrandom on 2/22/18.
 *
 * @site www.androidexample.web.id
 * @github @alfianyusufabdullah
 */

public interface BaseView<M> {
    void onLoad(ArrayList<M> data);
}
