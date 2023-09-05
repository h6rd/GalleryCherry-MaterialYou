package me.devsaki.hentoid.events;

import androidx.annotation.IntDef;
import androidx.annotation.NonNull;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import me.devsaki.hentoid.database.domains.Content;

/**
 * Tracks downloads events for interested subscribers.
 */
public class DownloadEvent {

    @IntDef({Type.EV_NONE, Type.EV_PROGRESS, Type.EV_PAUSED, Type.EV_UNPAUSED, Type.EV_CANCELED, Type.EV_COMPLETE, Type.EV_SKIPPED, Type.EV_PREPARATION, Type.EV_CONTENT_INTERRUPTED})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
        int EV_NONE = -1;
        int EV_PROGRESS = 0; // Download progress of current book (always one book at a time)
        int EV_PAUSED = 1; // Queue is paused
        int EV_UNPAUSED = 2; // Queue is unpaused
        int EV_CANCELED = 3; // One book has been "canceled" (ordered to be removed from the queue)
        int EV_COMPLETE = 4; // Current book download has been completed
        int EV_SKIPPED = 5; // Cancel without removing the Content; used when the 2nd book is prioritized to end up in the first place of the queue or when 1st book is deprioritized
        // /!\ Using EV_SKIP without moving the position of the book won't have any effect
        int EV_PREPARATION = 6; // Informative event for the UI during preparation phase
        int EV_CONTENT_INTERRUPTED = 7; // Interrupt extra page parsing only for a specific Content
    }

    @IntDef({Motive.NONE, Motive.NO_INTERNET, Motive.NO_WIFI, Motive.NO_STORAGE, Motive.NO_DOWNLOAD_FOLDER
            , Motive.DOWNLOAD_FOLDER_NOT_FOUND, Motive.DOWNLOAD_FOLDER_NO_CREDENTIALS, Motive.STALE_CREDENTIALS, Motive.NO_AVAILABLE_DOWNLOADS})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Motive {
        int NONE = -1;
        int NO_INTERNET = 0;
        int NO_WIFI = 1;
        int NO_STORAGE = 2;
        int NO_DOWNLOAD_FOLDER = 3;
        int DOWNLOAD_FOLDER_NOT_FOUND = 4;
        int DOWNLOAD_FOLDER_NO_CREDENTIALS = 5;
        int STALE_CREDENTIALS = 6;
        int NO_AVAILABLE_DOWNLOADS = 7;
    }

    @IntDef({Step.NONE, Step.INIT, Step.PROCESS_IMG, Step.FETCH_IMG, Step.PREPARE_FOLDER, Step.PREPARE_DOWNLOAD, Step.SAVE_QUEUE, Step.WAIT_PURGE, Step.START_DOWNLOAD, Step.COMPLETE_DOWNLOAD, Step.REMOVE_DUPLICATE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Step {
        int NONE = -1;
        int INIT = 0;
        int PROCESS_IMG = 1;
        int FETCH_IMG = 2;
        int PREPARE_FOLDER = 3;
        int PREPARE_DOWNLOAD = 4;
        int SAVE_QUEUE = 5;
        int WAIT_PURGE = 6;
        int START_DOWNLOAD = 7;
        int COMPLETE_DOWNLOAD = 8;
        int REMOVE_DUPLICATE = 9;
    }

    public final @Type
    int eventType;                 // Event type (see constants EV_XXX above)
    public final Content content;               // Corresponding book (for EV_CANCEL events that are the only ones not concerning the 1st book of the queue + EV_COMPLETE to update the proper book in library view)
    public final int pagesOK;                   // Number of pages that have been downloaded successfully for current book
    public final int pagesKO;                   // Number of pages that have been downloaded with errors for current book
    public final int pagesTotal;                // Number of pages to download for current book
    public final long downloadedSizeB;          // Total size of downloaded content (bytes)
    public final @Motive
    int motive;            // Motive for certain events (EV_PAUSE)
    public final @Step
    int step;            // Step for EV_PREPARATION
    public String log = "";

    /**
     * Use for EV_PROGRESS and EV_COMPLETE events
     *
     * @param content    progressing or completed content
     * @param eventType  event type code (among DownloadEvent public static EV_ values)
     * @param pagesOK    pages downloaded successfully
     * @param pagesKO    pages downloaded with errors
     * @param pagesTotal total pages to download
     */
    public DownloadEvent(@NonNull Content content, @Type int eventType, int pagesOK, int pagesKO, int pagesTotal, long downloadedSizeB) {
        this.content = content;
        this.eventType = eventType;
        this.pagesOK = pagesOK;
        this.pagesKO = pagesKO;
        this.pagesTotal = pagesTotal;
        this.downloadedSizeB = downloadedSizeB;
        this.motive = Motive.NONE;
        this.step = Step.NONE;
    }

    /**
     * Use for EV_CANCEL events
     *
     * @param content   Canceled content
     * @param eventType event type code (among DownloadEvent public static EV_ values)
     */
    public DownloadEvent(@NonNull Content content, @Type int eventType) {
        this.content = content;
        this.eventType = eventType;
        this.pagesOK = 0;
        this.pagesKO = 0;
        this.pagesTotal = 0;
        this.downloadedSizeB = 0;
        this.motive = Motive.NONE;
        this.step = Step.NONE;
    }

    /**
     * Use for EV_PREPARATION event
     *
     * @param step    step code for the event
     * @param content Content that is being downloaded; null if inapplicable
     */
    public static DownloadEvent fromPreparationStep(@Step int step, Content content) {
        return new DownloadEvent(Type.EV_PREPARATION, Motive.NONE, step, content);
    }

    /**
     * Use for EV_PAUSE event
     *
     * @param motive motive code for the event
     */
    public static DownloadEvent fromPauseMotive(@Motive int motive) {
        return new DownloadEvent(Type.EV_PAUSED, motive, Step.NONE, 0);
    }

    public static DownloadEvent fromPauseMotive(@Motive int motive, long spaceLeftBytes) {
        return new DownloadEvent(Type.EV_PAUSED, motive, Step.NONE, spaceLeftBytes);
    }

    /**
     * Use for EV_PAUSE event
     *
     * @param eventType      event type code (among DownloadEvent public static EV_ values)
     * @param motive         motive for the event
     * @param step           step for the event
     * @param spaceLeftBytes space left on device
     */
    DownloadEvent(@Type int eventType, @Motive int motive, @Step int step, long spaceLeftBytes) {
        this.content = null;
        this.eventType = eventType;
        this.pagesOK = 0;
        this.pagesKO = 0;
        this.pagesTotal = 0;
        this.downloadedSizeB = spaceLeftBytes;
        this.motive = motive;
        this.step = step;
    }

    /**
     * Use for EV_PREPARATION event
     *
     * @param eventType event type code (among DownloadEvent public static EV_ values)
     * @param motive    motive for the event
     * @param step      step for the event
     * @param content   Content that is being downloaded; null if inapplicable
     */
    DownloadEvent(@Type int eventType, @Motive int motive, @Step int step, Content content) {
        this.content = content;
        this.eventType = eventType;
        this.pagesOK = 0;
        this.pagesKO = 0;
        this.pagesTotal = 0;
        this.downloadedSizeB = 0;
        this.motive = motive;
        this.step = step;
    }

    /**
     * Use for EV_PAUSE, EV_UNPAUSE and EV_SKIP events
     *
     * @param eventType event type code (among DownloadEvent public static EV_ values)
     */
    public DownloadEvent(@Type int eventType) {
        this.content = null;
        this.eventType = eventType;
        this.pagesOK = 0;
        this.pagesKO = 0;
        this.pagesTotal = 0;
        this.downloadedSizeB = 0;
        this.motive = Motive.NONE;
        this.step = Step.NONE;
    }

    public DownloadEvent(DownloadCommandEvent commandEvent) {
        this.content = commandEvent.content;
        this.eventType = fromCommandEventType(commandEvent.eventType);
        this.pagesOK = 0;
        this.pagesKO = 0;
        this.pagesTotal = 0;
        this.downloadedSizeB = 0;
        this.motive = Motive.NONE;
        this.step = Step.NONE;
    }

    private @Type int fromCommandEventType(@DownloadCommandEvent.Type int code) {
        switch (code) {
            case DownloadCommandEvent.Type.EV_PAUSE:
                return Type.EV_PAUSED;
            case DownloadCommandEvent.Type.EV_UNPAUSE:
                return Type.EV_UNPAUSED;
            case DownloadCommandEvent.Type.EV_CANCEL:
                return Type.EV_CANCELED;
            case DownloadCommandEvent.Type.EV_SKIP:
                return Type.EV_SKIPPED;
            case DownloadCommandEvent.Type.EV_INTERRUPT_CONTENT:
                return Type.EV_CONTENT_INTERRUPTED;
            default:
                return Type.EV_NONE;
        }
    }

    public int getNumberRetries() {
        return (null == content) ? 0 : content.getNumberDownloadRetries();
    }

    private DownloadEvent setLog(@NonNull String log) {
        this.log = log;
        return this;
    }
}
