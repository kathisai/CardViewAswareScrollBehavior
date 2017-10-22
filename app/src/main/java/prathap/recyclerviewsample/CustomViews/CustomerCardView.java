package prathap.recyclerviewsample.CustomViews;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

@CoordinatorLayout.DefaultBehavior(CardViewAwareScrollingViewBehavior.class)
public class CustomerCardView extends CardView {

    public CustomerCardView(Context context) {
        super(context);
    }

    public CustomerCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomerCardView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}