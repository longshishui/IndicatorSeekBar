package com.warkiz.widget

import androidx.databinding.BindingAdapter

class IndicatorSeekBarAdapter {
    companion object {
        @BindingAdapter("isb_max")
        @JvmStatic
        fun setIsbMax(view: IndicatorSeekBar, max: Int) {
            view.max = max.toFloat()
        }

        @BindingAdapter("isb_min")
        @JvmStatic
        fun setIsbMin(view: IndicatorSeekBar, min: Int) {
            view.min = min.toFloat()
        }

        @BindingAdapter("isb_progress")
        @JvmStatic
        fun setIsbProgress(view: IndicatorSeekBar, progress: Int) {
            view.setProgress(progress.toFloat())
        }

        @BindingAdapter("isb_tick_marks_color")
        @JvmStatic
        fun setIsbTickMarksColor(view: IndicatorSeekBar, color: Int) {
            view.tickMarksColor(color)
        }


        @BindingAdapter("isb_indicator_color")
        @JvmStatic
        fun setIsbIndicatorColor(view: IndicatorSeekBar, color: Int) {
            view.setIndicatorColor(color)
        }

        @BindingAdapter("isb_indicator_text_color")
        @JvmStatic
        fun setIsbIndicatorTextColor(view: IndicatorSeekBar, color: Int) {
            view.setIndicatorTextColor(color)
        }

        @BindingAdapter("isb_track_progress_color")
        @JvmStatic
        fun setIsbTrackProgressColor(view: IndicatorSeekBar, color: Int) {
            view.setProgressColor(color)
        }


        @BindingAdapter("isb_track_background_color")
        @JvmStatic
        fun setIsbBackgroundTrackColor(view: IndicatorSeekBar, color: Int) {
            view.setBackgroundTrackColor(color)
        }
    }
}