using System;
using System.Collections.Generic;
using System.Linq;

using MonoTouch.Foundation;
using MonoTouch.UIKit;
using com.badlogic.gdx;
using com.badlogic.gdx.math;
using com.badlogic.gdx.graphics;
using com.badlogic.gdx.graphics.g2d;
using com.badlogic.gdx.graphics.glutils;
using java.io;
using java.nio;
using System.IO;
using com.badlogic.gdx.backends.ios;

namespace mono
{
	public class TestListener: com.badlogic.gdx.ApplicationListener {
		public void create () {
		}
	
		public void render () {
		}
		
		public void dispose () {
		}
		
		public void resume() {
		}
		
		public void pause() {
		}
		
		public void resize(int width, int height) {
		}
	}
	
	
	public class Application
	{
		[Register ("AppDelegate")]
		public class IOSStarter : IOSApplication {
			public IOSStarter() : base(new TestListener()) {
			}
		}
		
		static void Main (string[] args)
		{
			UIApplication.Main (args, null, "AppDelegate");
		}
	}
}