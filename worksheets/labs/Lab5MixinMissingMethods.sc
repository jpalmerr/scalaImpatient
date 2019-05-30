import java.awt._
import java.awt.geom.Ellipse2D

val r = new Rectangle(5, 10, 20, 30)
r.translate(10, 20)
r

import java.awt.geom

trait RectangleLike {
  def setFrame(x: Double, y: Double, w: Double, h: Double)
  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double
  def translate(dx: Double, dy: Double) { setFrame(getX + dx, getY + dy, getWidth, getHeight)}
  override def toString = f"(${getX}, ${getY})" // as ellipse toString rubbish
}

// eclipse library didn't include translate so add our own using trait
val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike

egg.translate(10, 20)
egg