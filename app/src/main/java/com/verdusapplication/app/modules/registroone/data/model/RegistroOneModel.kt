package com.verdusapplication.app.modules.registroone.`data`.model

import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegistroOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecuperarcontr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recuperar_contr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThirtyNine: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recuperar_contr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null
)
