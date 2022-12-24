package com.example.flyy

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.flyy.R.id.bottomNav
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNv:BottomNavigationView
    private lateinit var recyclerView: RecyclerView
    private lateinit var flatList:ArrayList<Flat>
    private lateinit var developerList: ArrayList<Developer>
    private lateinit var flatAdapter: FlatAdapter
    private lateinit var developerAdapter: DeveloperAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNv=findViewById(bottomNav)
        bottomNavigation()
        init()
        init2()

    }

    private fun init2() {
        val recyclerView2=findViewById<RecyclerView>(R.id.recycleView2)
        recyclerView2.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        developerList= ArrayList()
        addDataToDeveloperList()
        developerAdapter=DeveloperAdapter(developerList)
        recyclerView2.adapter=developerAdapter
    }

    private fun init(){
        recyclerView=findViewById(R.id.recycleView)
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        flatList= ArrayList()
        addDataToFlatList()
        flatAdapter= FlatAdapter(flatList)
        recyclerView.adapter=flatAdapter
    }

    private fun addDataToFlatList(){
        flatList.add(Flat(R.drawable.flat3,"2BD/1BA 2 bedrooms","Dev n","Cima Park","$ 3M"))
        flatList.add(Flat(R.drawable.flat2,"3BD/1BA 2 bedrooms","Enclave","Golden Park","$ 5M"))
        flatList.add(Flat(R.drawable.flat1,"1BD/1BA 2 bedrooms","SunView","Cima Park","$ 1.5M"))
        flatList.add(Flat(R.drawable.flat4,"4BD/1BA 2 bedrooms","Rudra","Royal city","$ 7M"))
        flatList.add(Flat(R.drawable.flat5,"3BD/1BA 2 bedrooms","Debo M","Monata","$ 3.1M",))
        flatList.add(Flat(R.drawable.flat3,"2BD/1BA 2 bedrooms","Dev n","Cima Park","$ 3M"))
        flatList.add(Flat(R.drawable.flat2,"3BD/1BA 2 bedrooms","Enclave","Golden Park","$ 5M"))
        flatList.add(Flat(R.drawable.flat1,"1BD/1BA 2 bedrooms","SunView","Cima Park","$ 1.5M"))
        flatList.add(Flat(R.drawable.flat4,"4BD/1BA 2 bedrooms","Rudra","Royal city","$ 7M"))
        flatList.add(Flat(R.drawable.flat5,"3BD/1BA 2 bedrooms","Debo M","Monata","$ 3.1M",))
    }
    private fun addDataToDeveloperList(){
        developerList.add(Developer(R.drawable.yeah,"Mutuo"))
        developerList.add(Developer(R.drawable.yeah2,"Romon Escobar"))
        developerList.add(Developer(R.drawable.yeah3,"Hulk"))
        developerList.add(Developer(R.drawable.flat1,"Pablo"))
        developerList.add(Developer(R.drawable.yeah,"Mutuo"))
        developerList.add(Developer(R.drawable.yeah2,"Romon Escobar"))
        developerList.add(Developer(R.drawable.yeah3,"Hulk"))
        developerList.add(Developer(R.drawable.flat1,"Pablo"))


    }


    private fun bottomNavigation() {
        bottomNv.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.home -> Toast.makeText(this, "home clicked", Toast.LENGTH_SHORT).show()
                R.id.chats-> Toast.makeText(this, "chat clicked", Toast.LENGTH_SHORT).show()
                R.id.notification -> Toast.makeText(this, "Notification clicked", Toast.LENGTH_SHORT).show()
                R.id.setting-> Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }
}