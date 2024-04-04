package com.example.calculator_03


import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class HistoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

        val historyList = intent.getStringArrayExtra("history_list") ?: arrayOf()

        val itemsAdapter: ArrayAdapter<String> =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, historyList)
        val listView = findViewById<View>(R.id.history_listView) as ListView
        listView.setAdapter(itemsAdapter)


    }
}