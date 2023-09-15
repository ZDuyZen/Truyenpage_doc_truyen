package com.example.truyen_page;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;


public class ViewPager_Adapter extends FragmentStatePagerAdapter {
    public ViewPager_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Tab_HomeFragment();
            case 1:
                return new Tab_TimkiemFragment();
            case 2:
                return new Tab_TutruyenFragment();
            case 3:
                return new Tab_TaiKhoanFragment();
            default:
                return new Tab_HomeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}
