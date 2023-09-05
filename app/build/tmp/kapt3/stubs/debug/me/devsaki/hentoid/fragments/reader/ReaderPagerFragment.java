package me.devsaki.hentoid.fragments.reader;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00fa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b.\u0018\u0000 \u00b6\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004\u00b6\u0001\u00b7\u0001B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010D\u001a\u00020E2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0010\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020\bH\u0002J\u0010\u0010H\u001a\u00020E2\u0006\u0010I\u001a\u00020\bH\u0002J\u0010\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\bH\u0002J\u0010\u0010L\u001a\u00020\b2\u0006\u0010M\u001a\u00020\bH\u0002J\b\u0010N\u001a\u00020EH\u0002J\b\u0010O\u001a\u00020EH\u0002J\b\u0010P\u001a\u00020EH\u0002J\u0010\u0010Q\u001a\u00020\b2\u0006\u0010R\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u00020E2\u0006\u0010T\u001a\u00020\bH\u0016J\b\u0010U\u001a\u00020EH\u0002J\b\u0010V\u001a\u00020EH\u0002J\b\u0010W\u001a\u00020EH\u0002J\b\u0010X\u001a\u00020EH\u0002J\b\u0010Y\u001a\u00020EH\u0016J\b\u0010Z\u001a\u00020EH\u0002J\b\u0010[\u001a\u00020EH\u0002J\u0010\u0010\\\u001a\u00020E2\u0006\u0010]\u001a\u00020 H\u0002J\u001c\u0010^\u001a\u00020E2\u0012\u0010_\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010`\u001a\u00020EH\u0002J\b\u0010a\u001a\u00020EH\u0016J\u0012\u0010b\u001a\u00020E2\b\u0010c\u001a\u0004\u0018\u00010dH\u0002J\u0012\u0010e\u001a\u00020E2\b\u0010f\u001a\u0004\u0018\u00010gH\u0016J$\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010m2\b\u0010f\u001a\u0004\u0018\u00010gH\u0017J\u0010\u0010n\u001a\u00020E2\u0006\u0010o\u001a\u00020 H\u0016J\u0010\u0010p\u001a\u00020E2\u0006\u0010q\u001a\u00020rH\u0002J\b\u0010s\u001a\u00020EH\u0016J\b\u0010t\u001a\u00020EH\u0016J\u0010\u0010u\u001a\u00020E2\u0006\u0010v\u001a\u00020\u001cH\u0002J\u0010\u0010w\u001a\u00020E2\u0006\u0010x\u001a\u00020\bH\u0002J\b\u0010y\u001a\u00020EH\u0002J\u0010\u0010z\u001a\u00020E2\u0006\u0010{\u001a\u00020|H\u0002J\u0016\u0010}\u001a\u00020E2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00160\u007fH\u0002J\u0012\u0010\u0080\u0001\u001a\u00020E2\u0007\u0010\u0081\u0001\u001a\u00020\bH\u0002J\t\u0010\u0082\u0001\u001a\u00020EH\u0002J\t\u0010\u0083\u0001\u001a\u00020EH\u0002J\t\u0010\u0084\u0001\u001a\u00020EH\u0002J\u001a\u0010\u0085\u0001\u001a\u00020E2\u0006\u0010\u0007\u001a\u00020\b2\u0007\u0010\u0086\u0001\u001a\u00020\bH\u0002J\u0011\u0010\u0087\u0001\u001a\u00020E2\u0006\u0010]\u001a\u00020 H\u0002J\u0013\u0010\u0088\u0001\u001a\u00020E2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0007J\u0013\u0010\u008b\u0001\u001a\u00020E2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0007J\t\u0010\u008c\u0001\u001a\u00020EH\u0016J\t\u0010\u008d\u0001\u001a\u00020EH\u0002J\u0012\u0010\u008e\u0001\u001a\u00020E2\u0007\u0010\u008f\u0001\u001a\u00020gH\u0016J\u0012\u0010\u0090\u0001\u001a\u00020E2\u0007\u0010\u0091\u0001\u001a\u00020\bH\u0002J\u0012\u0010\u0092\u0001\u001a\u00020E2\u0007\u0010\u0093\u0001\u001a\u00020\u000fH\u0002J\t\u0010\u0094\u0001\u001a\u00020EH\u0002J\u0012\u0010\u0095\u0001\u001a\u00020E2\u0007\u0010\u0096\u0001\u001a\u00020 H\u0002J\t\u0010\u0097\u0001\u001a\u00020EH\u0002J\u0012\u0010\u0098\u0001\u001a\u00020E2\u0007\u0010\u0099\u0001\u001a\u00020\bH\u0002J\t\u0010\u009a\u0001\u001a\u00020EH\u0002J\t\u0010\u009b\u0001\u001a\u00020EH\u0016J\u0011\u0010\u009c\u0001\u001a\u00020E2\u0006\u0010I\u001a\u00020\bH\u0002J\t\u0010\u009d\u0001\u001a\u00020EH\u0016J\u0014\u0010\u009e\u0001\u001a\u00020E2\t\b\u0002\u0010\u009f\u0001\u001a\u00020 H\u0003J\t\u0010\u00a0\u0001\u001a\u00020EH\u0002J\t\u0010\u00a1\u0001\u001a\u00020EH\u0002J\t\u0010\u00a2\u0001\u001a\u00020EH\u0002J\t\u0010\u00a3\u0001\u001a\u00020EH\u0002J\u001c\u0010\u00a4\u0001\u001a\u00020E2\u0007\u0010\u00a5\u0001\u001a\u00020i2\b\u0010f\u001a\u0004\u0018\u00010gH\u0016J\u0013\u0010\u00a6\u0001\u001a\u00020E2\b\u0010f\u001a\u0004\u0018\u00010gH\u0016J\t\u0010\u00a7\u0001\u001a\u00020EH\u0016J\t\u0010\u00a8\u0001\u001a\u00020EH\u0002J\u0013\u0010\u00a9\u0001\u001a\u00020E2\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0002J\u0012\u0010\u00aa\u0001\u001a\u00020E2\u0007\u0010\u00ab\u0001\u001a\u00020\bH\u0016J\u0012\u0010\u00ac\u0001\u001a\u00020E2\u0007\u0010\u00ad\u0001\u001a\u00020 H\u0002J\t\u0010\u00ae\u0001\u001a\u00020EH\u0002J\u001b\u0010\u00af\u0001\u001a\u00020E2\u0007\u0010\u00b0\u0001\u001a\u00020 2\u0007\u0010\u00b1\u0001\u001a\u00020\u0014H\u0002J\t\u0010\u00b2\u0001\u001a\u00020EH\u0002J\t\u0010\u00b3\u0001\u001a\u00020EH\u0002J\u0012\u0010\u00b4\u0001\u001a\u00020E2\u0007\u0010\u00b5\u0001\u001a\u00020 H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082.\u00a2\u0006\u0002\n\u0000R \u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b030\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u00104\u001a\b\u0012\u0004\u0012\u0002050\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00b8\u0001"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderPagerFragment;", "Landroidx/fragment/app/Fragment;", "Lme/devsaki/hentoid/fragments/reader/ReaderBrowseModeDialogFragment$Parent;", "Lme/devsaki/hentoid/fragments/reader/ReaderPrefsDialogFragment$Parent;", "Lme/devsaki/hentoid/fragments/reader/ReaderDeleteDialogFragment$Parent;", "Lme/devsaki/hentoid/fragments/reader/ReaderNavigation$Pager;", "()V", "absImageIndex", "", "adapter", "Lme/devsaki/hentoid/adapters/ImagePagerAdapter;", "binding", "Lme/devsaki/hentoid/databinding/FragmentReaderPagerBinding;", "bookPreferences", "", "", "centerInside", "Lcom/bumptech/glide/load/Transformation;", "Landroid/graphics/Bitmap;", "contentId", "", "currentImg", "Lme/devsaki/hentoid/database/domains/ImageFile;", "getCurrentImg", "()Lme/devsaki/hentoid/database/domains/ImageFile;", "deleteMenu", "Landroid/view/MenuItem;", "displayParams", "Lme/devsaki/hentoid/fragments/reader/ReaderPagerFragment$DisplayParams;", "glideRequestOptions", "Lcom/bumptech/glide/request/RequestOptions;", "hasGalleryBeenShown", "", "indexRefreshDebouncer", "Lme/devsaki/hentoid/util/DebouncerK;", "isComputingImageList", "isContentArchive", "isContentDynamic", "isContentFavourite", "isPageFavourite", "isSlideshowActive", "latestSlideshowTick", "listener", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "llm", "Lme/devsaki/hentoid/widget/PrefetchLinearLayoutManager;", "navigator", "Lme/devsaki/hentoid/fragments/reader/ReaderNavigation;", "pageSnapWidget", "Lme/devsaki/hentoid/widget/PageSnapWidget;", "processPositionDebouncer", "Lorg/apache/commons/lang3/tuple/Pair;", "rescaleDebouncer", "", "scrollListener", "Lme/devsaki/hentoid/widget/ScrollPositionListener;", "showFavoritePagesMenu", "shuffleMenu", "slideshowPeriodMs", "slideshowSliderDebouncer", "slideshowTimer", "Lio/reactivex/disposables/Disposable;", "smoothScroller", "Lme/devsaki/hentoid/widget/ReaderSmoothScroller;", "startingIndexLoaded", "targetStartingIndex", "viewModel", "Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "adjustDisplay", "", "applyStartingIndex", "absStartingIndex", "applyStartingIndexInternal", "startingIndex", "convertPrefsDelayToSliderPosition", "prefsDelay", "convertSliderPositionToPrefsDelay", "sliderPosition", "differEndCallback", "displayGallery", "fixPage", "getOrientation", "orientation", "goToPage", "absPageNum", "hideControlsOverlay", "hidePendingMicroMenus", "initControlsOverlay", "initPager", "nextBook", "nextPage", "onBackClick", "onBookFavouriteSuccess", "newState", "onBookPreferenceChanged", "newPrefs", "onBookSettingsClick", "onBrowseModeChange", "onContentChanged", "content", "Lme/devsaki/hentoid/database/domains/Content;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDeleteElement", "onDeletePage", "onDeleteError", "t", "", "onDestroy", "onDestroyView", "onDisplayParamsChange", "newDisplayParams", "onFavouriteMicroMenuClick", "position", "onFavouriteMicroMenuOpen", "onGetMaxDimensions", "maxDimensions", "Landroid/graphics/Point;", "onImagesChanged", "images", "", "onInfoMicroMenuClick", "menuPosition", "onLeftTap", "onLongTap", "onMiddleTap", "onPageChanged", "scrollDirection", "onPageFavouriteSuccess", "onProcessEvent", "event", "Lme/devsaki/hentoid/events/ProcessEvent;", "onProcessStickyEvent", "onResume", "onRightTap", "onSaveInstanceState", "outState", "onScrollPositionChange", "scrollPosition", "onSharedPreferenceChanged", "key", "onShowFavouriteClick", "onShuffleChanged", "isShuffled", "onShuffleClick", "onSlideShowSliderChosen", "sliderIndex", "onSlideshowTick", "onStart", "onStartingIndexChanged", "onStop", "onUpdateImageDisplay", "isReaderWide", "onUpdatePageNumDisplay", "onUpdatePrefsScreenOn", "onUpdateSwipeToFling", "onUpdateSwipeToTurn", "onViewCreated", "view", "onViewStateRestored", "previousBook", "previousPage", "processEvent", "seekToPosition", "absIndex", "setSystemBarsVisible", "visible", "showControlsOverlay", "startSlideshow", "showToast", "initialDelayMs", "stopSlideshow", "updateFavouriteButtonIcon", "updateShowFavouriteDisplay", "showFavouritePages", "Companion", "DisplayParams", "app_debug"})
public final class ReaderPagerFragment extends androidx.fragment.app.Fragment implements me.devsaki.hentoid.fragments.reader.ReaderBrowseModeDialogFragment.Parent, me.devsaki.hentoid.fragments.reader.ReaderPrefsDialogFragment.Parent, me.devsaki.hentoid.fragments.reader.ReaderDeleteDialogFragment.Parent, me.devsaki.hentoid.fragments.reader.ReaderNavigation.Pager {
    private final com.bumptech.glide.load.Transformation<android.graphics.Bitmap> centerInside = null;
    private final com.bumptech.glide.request.RequestOptions glideRequestOptions = null;
    private me.devsaki.hentoid.adapters.ImagePagerAdapter adapter;
    private me.devsaki.hentoid.widget.PrefetchLinearLayoutManager llm;
    private me.devsaki.hentoid.widget.PageSnapWidget pageSnapWidget;
    private final android.content.SharedPreferences.OnSharedPreferenceChangeListener listener = null;
    private me.devsaki.hentoid.viewmodels.ReaderViewModel viewModel;
    private int absImageIndex = -1;
    private boolean hasGalleryBeenShown = false;
    private final me.devsaki.hentoid.widget.ScrollPositionListener scrollListener = null;
    private io.reactivex.disposables.Disposable slideshowTimer;
    private boolean isSlideshowActive = false;
    private long slideshowPeriodMs = -1L;
    private long latestSlideshowTick = -1L;
    private me.devsaki.hentoid.fragments.reader.ReaderPagerFragment.DisplayParams displayParams;
    private java.util.Map<java.lang.String, java.lang.String> bookPreferences;
    private boolean isContentArchive = false;
    private boolean isContentDynamic = false;
    private boolean isPageFavourite = false;
    private boolean isContentFavourite = false;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> indexRefreshDebouncer;
    private me.devsaki.hentoid.util.DebouncerK<org.apache.commons.lang3.tuple.Pair<java.lang.Integer, java.lang.Integer>> processPositionDebouncer;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Float> rescaleDebouncer;
    private boolean isComputingImageList = false;
    private int targetStartingIndex = -1;
    private boolean startingIndexLoaded = false;
    private long contentId = -1L;
    private me.devsaki.hentoid.databinding.FragmentReaderPagerBinding binding;
    private me.devsaki.hentoid.widget.ReaderSmoothScroller smoothScroller;
    private android.view.MenuItem deleteMenu;
    private android.view.MenuItem showFavoritePagesMenu;
    private android.view.MenuItem shuffleMenu;
    private me.devsaki.hentoid.fragments.reader.ReaderNavigation navigator;
    private me.devsaki.hentoid.util.DebouncerK<java.lang.Integer> slideshowSliderDebouncer;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.fragments.reader.ReaderPagerFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_HUD_VISIBLE = "hud_visible";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_GALLERY_SHOWN = "gallery_shown";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SLIDESHOW_ON = "slideshow_on";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_SLIDESHOW_REMAINING_MS = "slideshow_remaining_ms";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_IMG_INDEX = "image_index";
    
    public ReaderPagerFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public me.devsaki.hentoid.database.domains.ImageFile getCurrentImg() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    @android.annotation.SuppressLint(value = {"NonConstantResourceId"})
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @java.lang.Override
    public void onViewStateRestored(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onStop() {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
    
    @org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProcessEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onProcessStickyEvent(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void processEvent(me.devsaki.hentoid.events.ProcessEvent event) {
    }
    
    private final void initPager() {
    }
    
    private final void initControlsOverlay() {
    }
    
    private final int convertPrefsDelayToSliderPosition(int prefsDelay) {
        return 0;
    }
    
    private final int convertSliderPositionToPrefsDelay(int sliderPosition) {
        return 0;
    }
    
    /**
     * Back button handler
     */
    private final void onBackClick() {
    }
    
    /**
     * Show the book viewer settings dialog
     */
    private final void onBookSettingsClick() {
    }
    
    /**
     * Handle click on "Shuffle" action button
     */
    private final void onShuffleClick() {
    }
    
    /**
     * Handle click on "Show favourite pages" toggle action button
     */
    private final void onShowFavouriteClick() {
    }
    
    /**
     * Update the display of the "favourite page" action button
     *
     * @param showFavouritePages True if the button has to represent a favourite page; false instead
     */
    private final void updateShowFavouriteDisplay(boolean showFavouritePages) {
    }
    
    /**
     * Handle click on "Information" micro menu
     */
    private final void onInfoMicroMenuClick(int menuPosition) {
    }
    
    private final void onFavouriteMicroMenuOpen() {
    }
    
    /**
     * Handle click on one of the "Favourite" micro menu items
     */
    private final void onFavouriteMicroMenuClick(int position) {
    }
    
    private final void updateFavouriteButtonIcon() {
    }
    
    private final void hidePendingMicroMenus() {
    }
    
    private final void onPageFavouriteSuccess(boolean newState) {
    }
    
    private final void onBookFavouriteSuccess(boolean newState) {
    }
    
    /**
     * Observer for changes in the book's list of images
     *
     * @param images Book's list of images
     */
    private final void onImagesChanged(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images) {
    }
    
    /**
     * Callback for the end of image list diff calculations
     * Activated when all displayed items are placed on their definitive position
     */
    private final void differEndCallback() {
    }
    
    /**
     * Observer for changes on the book's starting image index
     *
     * @param startingIndex Book's starting image index
     */
    private final void onStartingIndexChanged(int startingIndex) {
    }
    
    private final void applyStartingIndex(int absStartingIndex) {
    }
    
    private final void applyStartingIndexInternal(int startingIndex) {
    }
    
    /**
     * Observer for changes on the current book
     *
     * @param content Loaded book
     */
    private final void onContentChanged(me.devsaki.hentoid.database.domains.Content content) {
    }
    
    /**
     * Observer for changes on the shuffled state
     *
     * @param isShuffled New shuffled state
     */
    private final void onShuffleChanged(boolean isShuffled) {
    }
    
    @java.lang.Override
    public void onDeleteElement(boolean onDeletePage) {
    }
    
    /**
     * Callback for the failure of the "delete item" action
     */
    private final void onDeleteError(java.lang.Throwable t) {
    }
    
    /**
     * Scroll / page change listener
     *
     * @param scrollPosition New 0-based scroll position
     */
    private final void onScrollPositionChange(int scrollPosition) {
    }
    
    private final void onPageChanged(int absImageIndex, int scrollDirection) {
    }
    
    /**
     * Listener for preference changes (from the settings dialog)
     *
     * @param key   Key that has been changed
     */
    private final void onSharedPreferenceChanged(java.lang.String key) {
    }
    
    @java.lang.Override
    public void onBookPreferenceChanged(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> newPrefs) {
    }
    
    private final void onUpdatePrefsScreenOn() {
    }
    
    private final void onUpdateSwipeToFling() {
    }
    
    private final void onUpdateSwipeToTurn() {
    }
    
    /**
     * Re-bind necessary Viewholders
     */
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    private final void onUpdateImageDisplay(boolean isReaderWide) {
    }
    
    private final void onUpdatePageNumDisplay() {
    }
    
    private final void adjustDisplay(java.util.Map<java.lang.String, java.lang.String> bookPreferences) {
    }
    
    @java.lang.Override
    public void onBrowseModeChange() {
    }
    
    private final void onDisplayParamsChange(me.devsaki.hentoid.fragments.reader.ReaderPagerFragment.DisplayParams newDisplayParams) {
    }
    
    /**
     * Transforms current Preferences orientation into LinearLayoutManager orientation code
     *
     * @return Preferred orientation, as LinearLayoutManager orientation code
     */
    private final int getOrientation(int orientation) {
        return 0;
    }
    
    /**
     * Handler for the "fix" button
     */
    private final void fixPage() {
    }
    
    /**
     * Load next page
     */
    private final void nextPage() {
    }
    
    /**
     * Load previous page
     */
    private final void previousPage() {
    }
    
    /**
     * Seek to the given position; update preview images if they are visible
     *
     * @param absIndex Index to go to (0-indexed; books-scale)
     */
    @java.lang.Override
    public void seekToPosition(int absIndex) {
    }
    
    @java.lang.Override
    public void nextBook() {
    }
    
    @java.lang.Override
    public void previousBook() {
    }
    
    /**
     * Go to the given page number
     *
     * @param absPageNum Asbolute page number to go to (1-indexed; book-scale)
     */
    @java.lang.Override
    public void goToPage(int absPageNum) {
    }
    
    /**
     * Handler for tapping on the left zone of the screen
     */
    private final void onLeftTap() {
    }
    
    /**
     * Handler for tapping on the right zone of the screen
     */
    private final void onRightTap() {
    }
    
    /**
     * Handler for tapping on the middle zone of the screen
     */
    private final void onMiddleTap() {
    }
    
    /**
     * Handler for long-tapping the screen
     */
    private final void onLongTap() {
    }
    
    private final void showControlsOverlay() {
    }
    
    private final void hideControlsOverlay() {
    }
    
    /**
     * Display the viewer gallery
     */
    private final void displayGallery() {
    }
    
    /**
     * Show / hide bottom and top Android system bars
     *
     * @param visible True if bars have to be shown; false instead
     */
    private final void setSystemBarsVisible(boolean visible) {
    }
    
    private final void onGetMaxDimensions(android.graphics.Point maxDimensions) {
    }
    
    private final void onSlideShowSliderChosen(int sliderIndex) {
    }
    
    private final void startSlideshow(boolean showToast, long initialDelayMs) {
    }
    
    private final void onSlideshowTick() {
    }
    
    private final void stopSlideshow() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderPagerFragment$DisplayParams;", "", "browseMode", "", "displayMode", "isSmoothRendering", "", "(IIZ)V", "getBrowseMode", "()I", "direction", "getDirection", "getDisplayMode", "()Z", "orientation", "getOrientation", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_debug"})
    public static final class DisplayParams {
        private final int browseMode = 0;
        private final int displayMode = 0;
        private final boolean isSmoothRendering = false;
        private final int orientation = 0;
        private final int direction = 0;
        
        @org.jetbrains.annotations.NotNull
        public final me.devsaki.hentoid.fragments.reader.ReaderPagerFragment.DisplayParams copy(int browseMode, int displayMode, boolean isSmoothRendering) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DisplayParams(int browseMode, int displayMode, boolean isSmoothRendering) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getBrowseMode() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getDisplayMode() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        public final boolean isSmoothRendering() {
            return false;
        }
        
        public final int getOrientation() {
            return 0;
        }
        
        public final int getDirection() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/devsaki/hentoid/fragments/reader/ReaderPagerFragment$Companion;", "", "()V", "KEY_GALLERY_SHOWN", "", "KEY_HUD_VISIBLE", "KEY_IMG_INDEX", "KEY_SLIDESHOW_ON", "KEY_SLIDESHOW_REMAINING_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}