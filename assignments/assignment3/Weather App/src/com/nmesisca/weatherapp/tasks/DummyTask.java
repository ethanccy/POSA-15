/**
 * 
 */
package com.nmesisca.weatherapp.tasks;

import java.lang.ref.WeakReference;

import android.app.Activity;

/**
 * @author nmesisca
 *
 */
public class DummyTask implements RetainedTask
{

	/* (non-Javadoc)
	 * @see com.example.weatherserviceapp.tasks.RetainedTask#onConfigurationChange(java.lang.ref.WeakReference)
	 */
	@Override
	public void onConfigurationChange(WeakReference<Activity> activity)
	{
		System.out.println("----- DummyTask, Activity="+activity.get().toString() + " -----");

	}

}
