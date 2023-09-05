package me.devsaki.hentoid.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000 \u00ad\u00012\u00020\u0001:\u0002\u00ad\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006Jn\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0013000\u00160\u00162F\u00102\u001aB\u0012\u0004\u0012\u000201\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00130003j \u0012\u0004\u0012\u000201\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001300`4H\u0002J\u0018\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u0010\t\u001a\u00020\u000bH\u0002J&\u00109\u001a\u0002062\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\"\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020\u00132\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J\u001a\u0010B\u001a\u0002062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J\"\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020\u00102\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J(\u0010E\u001a\u0002062\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J.\u0010G\u001a\u0002062\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\u00132\u0006\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u0018\u0010K\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000eH\u0002J&\u0010N\u001a\u0002062\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u0002J(\u0010T\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020\u00102\u0006\u0010V\u001a\u00020\u001b2\u0006\u0010W\u001a\u00020\u001bH\u0002J\u0018\u0010X\u001a\u0002062\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0010H\u0002J&\u0010\\\u001a\u0002062\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010]\u001a\u00020I2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\u001e\u0010_\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H\u0002J\u0010\u0010a\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0002J\u0016\u0010b\u001a\u0002062\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J<\u0010d\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001e0f0e2\u0006\u0010[\u001a\u00020\u00102\u0006\u0010R\u001a\u00020S2\u0006\u0010g\u001a\u00020\u0019H\u0002J\u001e\u0010h\u001a\u0002062\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010R\u001a\u00020SH\u0002J^\u0010i\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001e0j2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u00132\u0006\u0010[\u001a\u00020\u00102\u0018\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0m0\u00162\u0006\u0010R\u001a\u00020S2\u0006\u0010n\u001a\u00020\u001e2\u0006\u0010o\u001a\u00020\u0019H\u0002J&\u0010p\u001a\u0002062\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00100\u00162\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020SH\u0002J\u000e\u0010q\u001a\u0002062\u0006\u0010r\u001a\u00020\u001bJ\u000e\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0012J\f\u0010t\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012J\f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0012J\f\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012J\u0012\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u0012J\u001e\u0010x\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\u00102\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J\"\u0010y\u001a\u0002062\u0006\u0010z\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00102\b\b\u0002\u0010{\u001a\u00020\u001bH\u0002J \u0010|\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u00102\b\b\u0002\u0010{\u001a\u00020\u001bJ\u0018\u0010}\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u0010H\u0002J\u001e\u0010}\u001a\u0002062\u0006\u0010L\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u007fJ#\u0010\u0080\u0001\u001a\u0002062\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00102\b\b\u0002\u0010{\u001a\u00020\u001bH\u0002J\u0007\u0010\u0081\u0001\u001a\u000206J(\u0010\u0082\u0001\u001a\u0002062\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00102\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0002J\u0010\u0010\u0084\u0001\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020\u0010J\u0010\u0010\u0086\u0001\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020\u0010J:\u0010\u0087\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130m0e2\u0006\u0010L\u001a\u00020\u000e2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0007\u0010\u0088\u0001\u001a\u000201H\u0002J\u000f\u0010\u0089\u0001\u001a\u0002062\u0006\u0010;\u001a\u00020\u0010J\u0019\u0010\u008a\u0001\u001a\u0002062\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u0010H\u0002J\u0011\u0010\u008b\u0001\u001a\u0002062\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\u0007\u0010\u008e\u0001\u001a\u000206J\t\u0010\u008f\u0001\u001a\u000206H\u0014J\t\u0010\u0090\u0001\u001a\u000206H\u0002J\u0010\u0010\u0091\u0001\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020\u0010J\u0019\u0010\u0092\u0001\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020\u00102\u0007\u0010\u0093\u0001\u001a\u00020\u0010J\'\u0010\u0094\u0001\u001a\u0002062\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J \u0010\u0095\u0001\u001a\u0002062\u0006\u0010:\u001a\u00020\u000b2\r\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130\rH\u0002J\u001b\u0010\u0096\u0001\u001a\u0002062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J\u0013\u0010\u0097\u0001\u001a\u0002062\b\b\u0002\u0010{\u001a\u00020\u001bH\u0002J\u001b\u0010\u0098\u0001\u001a\u0002062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J\u0007\u0010\u0099\u0001\u001a\u000206J\u0016\u0010\u009a\u0001\u001a\u0002062\r\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020I0\u0016J%\u0010\u009c\u0001\u001a\u0002062\u0007\u0010\u009d\u0001\u001a\u00020\u00102\u0013\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002060@J\u0010\u0010\u009f\u0001\u001a\u0002062\u0007\u0010\u00a0\u0001\u001a\u00020\u0013J\u0010\u0010\u00a1\u0001\u001a\u0002062\u0007\u0010\u00a2\u0001\u001a\u00020\u0010J \u0010\u00a3\u0001\u001a\u0002062\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\u0007\u0010\u00a4\u0001\u001a\u00020\u001bH\u0002J\u001b\u0010\u00a5\u0001\u001a\u0002062\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u0002060@J\u001c\u0010\u00a6\u0001\u001a\u0002062\u0013\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002060@J%\u0010\u00a7\u0001\u001a\u0002062\u0007\u0010\u0085\u0001\u001a\u00020\u00102\u0013\u0010\u009e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002060@J\u001f\u0010\u00a7\u0001\u001a\u0002062\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00130\u00162\b\u0010\u009e\u0001\u001a\u00030\u00a8\u0001J\u0007\u0010\u00a9\u0001\u001a\u000206J\u001d\u0010\u00aa\u0001\u001a\u0002062\u0014\u0010\u00ab\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u00ac\u0001R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\r\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010\u001f\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010 !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\"0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010#\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010 !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\u00100\u0010\u0018\u00010\"0 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R2\u0010.\u001a&\u0012\f\u0012\n !*\u0004\u0018\u00010\u00130\u0013 !*\u0012\u0012\f\u0012\n !*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00160\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u00ae\u0001"}, d2 = {"Lme/devsaki/hentoid/viewmodels/ReaderViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "dao", "Lme/devsaki/hentoid/database/CollectionDAO;", "(Landroid/app/Application;Lme/devsaki/hentoid/database/CollectionDAO;)V", "archiveExtractDisposable", "Lio/reactivex/disposables/Disposable;", "content", "Landroidx/lifecycle/MutableLiveData;", "Lme/devsaki/hentoid/database/domains/Content;", "contentIds", "", "", "currentContentIndex", "", "currentImageSource", "Landroidx/lifecycle/LiveData;", "Lme/devsaki/hentoid/database/domains/ImageFile;", "databaseImages", "Landroidx/lifecycle/MediatorLiveData;", "", "downloadsQueue", "Ljava/util/Queue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "forceImgReload", "", "imageLocationCache", "", "", "indexDlInProgress", "", "kotlin.jvm.PlatformType", "", "indexExtractInProgress", "interruptArchiveExtract", "loadedContentId", "readPageNumbers", "searchManager", "Lme/devsaki/hentoid/widget/ContentSearchManager;", "showFavouritesOnly", "shuffled", "startingIndex", "thumbIndex", "viewerImages", "viewerImagesInternal", "buildPermutationGroups", "Lkotlin/Triple;", "Landroid/net/Uri;", "swaps", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "cacheJson", "", "context", "Landroid/content/Context;", "contentFirstLoad", "theContent", "pageNumber", "imageFiles", "createRemoveChapter", "selectedPage", "onError", "Lkotlin/Function1;", "", "deleteContent", "deletePage", "pageViewerIndex", "deletePages", "pages", "doCreateChapter", "currentChapter", "Lme/devsaki/hentoid/database/domains/Chapter;", "chapterImgs", "doCreateRemoveChapter", "contentId", "selectedPageId", "doExtractPics", "indexesToLoad", "archiveFile", "Landroidx/documentfile/provider/DocumentFile;", "targetFolder", "Ljava/io/File;", "doLeaveBook", "indexToSet", "updateReads", "markAsCompleted", "doNotifyDownloadProgress", "progressPc", "", "pageIndex", "doRemoveChapter", "toRemove", "chapterImages", "doSaveChapterPositions", "newChapterOrder", "doToggleContentFavourite", "doToggleImageFavourite", "images", "downloadPic", "Lcom/annimon/stream/Optional;", "Lorg/apache/commons/lang3/tuple/ImmutableTriple;", "stopDownload", "downloadPics", "downloadPictureFromPage", "Lorg/apache/commons/lang3/tuple/ImmutablePair;", "img", "requestHeaders", "Landroidx/core/util/Pair;", "targetFileName", "interruptDownload", "extractPics", "filterFavouriteImages", "targetState", "getContent", "getShowFavouritesOnly", "getShuffled", "getStartingIndex", "getViewerImages", "isPictureNeedsProcessing", "loadContent", "c", "forceImageReload", "loadContentFromId", "loadContentFromSearchParams", "bundle", "Landroid/os/Bundle;", "loadDatabaseImages", "loadFavPages", "loadImages", "newImages", "loadNextContent", "viewerIndex", "loadPreviousContent", "mapUriToImageFile", "uri", "markPageAsRead", "notifyDownloadProgress", "observeDbImages", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "onActivityLeave", "onCleared", "onContentRemoved", "onLeaveBook", "onPageChange", "direction", "processImages", "processStorageImages", "redownloadImages", "reloadContent", "reparseContent", "repostImages", "saveChapterPositions", "chapters", "setContentRating", "rating", "successCallback", "setCover", "page", "setViewerStartingIndex", "index", "sortAndSetViewerImages", "shuffle", "stripChapters", "toggleContentFavourite", "toggleImageFavourite", "Ljava/lang/Runnable;", "toggleShuffle", "updateContentPreferences", "newPrefs", "", "Companion", "app_release"})
public final class ReaderViewModel extends androidx.lifecycle.AndroidViewModel {
    private final me.devsaki.hentoid.database.CollectionDAO dao = null;
    private final me.devsaki.hentoid.widget.ContentSearchManager searchManager = null;
    private final androidx.lifecycle.MutableLiveData<me.devsaki.hentoid.database.domains.Content> content = null;
    private java.util.List<java.lang.Long> contentIds;
    private int currentContentIndex = -1;
    private long loadedContentId = -1L;
    private boolean forceImgReload = false;
    private androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.ImageFile>> currentImageSource;
    private final androidx.lifecycle.MediatorLiveData<java.util.List<me.devsaki.hentoid.database.domains.ImageFile>> databaseImages = null;
    private final java.util.List<me.devsaki.hentoid.database.domains.ImageFile> viewerImagesInternal = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<me.devsaki.hentoid.database.domains.ImageFile>> viewerImages = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> startingIndex = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> shuffled = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showFavouritesOnly = null;
    private int thumbIndex = 0;
    private final java.util.Set<java.lang.Integer> readPageNumbers = null;
    private final java.util.Map<java.lang.Integer, java.lang.String> imageLocationCache = null;
    private final java.util.concurrent.atomic.AtomicBoolean interruptArchiveExtract = null;
    private final java.util.Set<java.lang.Integer> indexDlInProgress = null;
    private final java.util.Set<java.lang.Integer> indexExtractInProgress = null;
    private final java.util.Queue<java.util.concurrent.atomic.AtomicBoolean> downloadsQueue = null;
    private io.reactivex.disposables.Disposable archiveExtractDisposable;
    @org.jetbrains.annotations.NotNull
    public static final me.devsaki.hentoid.viewmodels.ReaderViewModel.Companion Companion = null;
    public static final int CONCURRENT_DOWNLOADS = 3;
    public static final int EXTRACT_RANGE = 35;
    private static java.util.regex.Pattern VANILLA_CHAPTERNAME_PATTERN;
    
    public ReaderViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application, @org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.CollectionDAO dao) {
        super(null);
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<me.devsaki.hentoid.database.domains.Content> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<me.devsaki.hentoid.database.domains.ImageFile>> getViewerImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Integer> getStartingIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShuffled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowFavouritesOnly() {
        return null;
    }
    
    public final void observeDbImages(@org.jetbrains.annotations.NotNull
    androidx.appcompat.app.AppCompatActivity activity) {
    }
    
    /**
     * Load the given Content at the given page number
     *
     * @param contentId  ID of the Content to load
     * @param pageNumber Page number to start with
     */
    public final void loadContentFromId(long contentId, int pageNumber, boolean forceImageReload) {
    }
    
    /**
     * Load the given Content at the given page number + preload all content IDs corresponding to the given search params
     *
     * @param contentId  ID of the Content to load
     * @param pageNumber Page number to start with
     * @param bundle     ContentSearchBundle with the current filters and search criteria
     */
    public final void loadContentFromSearchParams(long contentId, int pageNumber, @org.jetbrains.annotations.NotNull
    android.os.Bundle bundle) {
    }
    
    /**
     * Load the given Content at the given page number using the current state of SearchManager
     *
     * @param contentId  ID of the Content to load
     * @param pageNumber Page number to start with
     */
    private final void loadContentFromSearchParams(long contentId, int pageNumber) {
    }
    
    public final void loadFavPages() {
    }
    
    /**
     * Set the given index as the picture viewer's starting index
     *
     * @param index Page index to set
     */
    public final void setViewerStartingIndex(int index) {
    }
    
    /**
     * Process the given raw ImageFile entries to populate the viewer
     *
     * @param theContent Content to use
     * @param pageNumber Page number to start with
     * @param newImages  Images to process
     */
    private final void loadImages(me.devsaki.hentoid.database.domains.Content theContent, int pageNumber, java.util.List<me.devsaki.hentoid.database.domains.ImageFile> newImages) {
    }
    
    /**
     * Process the given raw ImageFile entries to populate the viewer, loading the images directly from the device's storage
     *
     * @param theContent Content to use
     * @param newImages  Images to process
     */
    private final void processStorageImages(me.devsaki.hentoid.database.domains.Content theContent, java.util.List<me.devsaki.hentoid.database.domains.ImageFile> newImages) {
    }
    
    /**
     * Callback to run when the activity is on the verge of being destroyed
     */
    public final void onActivityLeave() {
    }
    
    /**
     * Map the given file Uri to its corresponding ImageFile in the given list, using their display name
     *
     * @param contentId  ID of the current Content
     * @param imageFiles List of ImageFiles to map the given Uri to
     * @param uri        File Uri to map to one of the elements of the given list
     * @return Matched ImageFile with the valued Uri if found; empty ImageFile if not found
     */
    private final com.annimon.stream.Optional<androidx.core.util.Pair<java.lang.Integer, me.devsaki.hentoid.database.domains.ImageFile>> mapUriToImageFile(long contentId, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> imageFiles, android.net.Uri uri) {
        return null;
    }
    
    /**
     * Initialize the picture viewer using the given parameters
     *
     * @param theContent Content to use
     * @param pageNumber Page number to start with
     * @param imageFiles Pictures to process
     */
    private final void processImages(me.devsaki.hentoid.database.domains.Content theContent, int pageNumber, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> imageFiles) {
    }
    
    /**
     * Initialize the picture viewer using the given parameters
     * (used only once per book when it is loaded for the first time)
     *
     * @param theContent Content to use
     * @param pageNumber Page number to start with
     * @param imageFiles Pictures to process
     */
    private final void contentFirstLoad(me.devsaki.hentoid.database.domains.Content theContent, int pageNumber, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> imageFiles) {
    }
    
    /**
     * Toggle the shuffle mode
     */
    public final void toggleShuffle() {
    }
    
    /**
     * Sort and set the given images for the viewer
     *
     * @param images    Images to process
     * @param shuffle Trye if shuffle mode is on; false if not
     */
    private final void sortAndSetViewerImages(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images, boolean shuffle) {
    }
    
    /**
     * Callback to run whenever a book is left (e.g. using previous/next or leaving activity)
     *
     * @param viewerIndex Viewer index of the active page when the user left the book
     */
    public final void onLeaveBook(int viewerIndex) {
    }
    
    /**
     * Perform the I/O operations to persist book information upon leaving
     *
     * @param contentId       ID of the Content to save
     * @param indexToSet      DB page index to set as the last read page
     * @param updateReads     True if number of reads have to be updated; false if not
     * @param markAsCompleted True if the book has to be marked as completed
     */
    private final void doLeaveBook(long contentId, int indexToSet, boolean updateReads, boolean markAsCompleted) {
    }
    
    /**
     * Set the filter for favourite pages to the target state
     *
     * @param targetState Target state of the favourite pages filter
     */
    public final void filterFavouriteImages(boolean targetState) {
    }
    
    /**
     * Toggle the favourite status of the page at the given viewer index
     *
     * @param viewerIndex     Viewer index of the page whose status to toggle
     * @param successCallback Callback to be called on success
     */
    public final void toggleImageFavourite(int viewerIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> successCallback) {
    }
    
    /**
     * Toggle the favourite status of the given pages
     *
     * @param images          Pages whose status to toggle
     * @param successCallback Callback to be called on success
     */
    public final void toggleImageFavourite(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images, @org.jetbrains.annotations.NotNull
    java.lang.Runnable successCallback) {
    }
    
    /**
     * Toggles page favourite flag in DB and in the content JSON
     *
     * @param images images whose flag to toggle
     */
    private final void doToggleImageFavourite(java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images) {
    }
    
    /**
     * Toggle the favourite flag of the given Content
     *
     * @param successCallback Callback to be called on success
     */
    public final void toggleContentFavourite(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> successCallback) {
    }
    
    /**
     * Toggle the favourite flag of the given Content in DB and in the content JSON
     *
     * @param content content whose flag to toggle
     */
    private final me.devsaki.hentoid.database.domains.Content doToggleContentFavourite(me.devsaki.hentoid.database.domains.Content content) {
        return null;
    }
    
    /**
     * Set the given rating for the current content
     */
    public final void setContentRating(int rating, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> successCallback) {
    }
    
    /**
     * Delete the current Content
     *
     * @param onError Callback to call in case an error occurs
     */
    public final void deleteContent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    private final void onContentRemoved() {
    }
    
    /**
     * Delete the page at the given viewer index
     *
     * @param pageViewerIndex Viewer index of the page to delete
     * @param onError         Callback to run in case of error
     */
    public final void deletePage(int pageViewerIndex, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Delete the given pages
     *
     * @param pages   Pages to delete
     * @param onError Callback to run in case of error
     */
    public final void deletePages(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> pages, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Set the given image as the current Content's cover
     *
     * @param page Page to set as the current Content's cover
     */
    public final void setCover(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.ImageFile page) {
    }
    
    /**
     * Load the next Content according to the current filter & search criteria
     *
     * @param viewerIndex Page viewer index the current Content has been left on
     */
    public final void loadNextContent(int viewerIndex) {
    }
    
    /**
     * Load the previous Content according to the current filter & search criteria
     *
     * @param viewerIndex Page viewer index the current Content has been left on
     */
    public final void loadPreviousContent(int viewerIndex) {
    }
    
    private final void reloadContent(boolean forceImageReload) {
    }
    
    /**
     * Load the given content at the given page number
     *
     * @param c Content to load
     * @param pageNumber Page number to start with
     */
    private final void loadContent(me.devsaki.hentoid.database.domains.Content c, int pageNumber, boolean forceImageReload) {
    }
    
    /**
     * Load the given Content's pictures from the database and process them, initializing the viewer to start at the given page number
     *
     * @param theContent Content to load the pictures for
     * @param pageNumber Page number to start with
     */
    private final void loadDatabaseImages(me.devsaki.hentoid.database.domains.Content theContent, int pageNumber, boolean forceImageReload) {
    }
    
    /**
     * Update local preferences for the current Content
     *
     * @param newPrefs Preferences to replace the current Content's local preferences
     */
    public final void updateContentPreferences(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> newPrefs) {
    }
    
    /**
     * Cache the JSON URI of the given Content in the database to speed up favouriting
     *
     * @param context Context to use
     * @param content Content to cache the JSON URI for
     */
    private final void cacheJson(android.content.Context context, me.devsaki.hentoid.database.domains.Content content) {
    }
    
    /**
     * Mark the given page number as read
     *
     * @param pageNumber Page number to mark as read
     */
    public final void markPageAsRead(int pageNumber) {
    }
    
    /**
     * Force all images to be reposted
     */
    public final void repostImages() {
    }
    
    /**
     * Handler to call when changing page
     *
     * @param viewerIndex Viewer index of the page that has just been displayed
     * @param direction   Direction the viewer is going to (1 : forward; -1 : backward; 0 : no movement)
     */
    @kotlin.jvm.Synchronized
    public final synchronized void onPageChange(int viewerIndex, int direction) {
    }
    
    /**
     * Indicate if the picture at the given page index in the given list needs processing
     * (i.e. downloading o extracting)
     *
     * @param pageIndex Index to test
     * @param images    List of pictures to test against
     * @return True if the picture at the given index needs processing; false if not
     */
    private final boolean isPictureNeedsProcessing(int pageIndex, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> images) {
        return false;
    }
    
    /**
     * Download the pictures at the given indexes to the given folder
     *
     * @param indexesToLoad DB indexes of the pictures to download
     * @param targetFolder  Target folder to download the pictures to
     */
    private final void downloadPics(java.util.List<java.lang.Integer> indexesToLoad, java.io.File targetFolder) {
    }
    
    /**
     * Extract the picture files at the given indexes from the given archive to the given folder
     *
     * @param indexesToLoad DB indexes of the pictures to download
     * @param archiveFile   Archive file to extract from
     * @param targetFolder  Folder to extract the files to
     */
    private final void extractPics(java.util.List<java.lang.Integer> indexesToLoad, androidx.documentfile.provider.DocumentFile archiveFile, java.io.File targetFolder) {
    }
    
    private final void doExtractPics(java.util.List<java.lang.Integer> indexesToLoad, androidx.documentfile.provider.DocumentFile archiveFile, java.io.File targetFolder) {
    }
    
    /**
     * Download the picture at the given index to the given folder
     *
     * @param pageIndex    Index of the picture to download
     * @param targetFolder Folder to download to
     * @param stopDownload Switch to interrupt the download
     * @return Optional triple with
     * - The page index
     * - The Uri of the downloaded file
     * - The Mime-type of the downloaded file
     *
     * The return value is empty if the download fails
     */
    private final com.annimon.stream.Optional<org.apache.commons.lang3.tuple.ImmutableTriple<java.lang.Integer, java.lang.String, java.lang.String>> downloadPic(int pageIndex, java.io.File targetFolder, java.util.concurrent.atomic.AtomicBoolean stopDownload) {
        return null;
    }
    
    /**
     * Download the picture represented by the given ImageFile to the given disk location
     *
     * @param content           Corresponding Content
     * @param img               ImageFile of the page to download
     * @param pageIndex         Index of the page to download
     * @param requestHeaders    HTTP request headers to use
     * @param targetFolder      Folder where to save the downloaded resource
     * @param targetFileName    Name of the file to save the downloaded resource
     * @param interruptDownload Used to interrupt the download whenever the value switches to true. If that happens, the file will be deleted.
     * @return Pair containing
     * - Left : Downloaded file
     * - Right : Detected mime-type of the downloaded resource
     * @throws UnsupportedContentException, IOException, LimitReachedException, EmptyResultException, DownloadInterruptedException in case something horrible happens
     */
    @kotlin.jvm.Throws(exceptionClasses = {me.devsaki.hentoid.util.exception.UnsupportedContentException.class, java.io.IOException.class, me.devsaki.hentoid.util.exception.LimitReachedException.class, me.devsaki.hentoid.util.exception.EmptyResultException.class, me.devsaki.hentoid.util.exception.DownloadInterruptedException.class})
    private final org.apache.commons.lang3.tuple.ImmutablePair<android.net.Uri, java.lang.String> downloadPictureFromPage(me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.database.domains.ImageFile img, int pageIndex, java.util.List<? extends androidx.core.util.Pair<java.lang.String, java.lang.String>> requestHeaders, java.io.File targetFolder, java.lang.String targetFileName, java.util.concurrent.atomic.AtomicBoolean interruptDownload) {
        return null;
    }
    
    /**
     * Send the current book to the queue to be reparsed from scratch
     *
     * @param onError Consumer to call in case reparsing fails
     */
    public final void reparseContent(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Send the current book to the queue to be redownloaded from scratch
     *
     * @param onError Consumer to call in case reparsing fails
     */
    public final void redownloadImages(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Notify the download progress of the given page
     *
     * @param progressPc % progress to display
     * @param pageIndex  Index of downloaded page
     */
    private final void notifyDownloadProgress(float progressPc, int pageIndex) {
    }
    
    /**
     * Notify the download progress of the given page
     *
     * @param progressPc % progress to display
     * @param pageIndex  Index of downloaded page
     */
    private final void doNotifyDownloadProgress(float progressPc, int pageIndex) {
    }
    
    /**
     * Strip all chapters from the current Content
     * NB : All images are kept; only chapters are removed
     *
     * @param onError Callback in case processing fails
     */
    public final void stripChapters(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Create or remove a chapter at the given position
     * - If the given position is the first page of a chapter -> remove this chapter
     * - If not, create a new chapter at this position
     *
     * @param selectedPage Position to remove or create a chapter at
     * @param onError      Callback in case processing fails
     */
    public final void createRemoveChapter(@org.jetbrains.annotations.NotNull
    me.devsaki.hentoid.database.domains.ImageFile selectedPage, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onError) {
    }
    
    /**
     * Create or remove a chapter at the given position
     * * - If the given position is the first page of a chapter -> remove this chapter
     * * - If not, create a new chapter at this position
     *
     * @param contentId      ID of the corresponding content
     * @param selectedPageId ID of the page to remove or create a chapter at
     */
    private final void doCreateRemoveChapter(long contentId, long selectedPageId) {
    }
    
    /**
     * Create a chapter at the given position, which will become the 1st page of the new chapter
     *
     * @param content        Corresponding Content
     * @param selectedPage   Position to create a new chapter at
     * @param currentChapter Current chapter at the given position
     * @param chapterImgs  Images of the current chapter at the given position
     */
    private final void doCreateChapter(me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.database.domains.ImageFile selectedPage, me.devsaki.hentoid.database.domains.Chapter currentChapter, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> chapterImgs) {
    }
    
    /**
     * Remove the given chapter
     * All pages from this chapter will be affected to the preceding chapter
     *
     * @param content       Corresponding Content
     * @param toRemove      Chapter to remove
     * @param chapterImages Images of the chapter to remove
     */
    private final void doRemoveChapter(me.devsaki.hentoid.database.domains.Content content, me.devsaki.hentoid.database.domains.Chapter toRemove, java.util.List<? extends me.devsaki.hentoid.database.domains.ImageFile> chapterImages) {
    }
    
    public final void saveChapterPositions(@org.jetbrains.annotations.NotNull
    java.util.List<? extends me.devsaki.hentoid.database.domains.Chapter> chapters) {
    }
    
    private final void doSaveChapterPositions(long contentId, java.util.List<java.lang.Long> newChapterOrder) {
    }
    
    private final java.util.List<java.util.List<kotlin.Triple<android.net.Uri, android.net.Uri, me.devsaki.hentoid.database.domains.ImageFile>>> buildPermutationGroups(java.util.HashMap<android.net.Uri, kotlin.Triple<android.net.Uri, android.net.Uri, me.devsaki.hentoid.database.domains.ImageFile>> swaps) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lme/devsaki/hentoid/viewmodels/ReaderViewModel$Companion;", "", "()V", "CONCURRENT_DOWNLOADS", "", "EXTRACT_RANGE", "VANILLA_CHAPTERNAME_PATTERN", "Ljava/util/regex/Pattern;", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}