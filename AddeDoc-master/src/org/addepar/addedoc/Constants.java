package org.addepar.addedoc;

public class Constants {
        
    public static final String HEADER_OPEN = "<html><head>" +
        "<script type='text/javascript' src='jquery-1.11.1.js'></script>" +
        "<script type='text/javascript' src='CollapsibleList.js'></script>" +                                                                
        "<script type='text/javascript' src='AddeDoc.js'></script>" +                                                                
        "<link rel='stylesheet' type='text/css' href='AddeDoc.css' /> " + 
        "</head>" +
        "<body>";
    
    public static final String HEADER_CLOSE =                                                                               
        "</td>" +
        "</tr>" +
        "</table>" +
        "</div>";
    
    public static final String FOOTER = "</div></div></td></tr></table><hr/>" + 
        "<center style='font-size:.8em;'><a href='https://github.com/addewinn/addedoc' target='_blank'>Powered By AddeDoc</a>" + 
        "</center></body></html>";
    
    public static final String ROOT_DIRECTORY = "ApexDocumentation";
    public static final String DEFAULT_HOME_CONTENTS = "<h1>AddeForce</h2>";
    public static final String PROJECT_DETAIL = 
        "<div class='topsection'>" +
        "<table>" +
        "<tr><td>" +
        "<img src='Addepar-Logo-Stacked-Grn.png'/>" +
        "</td>" +
        "<td>" +                
        "<h2 style='margin:0px;'>AddeForce</h2>" +
        "Check out the gitHub project at:<br/>" + 
        "<a href='https://github.com/addewinn/addedoc'>https://github.com/addewinn/addedoc</a><br/>";

    public static String getHeader(String projectDetail) {
        String header;
        if (projectDetail != null && projectDetail.trim().length() > 0) {
            header = Constants.HEADER_OPEN + projectDetail;
        } else {
            header = Constants.HEADER_OPEN + Constants.PROJECT_DETAIL + Constants.HEADER_CLOSE;
        }
        return header;
    }
                
}