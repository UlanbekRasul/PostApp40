package com.geektech.postapp40.utils;

import com.geektech.postapp40.data.models.PostModel;

public interface OnClick {
    void onClick(PostModel postModel);
    void onLongClick(PostModel postModel);
}
