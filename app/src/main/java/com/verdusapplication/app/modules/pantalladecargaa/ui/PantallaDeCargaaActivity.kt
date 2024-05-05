package com.verdusapplication.app.modules.pantalladecargaa.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaDeCargaaBinding
import com.verdusapplication.app.modules.pantalladecargaa.`data`.viewmodel.PantallaDeCargaaVM
import kotlin.String
import kotlin.Unit

class
PantallaDeCargaaActivity :
    BaseActivity<ActivityPantallaDeCargaaBinding>(R.layout.activity_pantalla_de_cargaa) {
  private val viewModel: PantallaDeCargaaVM by viewModels<PantallaDeCargaaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pantallaDeCargaaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PANTALLA_DE_CARGAA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PantallaDeCargaaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
