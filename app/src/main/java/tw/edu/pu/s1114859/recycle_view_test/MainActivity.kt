package tw.edu.pu.s1114859.recycle_view_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mRecyclerView: RecyclerView
    val contacts= listOf<Contact>(
        Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","",""),
        //Contact("財團法人基督教惠明盲人福利基金會","(04)25661021","","","臺中市大雅區三和里1鄰雅潭路四段336號","大雅區","https://hueiming.eoffering.org.tw/","20230417","身心障礙者","","")



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mRecyclerView=findViewById(R.id.recyclerView)
        mRecyclerView.layoutManager=LinearLayoutManager(this)
        mRecyclerView.adapter = itemAdapter(contacts, this)

    }
}