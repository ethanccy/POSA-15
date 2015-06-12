/**
 * 
 */
package com.nmesisca.weatherapp.tasks;

import java.lang.ref.WeakReference;

import android.app.Activity;




/**
 * @author nmesisca
 * 
 * This is an interface for other classes to implement in order to be
 * added to the RetainedFragmentManager for execution.
 */
public interface RetainedTask
{

    /**
     * Called after a runtime configuration change occurs to finish
     * the initialization steps.
     */
    public void onConfigurationChange(WeakReference<Activity> activity);
}
