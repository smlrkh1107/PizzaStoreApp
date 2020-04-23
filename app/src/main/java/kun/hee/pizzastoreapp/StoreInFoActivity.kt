package kun.hee.pizzastoreapp

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
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
//            it 변수 활용 예시.
//             it.visibility = view.GONE
            val pl = object : PermissionListener{
                override fun onPermissionGranted() {

                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                }


            }

            TedPermission.with(mContext)
                .setPermissionListener(pl)
                .setDeniedMessage("통화 권한 설정을 해야 사용 가능합니다. [설정]에서 권한을 허용해주세요.")
                .setPermissions(Manifest.permission.CALL_PHONE) //안드로이드가 주는 manifest를 꼭 import
                .check()

        }

    }

    override fun setValues() {

        storeData = intent.getSerializableExtra("storeData") as Store

        storeNameTxt.text = storeData.name
        storeNumTxt.text = storeData.StoreNum

        Glide.with(mContext).load(storeData.logoUrl).into(storeLogoImg)


    }


}
