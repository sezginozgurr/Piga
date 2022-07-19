package com.example.piga.ui.home.personprofile.detail.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.piga.R
import com.example.piga.base.BaseDiffCallBack
import com.example.piga.base.BindingViewHolder
import com.example.piga.data.fakemodel.HobbyModel
import com.example.piga.databinding.ItemHobbyBinding
import com.example.piga.util.inflate

class HobbysListAdapter : RecyclerView.Adapter<HobbysListAdapter.HobbyViewHolder>() {

    var items: List<HobbyModel> = arrayListOf()
        set(value) {
            val diffUtil = BaseDiffCallBack(field, value)
            val diffResults = DiffUtil.calculateDiff(diffUtil)
            field = value
            diffResults.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HobbysListAdapter.HobbyViewHolder {
        return HobbyViewHolder(parent)
    }

    override fun onBindViewHolder(holder: HobbysListAdapter.HobbyViewHolder, position: Int) {
        holder.bind(HobbyHolderArgs(
            item = items[position]
        ))
    }

    override fun getItemCount(): Int = items.size

    inner class HobbyViewHolder(parent: ViewGroup) :
        BindingViewHolder<ItemHobbyBinding>(parent.inflate(R.layout.item_hobby)) {
        fun bind(adapterArgs: HobbyHolderArgs) {
            binding.args = adapterArgs
            binding.executePendingBindings()
        }
    }

    inner class HobbyHolderArgs(
        val item: HobbyModel
    ) {

        val name: String
            get() = item.hobbyText
    }
}
