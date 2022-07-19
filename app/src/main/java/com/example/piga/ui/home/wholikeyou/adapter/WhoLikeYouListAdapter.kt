package com.example.piga.ui.home.wholikeyou.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.piga.R
import com.example.piga.base.BaseDiffCallBack
import com.example.piga.base.BindingViewHolder
import com.example.piga.data.fakemodel.WhoLikeYouModel
import com.example.piga.databinding.ItemWhoLikeYouBinding
import com.example.piga.util.inflate
import com.example.piga.util.setSafeOnClickListener

class WhoLikeYouListAdapter(private val onClickListener: (WhoLikeYouModel) -> Unit) :
    RecyclerView.Adapter<WhoLikeYouListAdapter.WhoLikeYouViewHolder>() {

    var items: List<WhoLikeYouModel> = arrayListOf()
        set(value) {
            val diffUtil = BaseDiffCallBack(field, value)
            val diffResults = DiffUtil.calculateDiff(diffUtil)
            field = value
            diffResults.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WhoLikeYouListAdapter.WhoLikeYouViewHolder {
        return WhoLikeYouViewHolder(parent)
    }

    override fun onBindViewHolder(
        holder: WhoLikeYouListAdapter.WhoLikeYouViewHolder,
        position: Int
    ) {
        holder.bind(
            WhoLikeYouArgs(
                item = items[position]
            )
        )
    }

    override fun getItemCount(): Int = items.size

    inner class WhoLikeYouViewHolder(parent: ViewGroup) :
        BindingViewHolder<ItemWhoLikeYouBinding>(parent.inflate(R.layout.item_who_like_you)) {
        fun bind(adapterArgs: WhoLikeYouArgs) {
            binding.args = adapterArgs
            binding.layoutRoot.setSafeOnClickListener {
                onClickListener.invoke(adapterArgs.item)
            }
            binding.executePendingBindings()
        }
    }

    inner class WhoLikeYouArgs(
        val item: WhoLikeYouModel
    ) {

        val name: String
            get() = item.name

        val genderImage = when (item.genderType) {
            0 -> {
                R.drawable.ic_gender_female
            }
            else -> {
                R.drawable.ic_gender_male
            }
        }

        val image = item.image
    }
}