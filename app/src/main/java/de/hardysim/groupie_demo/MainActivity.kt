package de.hardysim.groupie_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.ViewHolder

class MainActivity : AppCompatActivity() {

    private val groupAdapter by lazy {
        object: GroupAdapter<ViewHolder>() {

        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        groupAdapter.itemCount
    }
}
