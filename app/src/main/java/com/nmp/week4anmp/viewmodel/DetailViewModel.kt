package com.nmp.week4anmp.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nmp.week4anmp.model.Student

class DetailViewModel(application: Application): AndroidViewModel(application) {
    val studentLD = MutableLiveData<Student>()
//    private val TAG = "volleyTag"
//    private var queue: RequestQueue?=null
    fun fetch() {
//        queue = Volley.newRequestQueue(getApplication())
//        val url = "http://adv.jitusolution.com/student.php"


        //replace this code with gson volley
        val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
        studentLD.value = student1


//        val stringRequest = StringRequest(
//            Request.Method.GET, url,
//            {
//
//                val sType = object : TypeToken<List<Student>>() { }.type
//                val result = Gson().fromJson<List<Student>>(it, sType)
//
//
//                Log.d("showvoley", result.toString())
//
//
//                Log.d("showvoley", it)
//            },
//            {
//                Log.d("showvoley", it.toString())
//            })
//        stringRequest.tag = TAG
//        queue?.add(stringRequest)
    }
//    override fun onCleared() {
//        super.onCleared()
//        queue?.cancelAll(TAG)
//    }
}