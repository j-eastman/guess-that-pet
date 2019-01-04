// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/JackEastman/Documents/GuessThatPet/GuessThatPetWorkspace/guessthatpet/conf/routes
// @DATE:Thu Jan 03 17:03:40 CST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseFirstController FirstController = new controllers.ReverseFirstController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseFirstController FirstController = new controllers.javascript.ReverseFirstController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
