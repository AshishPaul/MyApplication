package jp.wasabeef.util.ext

import android.support.annotation.IdRes
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity

/**
 * Created by Wasabeef on 2017/10/20.
 */
@Suppress("UNCHECKED_CAST")
fun <T> FragmentActivity.findFragmentById(@IdRes id: Int): T = supportFragmentManager.findFragmentById(id) as T

inline fun FragmentActivity.setFragment(containerViewId: Int, f: () -> Fragment): Fragment? {
    val manager = supportFragmentManager
    val fragment = manager?.findFragmentById(containerViewId)
    fragment?.let { return it }
    return f().apply { manager?.beginTransaction()?.add(containerViewId, this)?.commit() }
}

inline fun FragmentActivity.addOrReplaceFragment(containerViewId: Int, f: () -> Fragment): Fragment? {
    val manager = supportFragmentManager
    val fragment = manager?.findFragmentByTag(f().tag)
    fragment?.let { return it }
    return f().apply { manager?.beginTransaction()?.replace(containerViewId, this, this.tag)?.addToBackStack(this.tag)?.commit() }
}
