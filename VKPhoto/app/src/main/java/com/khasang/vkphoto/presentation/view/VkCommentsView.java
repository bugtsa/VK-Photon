package com.khasang.vkphoto.presentation.view;

import com.khasang.vkphoto.presentation.model.Comment;
import com.khasang.vkphoto.presentation.model.Photo;
import com.khasang.vkphoto.presentation.model.VkProfile;

import java.util.List;

/**
 * Created by admin on 07.03.2016.
 */
public interface VkCommentsView extends View{

    void displayVkComments(List<Comment> comments, List<VkProfile> profiles);

    void displayVkPhoto(Photo photo);
}
