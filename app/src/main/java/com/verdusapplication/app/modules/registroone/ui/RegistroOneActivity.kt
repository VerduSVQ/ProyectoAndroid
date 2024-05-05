package com.verdusapplication.app.modules.registroone.ui

import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityRegistroOneBinding
import com.verdusapplication.app.modules.registroone.`data`.viewmodel.RegistroOneVM
import kotlin.String
import kotlin.Unit

class RegistroOneActivity : BaseActivity<ActivityRegistroOneBinding>(R.layout.activity_registro_one)
    {
  private val viewModel: RegistroOneVM by viewModels<RegistroOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registroOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REGISTRO_ONE_ACTIVITY"

  }
}
