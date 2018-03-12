
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("serial")
public class Chomusuke extends Canvas {
	private int minutes = 0;
	private int hours = 0;

	@Override
	public void paint(Graphics g) {
		// add(textField1, java.awt.BorderLayout.NORTH);

		BufferedImage ferrari = null;
		BufferedImage mclaren = null;
		BufferedImage renault = null;
		BufferedImage redbull = null;
		BufferedImage williams = null;
		BufferedImage alfa = null;
		BufferedImage torro = null;
		BufferedImage haas = null;
		BufferedImage forceIndia = null;
		BufferedImage mercedes = null;
		BufferedImage honda = null;
		BufferedImage astonMartin = null;
		try {
			ferrari = ImageIO.read(new File("src/ferrari.jpg"));
			mclaren = ImageIO.read(new File("src/mclaren.jpg"));
			renault = ImageIO.read(new File("src/renault.jpg"));
			redbull = ImageIO.read(new File("src/redbull.jpg"));
			williams = ImageIO.read(new File("src/williams.jpg"));
			alfa = ImageIO.read(new File("src/alfaromeo.jpg"));
			torro = ImageIO.read(new File("src/toro.jpg"));
			haas = ImageIO.read(new File("src/haas.jpg"));
			forceIndia = ImageIO.read(new File("src/forceindia.jpg"));
			mercedes = ImageIO.read(new File("src/mercedes.jpg"));
			honda = ImageIO.read(new File("src/honda.jpg"));
			astonMartin = ImageIO.read(new File("src/astonmartin.jpg"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		Graphics2D g2d = (Graphics2D) g;
		int x = 10;
		int y = 50;

		GeneralPath body = new GeneralPath();
		body.moveTo(179 + x, 235 + y);
		body.curveTo(182 + x, 214 + y, 192 + x, 192 + y, 203 + x, 179 + y);
		body.curveTo(212 + x, 187 + y, 218 + x, 197 + y, 222 + x, 211 + y);
		body.curveTo(235 + x, 204 + y, 245 + x, 201 + y, 262 + x, 199 + y);
		// tail
		body.lineTo(262 + x, 184 + y);
		body.curveTo(260 + x, 160 + y, 256 + x, 144 + y, 247 + x, 123 + y);
		body.curveTo(216 + x, 46 + y, 217 + x, 41 + y, 217 + x, 13 + y);
		body.curveTo(218 + x, 3 + y, 220 + x, 1 + y, 225 + x, 0 + y);
		body.curveTo(244 + x, 3 + y, 282 + x, 84 + y, 285 + x, 195 + y);
		// tail end
		body.curveTo(302 + x, 191 + y, 349 + x, 191 + y, 358 + x, 193 + y);
		body.curveTo(359 + x, 179 + y, 362 + x, 170 + y, 367 + x, 163 + y);
		body.curveTo(386 + x, 183 + y, 397 + x, 200 + y, 408 + x, 237 + y);
		body.lineTo(408 + x, 305 + y);
		body.lineTo(179 + x, 305 + y);
		body.lineTo(179 + x, 235 + y);

		GeneralPath wings = new GeneralPath();
		// left wing
		wings.moveTo(192 + x, 228 + y);
		wings.curveTo(140 + x, 253 + y, 43 + x, 329 + y, 0 + x, 383 + y);
		wings.curveTo(28 + x, 371 + y, 52 + x, 362 + y, 83 + x, 356 + y);
		wings.curveTo(80 + x, 374 + y, 80 + x, 390 + y, 82 + x, 399 + y);
		wings.lineTo(95 + x, 389 + y);
		wings.lineTo(229 + x, 306 + y);
		wings.curveTo(241 + x, 303 + y, 245 + x, 302 + y, 257 + x, 301 + y);
		wings.curveTo(232 + x, 266 + y, 213 + x, 242 + y, 192 + x, 228 + y);
		// right wing
		wings.moveTo(383 + x, 221 + y);
		wings.curveTo(413 + x, 236 + y, 497 + x, 307 + y, 553 + x, 372 + y);
		wings.curveTo(525 + x, 360 + y, 509 + x, 355 + y, 483 + x, 350 + y);
		wings.curveTo(489 + x, 362 + y, 491 + x, 370 + y, 491 + x, 381 + y);
		wings.curveTo(482 + x, 375 + y, 477 + x, 372 + y, 469 + x, 370 + y);
		wings.lineTo(316 + x, 302 + y);
		wings.curveTo(310 + x, 301 + y, 304 + x, 300 + y, 293 + x, 299 + y);
		wings.curveTo(314 + x, 270 + y, 356 + x, 234 + y, 383 + x, 221 + y);

		GeneralPath face = new GeneralPath();
		face.moveTo(102 + x, 437 + y);
		face.curveTo(92 + x, 384 + y, 99 + x, 271 + y, 106 + x, 265 + y);
		face.curveTo(122 + x, 263 + y, 195 + x, 286 + y, 229 + x, 306 + y);
		face.curveTo(241 + x, 303 + y, 245 + x, 302 + y, 257 + x, 301 + y);
		face.lineTo(293 + x, 299 + y);
		face.curveTo(304 + x, 300 + y, 310 + x, 301 + y, 316 + x, 302 + y);
		// left ear
		face.curveTo(372 + x, 273 + y, 452 + x, 260 + y, 467 + x, 269 + y);
		face.curveTo(478 + x, 278 + y, 473 + x, 366 + y, 454 + x, 438 + y);
		face.curveTo(459 + x, 468 + y, 456 + x, 497 + y, 436 + x, 531 + y);
		face.curveTo(443 + x, 550 + y, 445 + x, 573 + y, 440 + x, 586 + y);
		face.curveTo(431 + x, 591 + y, 408 + x, 589 + y, 374 + x, 575 + y);
		face.curveTo(310 + x, 593 + y, 283 + x, 596 + y, 245 + x, 597 + y);
		face.curveTo(219 + x, 597 + y, 196 + x, 595 + y, 174 + x, 583 + y);
		face.curveTo(148 + x, 594 + y, 111 + x, 600 + y, 109 + x, 598 + y);
		face.curveTo(106 + x, 590 + y, 109 + x, 566 + y, 125 + x, 547 + y);
		face.curveTo(98 + x, 503 + y, 96 + x, 462 + y, 102 + x, 437 + y);

		GeneralPath cross = new GeneralPath();
		cross.moveTo(228 + x, 389 + y);
		cross.lineTo(251 + x, 386 + y);
		cross.lineTo(248 + x, 359 + y);
		cross.quadTo(248 + x, 356 + y, 251 + x, 356 + y);
		cross.lineTo(254 + x, 356 + y);
		cross.quadTo(256 + x, 356 + y, 256 + x, 358 + y);
		cross.lineTo(259 + x, 384 + y);
		cross.lineTo(291 + x, 381 + y);
		cross.quadTo(293 + x, 381 + y, 293 + x, 384 + y);
		cross.lineTo(293 + x, 386 + y);
		cross.quadTo(293 + x, 389 + y, 290 + x, 389 + y);
		cross.lineTo(261 + x, 392 + y);
		cross.lineTo(267 + x, 451 + y);
		cross.quadTo(267 + x, 452 + y, 266 + x, 452 + y);
		cross.lineTo(261 + x, 452 + y);
		cross.quadTo(260 + x, 452 + y, 260 + x, 450 + y);
		cross.lineTo(253 + x, 393 + y);
		cross.lineTo(222 + x, 397 + y);
		cross.quadTo(220 + x, 397 + y, 220 + x, 395 + y);
		cross.lineTo(220 + x, 391 + y);
		cross.quadTo(220 + x, 389 + y, 228 + x, 389 + y);

		GeneralPath eyes = new GeneralPath();
		// left eye
		eyes.moveTo(169 + x, 505 + y);
		eyes.curveTo(169 + x, 495 + y, 177 + x, 486 + y, 185 + x, 486 + y);
		eyes.curveTo(201 + x, 486 + y, 205 + x, 501 + y, 205 + x, 510 + y);
		eyes.curveTo(203 + x, 523 + y, 202 + x, 526 + y, 189 + x, 529 + y);
		eyes.curveTo(179 + x, 529 + y, 169 + x, 518 + y, 169 + x, 505 + y);
		// right eye
		eyes.moveTo(342 + x, 487 + y);
		eyes.curveTo(342 + x, 478 + y, 349 + x, 467 + y, 359 + x, 467 + y);
		eyes.curveTo(370 + x, 467 + y, 378 + x, 479 + y, 378 + x, 490 + y);
		eyes.curveTo(378 + x, 501 + y, 372 + x, 511 + y, 361 + x, 511 + y);
		eyes.curveTo(350 + x, 511 + y, 342 + x, 502 + y, 342 + x, 487 + y);

		// mouth
		GeneralPath mouth = new GeneralPath();
		mouth.moveTo(211 + x, 540 + y);
		mouth.quadTo(280 + x, 522 + y, 346 + x, 526 + y);
		mouth.curveTo(332 + x, 571 + y, 309 + x, 577 + y, 270 + x, 577 + y);
		mouth.curveTo(230 + x, 571 + y, 218 + x, 558 + y, 211 + x, 540 + y);
		GeneralPath teeth = new GeneralPath();
		teeth.moveTo(224 + x, 558 + y);
		teeth.lineTo(237 + x, 540 + y);
		teeth.lineTo(263 + x, 565 + y);
		teeth.lineTo(280 + x, 533 + y);
		teeth.lineTo(306 + x, 559 + y);
		teeth.lineTo(321 + x, 531 + y);
		teeth.lineTo(337 + x, 544 + y);

		// Shades
		GeneralPath whiteS = new GeneralPath();
		// right foot
		whiteS.moveTo(185 + x, 231 + y);
		whiteS.curveTo(193 + x, 214 + y, 202 + x, 201 + y, 212 + x, 191 + y);
		whiteS.lineTo(212 + x, 150 + y);
		whiteS.lineTo(179 + x, 150 + y);
		whiteS.lineTo(179 + x, 235 + y);
		whiteS.lineTo(185 + x, 235 + y);
		whiteS.lineTo(185 + x, 231 + y);
		// right ear
		whiteS.moveTo(99 + x, 415 + y);
		whiteS.curveTo(99 + x, 342 + y, 108 + x, 289 + y, 115 + x, 279 + y);
		whiteS.curveTo(121 + x, 275 + y, 168 + x, 281 + y, 213 + x, 298 + y);
		whiteS.lineTo(213 + x, 250 + y);
		whiteS.lineTo(50 + x, 250 + y);
		whiteS.lineTo(99 + x, 415 + y);
		// left Ear
		whiteS.moveTo(316 + x, 302 + y);
		whiteS.curveTo(324 + x, 303 + y, 327 + x, 304 + y, 332 + x, 306 + y);
		whiteS.curveTo(390 + x, 279 + y, 392 + x, 274 + y, 427 + x, 264 + y);
		whiteS.lineTo(318 + x, 270 + y);
		whiteS.lineTo(316 + x, 302 + y);
		// right face
		whiteS.moveTo(184 + x, 324 + y);
		whiteS.curveTo(141 + x, 352 + y, 109 + x, 400 + y, 102 + x, 437 + y);
		whiteS.lineTo(91 + x, 437 + y);
		whiteS.lineTo(91 + x, 601 + y);
		whiteS.lineTo(129 + x, 601 + y);
		whiteS.lineTo(129 + x, 597 + y);
		whiteS.curveTo(122 + x, 588 + y, 121 + x, 573 + y, 131 + x, 554 + y);
		whiteS.lineTo(137 + x, 559 + y);
		whiteS.curveTo(110 + x, 514 + y, 109 + x, 387 + y, 184 + x, 324 + y);

		GeneralPath blackS = new GeneralPath();
		blackS.moveTo(408 + x, 237 + y);
		blackS.lineTo(388 + x, 237 + y);
		blackS.lineTo(388 + x, 223 + y);
		blackS.curveTo(389 + x, 214 + y, 388 + x, 195 + y, 384 + x, 184 + y);
		blackS.lineTo(408 + x, 184 + y);
		blackS.lineTo(408 + x, 237 + y);

		blackS.moveTo(461 + x, 266 + y);
		blackS.curveTo(459 + x, 292 + y, 449 + x, 323 + y, 423 + x, 366 + y);
		blackS.curveTo(411 + x, 351 + y, 399 + x, 340 + y, 379 + x, 326 + y);
		blackS.curveTo(427 + x, 393 + y, 398 + x, 552 + y, 329 + x, 586 + y);
		blackS.lineTo(374 + x, 586 + y);
		blackS.lineTo(374 + x, 575 + y);
		blackS.curveTo(389 + x, 570 + y, 401 + x, 565 + y, 411 + x, 557 + y);
		blackS.curveTo(419 + x, 567 + y, 426 + x, 575 + y, 441 + x, 585 + y);
		blackS.lineTo(475 + x, 585 + y);
		blackS.lineTo(475 + x, 250 + y);
		blackS.lineTo(461 + x, 250 + y);
		blackS.lineTo(461 + x, 266 + y);

		Area bdy = new Area(body);
		Area bdy2 = new Area(body);
		Area whiteBdy = new Area(whiteS);
		Area blackBod = new Area(blackS);
		Area fce = new Area(face);
		Area fce2 = new Area(face);
		bdy.intersect(whiteBdy);
		bdy2.intersect(blackBod);
		fce.intersect(whiteBdy);
		fce2.intersect(blackBod);

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		Color skin = new Color(107, 91, 93);
		Color whiteShade = new Color(202, 198, 194);
		Color blackShade = new Color(72, 58, 61);
		g2d.setColor(skin);
		g2d.fill(body);
		g2d.setColor(whiteShade);
		g2d.fill(bdy);
		g2d.setColor(blackShade);
		g2d.fill(bdy2);
		g2d.setColor(new Color(76, 36, 31));
		g2d.fill(wings);
		g2d.setColor(skin);
		g2d.fill(face);
		g2d.setColor(whiteShade);
		g2d.fill(fce);
		g2d.setColor(blackShade);
		g2d.fill(fce2);
		g2d.setColor(new Color(244, 42, 36));
		g2d.fill(cross);
		g2d.setColor(new Color(246, 195, 82));
		g2d.fill(eyes);
		g2d.setColor(Color.white);
		g2d.fill(mouth);
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(new Color(158, 158, 158));
		g2d.draw(teeth);

		Ellipse2D.Double clock = new Ellipse2D.Double(135 + x, 312 + y, 280, 280);
		g2d.setColor(Color.white);
		g2d.fill(clock);
		GeneralPath minute = new GeneralPath();
		minute.moveTo(275 + x, 452 + y);
		minute.lineTo(280 + x, 347 + y);
		minute.lineTo(275 + x, 312 + y);
		minute.lineTo(270 + x, 347 + y);
		minute.closePath();
		GeneralPath hour = new GeneralPath();
		hour.moveTo(275 + x, 452 + y);
		hour.lineTo(285 + x, 373 + y);
		hour.lineTo(275 + x, 347 + y);
		hour.lineTo(265 + x, 373 + y);
		hour.closePath();

		g2d.drawImage(ferrari, 250 + x, 315 + y, 50, 50, null);// 12
		g2d.drawImage(mclaren, 360 + x, 427 + y, 50, 50, null);// 3
		g2d.drawImage(renault, 250 + x, 539 + y, 50, 50, null);// 6
		g2d.drawImage(redbull, 140 + x, 427 + y, 50, 50, null);// 9
		g2d.drawImage(williams, 302 + x, 335 + y, 50, 50, null);// 1
		g2d.drawImage(alfa, 340 + x, 375 + y, 50, 50, null);// 2
		g2d.drawImage(honda, 302 + x, 519 + y, 50, 50, null);// 5
		g2d.drawImage(torro, 343 + x, 478 + y, 50, 50, null);// 4
		g2d.drawImage(haas, 198 + x, 335 + y, 50, 50, null);// 11
		g2d.drawImage(forceIndia, 158 + x, 375 + y, 50, 50, null);// 10
		g2d.drawImage(mercedes, 158 + x, 480 + y, 50, 50, null);// 8
		g2d.drawImage(astonMartin, 198 + x, 519 + y, 50, 50, null);// 5
		
		
		AffineTransform rot2 = new AffineTransform();
		rot2.setToRotation(Math.PI * minutes / 30, 275 + x, 452 + y);
		AffineTransform rot1 = new AffineTransform();
		rot1.setToRotation(Math.PI * hours / 6, 275 + x, 452 + y);
		
		g2d.setColor(Color.red);
		g2d.fill(rot1.createTransformedShape(hour));
		g2d.setColor(Color.black);
		g2d.fill(rot2.createTransformedShape(minute));
		
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
