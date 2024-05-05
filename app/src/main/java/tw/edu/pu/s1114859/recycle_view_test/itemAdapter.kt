package tw.edu.pu.s1114859.recycle_view_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class itemAdapter(val items: List<Contact>, val context: Context):RecyclerView.Adapter<itemAdapter.ViewHolder>() {
    class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val dataname = view.findViewById<TextView>(R.id.dataname)
        val dataphone =view.findViewById<TextView>(R.id.dataphone)
        val datafax =view.findViewById<TextView>(R.id.datafax)
        val datamail =view.findViewById<TextView>(R.id.datamail)
        val dataddress =view.findViewById<TextView>(R.id.dataddress)
        val datarea =view.findViewById<TextView>(R.id.datarea)
        val datalink =view.findViewById<TextView>(R.id.datalink)
        val dataupdated =view.findViewById<TextView>(R.id.dataupdated)
        val dataob =view.findViewById<TextView>(R.id.dataob)
        val datacategory =view.findViewById<TextView>(R.id.datacategory)
        val datage =view.findViewById<TextView>(R.id.datage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataname.text = items[position].toString()
        holder.dataphone.text= items[position].toString()
        holder.datafax.text= items[position].toString()
        holder.datamail.text= items[position].toString()
        holder.dataddress.text= items[position].toString()
        holder.datarea.text= items[position].toString()
        holder.datalink.text= items[position].toString()
        holder.dataupdated.text= items[position].toString()
        holder.dataob.text= items[position].toString()
        holder.datacategory.text= items[position].toString()
        holder.datage.text= items[position].toString()

        }

    }

