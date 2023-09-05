package me.devsaki.hentoid.fragments.library;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

import me.devsaki.hentoid.R;
import me.devsaki.hentoid.util.Debouncer;

/**
 * Dialog to assign a reting
 */
public class RatingDialogFragment extends DialogFragment {

    private static final String RATING = "RATING";
    private static final String ITEM_IDS = "ITEM_IDS";

    // === UI
    private final ImageView[] stars = new ImageView[5];

    // === VARIABLES
    private Parent parent;
    private int initialRating;
    private long[] itemIds;
    private Debouncer<Integer> closeDebouncer;


    public static void invoke(@NonNull final Fragment parent, long[] itemIds, int initialRating) {
        Bundle args = new Bundle();
        args.putInt(RATING, initialRating);
        args.putLongArray(ITEM_IDS, itemIds);

        RatingDialogFragment dialogFragment = new RatingDialogFragment();
        dialogFragment.setArguments(args);
        dialogFragment.show(parent.getChildFragmentManager(), null);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (null == getArguments()) throw new IllegalArgumentException("No arguments found");
        initialRating = getArguments().getInt(RATING);
        itemIds = getArguments().getLongArray(ITEM_IDS);

        parent = (Parent) getParentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedState) {
        return inflater.inflate(R.layout.dialog_library_rating, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View rootView, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(rootView, savedInstanceState);

        stars[0] = rootView.findViewById(R.id.star_1);
        stars[1] = rootView.findViewById(R.id.star_2);
        stars[2] = rootView.findViewById(R.id.star_3);
        stars[3] = rootView.findViewById(R.id.star_4);
        stars[4] = rootView.findViewById(R.id.star_5);
        MaterialButton clearBtn = rootView.findViewById(R.id.clear_rating_btn);

        for (int i = 0; i < 5; i++) {
            final int rating = i;
            stars[i].setOnClickListener(v -> setRating(rating + 1, true));
        }
        clearBtn.setOnClickListener(v -> setRating(0, true));
        setRating(initialRating, false);

        closeDebouncer = new Debouncer<>(stars[0].getContext(), 150, i -> {
            parent.rateItems(itemIds, i);
            dismissAllowingStateLoss();
        });
    }

    @Override
    public void onDestroy() {
        parent = null;
        closeDebouncer.clear();
        super.onDestroy();
    }

    @Override
    public void onCancel(@NonNull DialogInterface dialog) {
        parent.leaveSelectionMode();
        super.onCancel(dialog);
    }

    private void setRating(int rating, boolean close) {
        for (int i = 5; i > 0; i--)
            stars[i - 1].setImageResource(i <= rating ? R.drawable.ic_star_full : R.drawable.ic_star_empty);

        if (close) closeDebouncer.submit(rating);
    }

    public interface Parent {
        void rateItems(@NonNull long[] itemIds, int newRating);

        void leaveSelectionMode();
    }
}
