package com.example.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagram.Adapters.FeedAdapter
import com.example.instagram.Model.Feed
import com.example.instagram.Model.Post
import com.example.instagram.Model.Story

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this,1))

        refreshAdapter(getAllFeeds())
    }
    fun refreshAdapter(feeds: ArrayList<Feed>){
        val adapter = FeedAdapter(this,feeds)
        recyclerView!!.adapter = adapter
    }
    fun getAllFeeds(): ArrayList<Feed>{

        val stories: ArrayList<Story> = ArrayList()

        stories.add(Story(R.drawable.camera_boy,"Aziz"))
        stories.add(Story(R.drawable.im_7,"Bektosh"))
        stories.add(Story(R.drawable.camera_boy,"Jonibek"))
        stories.add(Story(R.drawable.im_7,"Kamron"))
        stories.add(Story(R.drawable.camera_boy,"Feruz"))
        stories.add(Story(R.drawable.im_7,"Mansur"))
        stories.add(Story(R.drawable.camera_boy,"Umid"))
        stories.add(Story(R.drawable.im_7,"Odilbek"))

        val feeds: ArrayList<Feed> = ArrayList()
        feeds.add(Feed(stories))

        feeds.add(Feed(Post(R.drawable.im_7,"Azizbek",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Kamron",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Saidahmad",R.drawable.background_5)))
        feeds.add(Feed(Post(R.drawable.im_7,"Yahyo",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Elmurod",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Shahriyor",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Mirkamol",R.drawable.camera_boy)))
        feeds.add(Feed(Post(R.drawable.im_7,"Samandar",R.drawable.camera_boy)))

        return feeds
    }
}