package com.example.restrauntapplication.data

data class Latlng(
    var lat:Double,
    var lng:Double)

data class OperatingHours constructor(
      var Monday:String ,
      var Tuesday:String,
      var Wednesday:String,
      var Thursday:String,
      var Friday:String,
      var Saturday:String,
      var Sunday:String,
      )

data class Review(
    var name :String,
    var data :String,
    var rating:Int,
    var comments :String
)

data class Restaurant constructor(
    var id :Int ,
    var name:String,
    var neighborhood :String,
    var photograph :String,
    var address :String,
    var latlng: Latlng,
    var cuisine_type: String,
    var operatingHours: OperatingHours,
    var review: MutableList<Review>
    )

//data class Restaurant1 (
//    val id :Int ,
//    val name:String,
//    val photograph :String,
//    val cuisine_type: String,
//)

//fun List<RestaurantDatabase>.asDomainModel(): List<Restaurant> {
//    return map {
//        Restaurant(
//            id = it.id,
//            name = it.name,
//            photograph = it.photograph,
//            cuisine_type = it.cuisine_type
//        )
//    }
//}
