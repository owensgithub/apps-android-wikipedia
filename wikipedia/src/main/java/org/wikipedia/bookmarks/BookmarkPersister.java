package org.wikipedia.bookmarks;

import android.content.Context;
import org.wikipedia.data.ContentPersister;

public class BookmarkPersister extends ContentPersister<Bookmark> {
    private final Context context;
    public BookmarkPersister(Context context) {
        // lolJava
        super(
                context.getContentResolver().acquireContentProviderClient(
                        Bookmark.PERSISTANCE_HELPER.getBaseContentURI()
                ),
                Bookmark.PERSISTANCE_HELPER
        );
        this.context = context;
    }
}
