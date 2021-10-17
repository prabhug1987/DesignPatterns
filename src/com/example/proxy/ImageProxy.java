package com.example.proxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {

	ImageIcon imageIcon;
	URL imageURL;
	Thread retrivalThread;
	boolean retriving = false;

	public ImageProxy(URL imageUrl) {
		this.imageURL = imageUrl;

	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub

		if (imageIcon != null) {
			return imageIcon.getIconHeight();
		}

		return 800;
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if (imageIcon != null) {
			return imageIcon.getIconWidth();
		}

		return 600;
	}

	@Override
	public void paintIcon(Component component, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if (imageIcon != null) {
			imageIcon.paintIcon(component, g, x, y);
		} else {
			g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
			if (!retriving) {
				retriving = true;
				retrivalThread = new Thread(new Runnable() {

					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							imageIcon = new ImageIcon(imageURL, "CD Cover");
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				});

				retrivalThread.start();
			}
		}
	}

}
