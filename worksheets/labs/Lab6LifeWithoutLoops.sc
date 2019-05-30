// in scala prefer to use higher-order functions
// rather than loops

val zones = java.util.TimeZone.getAvailableIDs // dataset

zones.map( s => s.split("/")).filter(_.length > 1).map(a => a(1)).grouped(10).toArray.map(a => a(0))

// obviously not best practise but shows how much can
// be done without writing loops
