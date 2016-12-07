package com.wssholmes.stark.sectioncalculator;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by stark on 07/12/16.
 */

public class NavigationDrawerListAdpater extends
        RecyclerView.Adapter<NavigationDrawerListAdpater.NavigationDrawerListAdapterViewHolder> {
    private static final String LOG_TAG = NavigationDrawerListAdpater.class.getSimpleName();

    private final Context mContext;
    private final String[] mDrawerList;

    public NavigationDrawerListAdpater(Context context){
        mContext = context;
        mDrawerList = mContext.getResources().getStringArray(R.array.section_titles);
    }
    @Override
    public NavigationDrawerListAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(parent instanceof RecyclerView){
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drawer_list_item, parent, false);
            view.setFocusable(true);
            return new NavigationDrawerListAdapterViewHolder(view);
        } else {
            throw new RuntimeException("Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(NavigationDrawerListAdapterViewHolder holder, int position) {
        holder.mListItemName.setText(mDrawerList[position]);

    }

    @Override
    public int getItemCount() {
        return mDrawerList.length;
    }

    public class NavigationDrawerListAdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView mListItemName;
        private ImageView mListItemLogo;
        public NavigationDrawerListAdapterViewHolder(View itemView) {
            super(itemView);
            mListItemName = (TextView) itemView.findViewById(R.id.navigation_drawer_item_name);
            mListItemLogo = (ImageView) itemView.findViewById(R.id.navigation_drawer_item_image);
        }
    }
}
