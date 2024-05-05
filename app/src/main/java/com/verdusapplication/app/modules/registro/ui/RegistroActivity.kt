package com.verdusapplication.app.modules.registro.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityRegistroBinding
import com.verdusapplication.app.modules.registro.`data`.viewmodel.RegistroVM
import kotlin.String
import kotlin.Unit

class RegistroActivity : BaseActivity<ActivityRegistroBinding>(R.layout.activity_registro) {
  private val viewModel: RegistroVM by viewModels<RegistroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registroVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTRO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegistroActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
