package com.verdusapplication.app.modules.pantallaprinciplmenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.verdusapplication.app.R
import com.verdusapplication.app.appcomponents.base.BaseActivity
import com.verdusapplication.app.databinding.ActivityPantallaPrincipLMenuBinding
import com.verdusapplication.app.modules.pantallaprinciplcompraone.ui.PantallaPrincipLCompraOneActivity
import com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.model.ListrectangletenRowModel
import com.verdusapplication.app.modules.pantallaprinciplmenu.`data`.viewmodel.PantallaPrincipLMenuVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PantallaPrincipLMenuActivity :
    BaseActivity<ActivityPantallaPrincipLMenuBinding>(R.layout.activity_pantalla_princip_l_menu) {
  private val viewModel: PantallaPrincipLMenuVM by viewModels<PantallaPrincipLMenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangletenAdapter =
    ListrectangletenAdapter(viewModel.listrectangletenList.value?:mutableListOf())
    binding.recyclerListrectangleten.adapter = listrectangletenAdapter
    listrectangletenAdapter.setOnItemClickListener(
    object : ListrectangletenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectangletenRowModel) {
        onClickRecyclerListrectangleten(view, position, item)
      }
    }
    )
    viewModel.listrectangletenList.observe(this) {
      listrectangletenAdapter.updateData(it)
    }
    binding.pantallaPrincipLMenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangleten(
    view: View,
    position: Int,
    item: ListrectangletenRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangleten -> {
        val destIntent = PantallaPrincipLCompraOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PANTALLA_PRINCIP_L_MENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PantallaPrincipLMenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
