package com.example.traziusbiz.signs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.traziusbiz.signs.adapters.TabsAdapter
import com.example.traziusbiz.signs.fragments.DaysFragment
import com.example.traziusbiz.signs.fragments.MonthsFragment
import com.example.traziusbiz.signs.fragments.SignsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var tabsAdapter: TabsAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViewPager()
    }

    private fun initViewPager() {
        tabsAdapter = TabsAdapter(supportFragmentManager);
        tabsAdapter?.addFragment(MonthsFragment(), resources.getString(R.string.months))
        tabsAdapter?.addFragment(DaysFragment(), resources.getString(R.string.days))
        tabsAdapter?.addFragment(SignsFragment(), resources.getString(R.string.signs))

        view_pager.adapter = tabsAdapter
        tabs.setupWithViewPager(view_pager)
    }
}
