/**
 *  This file is part of Libgdx by Mario Zechner (badlogicgames@gmail.com)
 *
 *  Libgdx is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Libgdx is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Foobar.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.badlogic.gdx;

/**
 * A RenderListener can be hooked to a {@link Application}
 * and will receive setup, render and dispose events. In case
 * of a setup event the listener can create any resources it
 * needs later on to draw. The render method
 * is called whenever the {@link Application} is redrawn. The 
 * dispose method is called before the Application is closed 
 * or the RenderListener is unregistered from the application.
 * 
 * The methods will be invoked in the rendering thread of the
 * application and not in the UI thread!
 * 
 * 
 * @author mzechner@know-center.at
 *
 */
public interface RenderListener 
{
	/** 
	 * The setup method is called once upon initialization of
	 * the {@link Application}
	 * 
	 * @param panel The application
	 */
	public void setup( Application application );	
	
	/**
	 * The render method is called every time a new frame 
	 * should be rendered.  
	 *
	 * @param application The application
	 */
	public void render( Application application );
	
	/**
	 * The dispose method is called when the application is closing
	 * or the {@link RenderListener} has been unregistered form the
	 * application.
	 * 
	 * @param application The application
	 */	
	public void dispose( Application application );
}
