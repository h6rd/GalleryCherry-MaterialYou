package me.devsaki.hentoid.workers.data;

import androidx.work.Data;

import javax.annotation.Nonnull;

import me.devsaki.hentoid.enums.StorageLocation;
import me.devsaki.hentoid.util.StringHelper;
import me.devsaki.hentoid.workers.PrimaryImportWorker;

/**
 * Helper class to transfer data from any Activity to {@link PrimaryImportWorker}
 * through a Data object
 * <p>
 * Use Builder class to set data; use Parser class to get data
 */
public class PrimaryImportData {
    private static final String KEY_REFRESH_RENAME = "rename";
    private static final String KEY_REFRESH_REMOVE_PLACEHOLDERS = "removePlaceholders";
    private static final String KEY_REFRESH_RENUMBER_PAGES = "renumberPages";
    private static final String KEY_REFRESH_CLEAN_NO_JSON = "cleanNoJson";
    private static final String KEY_REFRESH_CLEAN_NO_IMAGES = "cleanNoImages";
    private static final String KEY_IMPORT_GROUPS = "importGroups";

    private static final String KEY_LOCATION = "location";

    private static final String KEY_TARGET_ROOT = "targetRoot";

    private PrimaryImportData() {
        throw new UnsupportedOperationException();
    }

    public static final class Builder {

        private final Data.Builder builder = new Data.Builder();

        public void setRefreshRename(boolean rename) {
            builder.putBoolean(KEY_REFRESH_RENAME, rename);
        }

        public void setRefreshRemovePlaceholders(boolean data) {
            builder.putBoolean(KEY_REFRESH_REMOVE_PLACEHOLDERS, data);
        }

        public void setRenumberPages(boolean data) {
            builder.putBoolean(KEY_REFRESH_RENUMBER_PAGES, data);
        }

        public void setRefreshCleanNoJson(boolean refresh) {
            builder.putBoolean(KEY_REFRESH_CLEAN_NO_JSON, refresh);
        }

        public void setRefreshCleanNoImages(boolean refresh) {
            builder.putBoolean(KEY_REFRESH_CLEAN_NO_IMAGES, refresh);
        }

        public void setImportGroups(boolean value) {
            builder.putBoolean(KEY_IMPORT_GROUPS, value);
        }

        public void setLocation(StorageLocation value) {
            builder.putInt(KEY_LOCATION, value.ordinal());
        }

        public void setTargetRoot(String value) {
            builder.putString(KEY_TARGET_ROOT, value);
        }

        public Data getData() {
            return builder.build();
        }
    }

    public static final class Parser {

        private final Data data;

        public Parser(@Nonnull Data data) {
            this.data = data;
        }

        public boolean getRefreshRename() {
            return data.getBoolean(KEY_REFRESH_RENAME, false);
        }

        public boolean getRefreshRemovePlaceholders() {
            return data.getBoolean(KEY_REFRESH_REMOVE_PLACEHOLDERS, false);
        }

        public boolean getRefreshRenumberPages() {
            return data.getBoolean(KEY_REFRESH_RENUMBER_PAGES, false);
        }

        public boolean getRefreshCleanNoJson() {
            return data.getBoolean(KEY_REFRESH_CLEAN_NO_JSON, false);
        }

        public boolean getRefreshCleanNoImages() {
            return data.getBoolean(KEY_REFRESH_CLEAN_NO_IMAGES, false);
        }

        public boolean getImportGroups() {
            return data.getBoolean(KEY_IMPORT_GROUPS, true);
        }

        public StorageLocation getLocation() {
            return StorageLocation.values()[data.getInt(KEY_LOCATION, StorageLocation.NONE.ordinal())];
        }

        public String getTargetRoot() {
            return StringHelper.protect(data.getString(KEY_TARGET_ROOT));
        }
    }
}
