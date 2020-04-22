package kun.hee.pizzastoreapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kun.hee.pizzastoreapp.datas.Store

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpEvents()
        setValues()
    }

    override fun setUpEvents() {

    }

    override fun setValues() {
        val tempSotre = Store("피자헛","naver.com","123-5678")

    }


}
