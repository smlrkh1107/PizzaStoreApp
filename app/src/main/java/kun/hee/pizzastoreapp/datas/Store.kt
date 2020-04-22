package kun.hee.pizzastoreapp.datas

import java.io.Serializable

data class Store (val name:String="미입력", val StoreNum:String, val logoUrl:String) :Serializable //
// :Serializable 이거 붙이면 myIntent.putExtra 에 클래스 바로 담아도 됨