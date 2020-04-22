package kun.hee.pizzastoreapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.store_info.*
import kun.hee.pizzastoreapp.adapters.StoreAdapter
import kun.hee.pizzastoreapp.datas.Store

class MainActivity : BaseActivity() {
            //변수에 값넣는거 초기화시켜줌.
    private lateinit var mPizzaAdapter:StoreAdapter
    val pizzaStores = ArrayList<Store>()

    val mpa:StoreAdapter by lazy {
        StoreAdapter(mContext, R.layout.store_list, pizzaStores)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

        storeListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStoreData = pizzaStores.get(position)

            val myIntent = Intent(mContext, StoreInFoActivity::class.java)
            myIntent.putExtra("storeDate", clickedStoreData) //class를 바로 넣으면 에러에러
            startActivity(myIntent)

        }


    }

    override fun setValues() {
        addPizzaStores()
        mPizzaAdapter = StoreAdapter(mContext, R.layout.store_list, pizzaStores)

        storeListView.adapter = mpa

    }

    fun addPizzaStores() {

        pizzaStores.add(Store("피자헛", "02-999-9999","https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Fk.kakaocdn.net%2Fdn%2FnkQca%2FbtqwVT4rrZo%2FymhFqW9uRbzrmZTxUU1QC1%2Fimg.jpg"))
        pizzaStores.add(Store("파파존스", "02-222-0101","http://mblogthumb2.phinf.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png?type=w800"))
        pizzaStores.add(Store("도미노 피자", "02-888-9787","https://post-phinf.pstatic.net/MjAxODEyMDVfMzYg/MDAxNTQzOTYxOTA4NjM3.8gsStnhxz7eEc9zpt5nmSRZmI-Pzpl4NJvHYU-Dlgmcg.7Vpgk0lopJ5GoTav3CUDqmXi2-_67S5AXD0AGbbR6J4g.JPEG/IMG_1641.jpg?type=w1200"))
        pizzaStores.add(Store("미스터 피자", "02-xxx-xxxx","https://pbs.twimg.com/profile_images/1098371010548555776/trCrCTDN_400x400.png"))


    }


}
