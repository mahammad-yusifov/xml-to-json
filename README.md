A converter, that creates one json document out of xml files.

Based on the 594608-coah.json file (I took this file as an example of json result that I need to create), looking at field names etc., I created my POJOS(Plain Old Java Objects) for later parsing them into one JSON file. And I used libraries such as Jaxb, Jakarta, Jackson.

HotelDto class (represting a hotel) holds coah.xml and giata.xml files.
In the json file, "hotel" is coah.xml while "data" is giata.xml of the one hotel.

And the result json is List of HotelDto objects meaning list of hotels. It is in the /asset/json folder with the name "jsonResult.json".
