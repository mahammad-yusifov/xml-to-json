package com.freshcells.xmljsonconverter.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.freshcells.xmljsonconverter.model.Content;
import com.freshcells.xmljsonconverter.model.HotelDto;
import com.freshcells.xmljsonconverter.model.giata.Result;
import com.freshcells.xmljsonconverter.util.JsonParser;
import jakarta.xml.bind.JAXBContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConverterService {

    private final String FIRST_COAH = "asset/xml/3956-coah.xml";
    private final String FIRST_GIATA = "asset/xml/3956-giata.xml";
    private final String SECOND_COAH = "asset/xml/162838-coah.xml";
    private final String SECOND_GIATA = "asset/xml/162838-giata.xml";
    private final String THIRD_GIATA = "asset/xml/411144-giata.xml";

    private static final String JSON_FOLDER_PATH = "asset/json";

    private static final String JSON_FILE_NAME = "jsonResult.json";


    public void convertXmlFiles() {
        try {

            log.info("Started reading xml files");
            Content firstCoah = readCoahXml(FIRST_COAH);
            Result firstGiata = readGiataXml(FIRST_GIATA);
            HotelDto firstHotel = new HotelDto(firstCoah.getHotel(), firstGiata.getData());

            Content secondCoah = readCoahXml(SECOND_COAH);
            Result secondGiata = readGiataXml(SECOND_GIATA);
            HotelDto secondHotel = new HotelDto(secondCoah.getHotel(), secondGiata.getData());

            Result thirdGiata = readGiataXml(THIRD_GIATA);
            HotelDto thirdHotel = new HotelDto(null, thirdGiata.getData());
            log.info("Finished reading xml files. Parsing to Json");

            List<HotelDto> jsonResult = Arrays.asList(firstHotel, secondHotel, thirdHotel);

            saveJsonToFile(jsonResult);
            log.info("Done. Json file saved at : " + JSON_FOLDER_PATH + JSON_FILE_NAME);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Content readCoahXml(String filePath) {
        Content content = new Content();
        try {
            JAXBContext context = JAXBContext.newInstance(Content.class);
            content = (Content) context.createUnmarshaller().unmarshal(new FileReader(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content;
    }

    public Result readGiataXml(String filePath) {
        Result result = new Result();
        try {
            JAXBContext context = JAXBContext.newInstance(Result.class);
            result = (Result) context.createUnmarshaller().unmarshal(new FileReader(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private void saveJsonToFile(List<HotelDto> contents) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

            String jsonContent = JsonParser.toJson(contents);

            // Create the directory if it doesn't exist
            File jsonFolder = new File(JSON_FOLDER_PATH);
            if (!jsonFolder.exists()) {
                jsonFolder.mkdirs();
            }

            // Create the file path
            String filePath = JSON_FOLDER_PATH + File.separator + JSON_FILE_NAME;

            // Write the JSON content to the file
            objectMapper.writeValue(new File(filePath), contents);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
