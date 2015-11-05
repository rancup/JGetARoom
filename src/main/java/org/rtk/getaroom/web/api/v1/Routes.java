package org.rtk.getaroom.web.api.v1;

import java.util.HashMap;

/**
 * Created by ransom on 10/17/15.
 */
public class Routes {

    private static HashMap<String, String> routes;

    public static final String basepath = "";
    public static final String apiv1 = basepath + "/api/v1/";

    public static final String building = apiv1 + "building";
    public static final String buildingSingle = apiv1 + "building/{code}";
    private static void setRoutes()
    {
        if(routes == null)
        {
            routes = new HashMap<String, String>();

            routes.put("basepath", basepath);
            routes.put("api.v1.building", building);
            routes.put("api.v1.buildingSingle", buildingSingle);
        }
    }

    public static HashMap<String, String> getRoutes()
    {
        setRoutes();

        return routes;
    }

    public static String getRoute(String destin)
    {
        setRoutes();

        return routes.get(destin);
    }

}