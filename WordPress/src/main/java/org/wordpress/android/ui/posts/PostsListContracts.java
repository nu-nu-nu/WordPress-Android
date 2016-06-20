package org.wordpress.android.ui.posts;

import org.wordpress.android.models.Blog;
import org.wordpress.android.models.Post;
import org.wordpress.android.models.PostsListPost;
import org.wordpress.android.ui.BaseView;

import android.view.View;

public interface PostsListContracts {
    interface PostsView extends BaseView {
        void newPost(boolean isPage);

        void withUndo(Undoable undoable);

        interface Undoable {
            String getText();

            void onUndo();

            void onDismiss();
        }
    }

    interface PostsActionHandler {

        void onRefreshRequested();

        void onLoadMore();

        void onFabClick();

        void onTrashPost(PostsListPost postsListPost);
    }

    interface PostView extends BaseView {
        int getDisplayWidth();

        void editBlogPostOrPageForResult(long postOrPageId, boolean isPage);

        void publishPost(Post post);

        void browsePostOrPage(Blog blog, Post post);

        void viewPostPreviewForResult(Post post, boolean isPage);

        void viewStatsSinglePostDetails(Post post, boolean isPost);
    }

    interface PostActionHandler {

        void onPostSelected();

        void onPostButtonClick(View view);

        void onPostButtonClick(int buttonType);
    }

    interface PageActionHandler {
        void onPageSelected();

        void onMoreButtonClick(View view);

        void onPageButtonClick(int buttonType);
    }
}
