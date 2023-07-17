package com.gt.gt5_cw3_pixabay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gt.gt5_cw3_pixabay.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    var adapter=PixaAdapter()
    var page=1
    var lastQuery=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()


        binding.rvImage.addOnScrollListener(object : RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx:Int, dy:Int) {
                super.onScrolled(recyclerView, dx, dy)

                val layoutManager=recyclerView.layoutManager as LinearLayoutManager
                val totalItemCount=layoutManager.itemCount
                val lastVisibleItem=layoutManager.findLastVisibleItemPosition()

                if(totalItemCount<=lastVisibleItem+1){
                    page++
                    binding.searchImage()
                }
            }
        })
    }



    private fun initClickers() {
        with(binding) {
            rvImage.adapter=adapter
            btnChangePage.setOnClickListener {
page ++
               searchImage()
            }

            btnSearch.setOnClickListener {
                adapter.arrayList.clear()
                page=1
                searchImage()
            }
        }
    }

    private fun ActivityMainBinding.searchImage(){
        val currentQuery=etSearch.text.toString()
        if(currentQuery!=lastQuery){
            adapter.arrayList.clear()
            page=1
            lastQuery=currentQuery
        }

    RetrofitService.api.searchImage(etSearch.text.toString(),page=page)
        .enqueue(object: Callback<PixaModel>{
        override fun onResponse(
            call: Call<PixaModel>,
            response: Response<PixaModel>) {
            if(response.isSuccessful){

                var data=response.body()?.hits
             adapter.addImages(data!!)
            }
        }

        override fun onFailure(call: Call<PixaModel>, t: Throwable) {

        }
    })
    }

    }


