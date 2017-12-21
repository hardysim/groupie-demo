package de.hardysim.groupie_demo

import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_card.*

open class CardItem (val text: CharSequence? = "") : Item() {

    override fun getLayout() = R.layout.item_card

    override fun bind(viewHolder: ViewHolder, position: Int) {
        //viewBinding.getRoot().setBackgroundColor(colorRes);
        viewHolder.text.text = text
    }
}
