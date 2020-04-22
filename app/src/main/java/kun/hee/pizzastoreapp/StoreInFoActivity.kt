package kun.hee.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.store_info.*
import kun.hee.pizzastoreapp.adapters.StoreAdapter
import kun.hee.pizzastoreapp.datas.Store

class StoreInFoActivity : BaseActivity() {

    private lateinit var storeData: Store


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setUpEvents()
        setValues()
    }


    override fun setUpEvents() {


        callBtn.setOnClickListener {

        }



    }

    override fun setValues() {

        storeData = intent.getSerializableExtra("storeData") as Store


    }


}
