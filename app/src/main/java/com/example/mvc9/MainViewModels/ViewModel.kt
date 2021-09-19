package com.example.mvc9.MainViewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvc9.Model.UserDataItem
import com.example.mvc9.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import javax.inject.Inject

@HiltViewModel
class ViewModel
@Inject
 constructor (private val repository: Repository):ViewModel(){
    private val myUsers: MutableLiveData<List<UserDataItem>> = MutableLiveData()
    val _myUsers : LiveData<List<UserDataItem>>
    get() = myUsers

    init {
        getUser()
    }

    //makes the network call request and add the data received to the livedata and gives an error messaage in of any obstruction
    private fun getUser() = viewModelScope.launch {
        repository.getUsers().let{response ->
            if(response.isSuccessful){
                myUsers.postValue(response.body())
            }else{
                Log.d("TAG", "Error has occured: ${response.errorBody()}")
            }
        }
    }

}