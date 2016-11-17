import static spark.Spark.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class Beagle {
    public static void main(String[] args) {
    	staticFileLocation("/public");
    	String path = Test.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    	
        get("/hello", (req, res) -> 
        "<!DOCTYPE html>" +
        "<meta charset=\"utf-8\">" +
        "<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/fornac.css\" media=\"screen\" />"+
        "This is an RNA container."+
        "<div id='rna_ss'> </div>" +
        "This is after the RNA container."+
        "<script type='text/javascript' src='/js/jquery.js'></script>"+
        "<script type='text/javascript' src='/js/d3.js'></script>"+
        "<script type='text/javascript' src='/js/fornac.js'></script>"+
        "<script type='text/javascript'>"+
        	"var container = new FornaContainer(\"#rna_ss\", {'applyForce': true});"+
        	"var options = {'structure': '((..((....)).(((....))).))',"+
            "           'sequence':             'CGCUUCAUAUAAUCCUAAUGACCUAU'};"+
        	"container.addRNA(options.structure, options);"+
        "</script>"
       );
    }
}