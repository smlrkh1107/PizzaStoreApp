package kun.hee.pizzastoreapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kun.hee.pizzastoreapp.R
import kun.hee.pizzastoreapp.datas.Store

class StoreAdapter(context:Context, resId:Int, list: ArrayList<Store>)
    : ArrayAdapter<Store>(context, resId, list) { // 얘가 ()가 비면 받아와지지 않아서~변수를 미리 지정
    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)


//    한줄 한줄 어떻게 불러올까?
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView

        tempRow?.let{
            //null이 아닐 때
        }.let { //null일 때
            tempRow = inf.inflate(R.layout.store_list, null)
        }
        val row = tempRow!!
        return row
    }

}