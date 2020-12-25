resolvers += Resolver.url("Triplequote Plugins Releases",
  url("https://repo.triplequote.com/artifactory/sbt-plugins-staging/"))(Resolver.ivyStylePatterns)
addSbtPlugin("com.triplequote" % "sbt-hydra" % "2.3.0-a07")
