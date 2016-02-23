import sbt._

object Version {
  val scalariform = "0.2.0"
}

object Library {
  val scalariform = "org.scalariform" %% "scalariform" % Version.scalariform
}

object Dependencies {

  import Library._

  val sbtScalariform = List(
    scalariform
  )
}
