package com.example.recyclerview_meiwildanmuhammadfarrel_21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fotoList = listOf<Foto>(
            Foto(
                R.drawable.farrel,
                "farrel",
                "XI RPL 3 XI RPL 3 XI RPL 3"
            ),
            Foto(
                R.drawable.rifqi,
                "rifqi",
                "XI RPL 3 XI RPL 3 XI RPL 3"
            ),
            Foto(
                R.drawable.laila,
                "laila",
                "XI RPL 3 XI RPL 3 XI RPL 3"
            ),
            Foto(
                R.drawable.patria,
                "patria",
                "XI RPL 3 XI RPL 3 XI RPL 3"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_foto)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = fotoAdapter(this, fotoList){
            val intent = Intent (this, DetailfotoActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}