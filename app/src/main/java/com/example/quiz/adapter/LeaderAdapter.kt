package com.example.quiz.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.quiz.databinding.ViewHolderBinding
import com.example.quiz.domain.useModel

class LeaderAdapter: RecyclerView.Adapter<LeaderAdapter.ViewHolder>() {

    private lateinit var  binding : ViewHolderBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LeaderAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding=ViewHolderBinding.inflate(inflater,parent,false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: LeaderAdapter.ViewHolder, position: Int) {
       val binding = ViewHolderBinding.bind(holder.itemView)
        binding.name1.text=differ.currentList[position].name

        val drawableResourcesId:Int=binding.root.resources.getIdentifier(
            differ.currentList[position].pic,
            "drawable",binding.root.context.packageName
        )
        Glide.with(binding.root.context)
            .load(drawableResourcesId)
            .into(binding.imageView2)
        binding.name1.text=(position+4).toString()
        binding.textScore.text=differ.currentList[position].score.toString()
    }

    override fun getItemCount() = differ.currentList.size

    inner  class ViewHolder : RecyclerView.ViewHolder(binding.root)
    private val differCallBack=object : DiffUtil.ItemCallback<useModel>(){
        override fun areItemsTheSame(oldItem: useModel, newItem: useModel): Boolean {
            return oldItem.id==newItem.id
        }

        override fun areContentsTheSame(oldItem: useModel, newItem: useModel): Boolean {
            return oldItem==newItem
        }
    }
    val differ = AsyncListDiffer(this,differCallBack)
}