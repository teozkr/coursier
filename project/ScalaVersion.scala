
object ScalaVersion {

  def scala213 = "2.13.0-M3"
  def scala212 = "2.12.5"
  def scala211 = "2.11.12"
  def scala210 = "2.10.7"

  val versions = Seq(scala213, scala212, scala211, scala210)

  val map = versions
    .map { v =>
      v.split('.').take(2).mkString(".") -> v
    }
    .toMap

}
