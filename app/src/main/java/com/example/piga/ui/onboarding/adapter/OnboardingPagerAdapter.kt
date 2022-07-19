package com.example.piga.ui.onboarding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.piga.R
import com.example.piga.data.fakemodel.OnboardingPagerModel

class OnboardingPagerAdapter(
    private val list: List<OnboardingPagerModel>
) : RecyclerView.Adapter<OnboardingPagerAdapter.OnBoardingPagerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingPagerViewHolder =
        OnBoardingPagerViewHolder(parent)

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: OnBoardingPagerViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class OnBoardingPagerViewHolder(
        parent: ViewGroup
    ) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_onboarding, parent, false)
    ) {
        private val onboardTitle = itemView.findViewById(R.id.onboardTitle) as AppCompatTextView
        private val onboardDescription =
            itemView.findViewById(R.id.onboardDescription) as AppCompatTextView
        private val image = itemView.findViewById(R.id.imageView) as ImageView

        fun bind(model: OnboardingPagerModel) {
            onboardTitle.text = model.title
            image.background = ContextCompat.getDrawable(itemView.context, model.imageId)
            onboardDescription.text = model.description
        }
    }
}