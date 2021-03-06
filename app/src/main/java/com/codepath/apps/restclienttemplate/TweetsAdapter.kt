package com.codepath.apps.restclienttemplate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codepath.apps.restclienttemplate.models.Tweet
import kotlin.text.Typography.bullet

class TweetsAdapter(val tweets:ArrayList<Tweet>): RecyclerView.Adapter<TweetsAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivProfileImage = itemView.findViewById<ImageView>(R.id.ivProfileImage)
        val tvUsername = itemView.findViewById<TextView>(R.id.tvUsername)
        val tvScreenName = itemView.findViewById<TextView>(R.id.tvScreenName)
        val tvTweetBody = itemView.findViewById<TextView>(R.id.tvTweetBody)
        val tvTimestamp = itemView.findViewById<TextView>(R.id.tvTimestamp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsAdapter.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val view = inflater.inflate(R.layout.item_tweet, parent, false)

        return ViewHolder(view)
    }

    // Populates data into the ViewHolder
    override fun onBindViewHolder(holder: TweetsAdapter.ViewHolder, position: Int) {
        // Get the data model based on position
        val tweet: Tweet = tweets.get(position)

        holder.tvUsername.text = tweet.user?.name
        holder.tvScreenName.text = "@${tweet.user?.screenName}"
        holder.tvTweetBody.text = tweet.body
        holder.tvTimestamp.text = "$bullet ${tweet.formattedTimestamp}"

        Glide.with(holder.itemView).load(tweet.user?.publicImageUrl).circleCrop().into(holder.ivProfileImage)
    }

    override fun getItemCount(): Int {
        return tweets.size
    }

    fun clear() {
        tweets.clear()
        notifyDataSetChanged()
    }

    // Add a list of items -- change to type used
    fun addAll(tweetList: List<Tweet>) {
        tweets.addAll(tweetList)
        notifyDataSetChanged()
    }
}