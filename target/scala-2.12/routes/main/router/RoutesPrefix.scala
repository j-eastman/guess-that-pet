// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JackEastman/Documents/GuessThatPet/GuessThatPetWorkspace/guessthatpet/conf/routes
// @DATE:Fri Jan 04 16:01:42 CST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
