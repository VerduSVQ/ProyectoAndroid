package com.verdusapplication.app.modules.registroone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.verdusapplication.app.modules.registroone.`data`.model.RegistroOneModel
import org.koin.core.KoinComponent

class RegistroOneVM : ViewModel(), KoinComponent {
  val registroOneModel: MutableLiveData<RegistroOneModel> = MutableLiveData(RegistroOneModel())

  var navArguments: Bundle? = null
}
