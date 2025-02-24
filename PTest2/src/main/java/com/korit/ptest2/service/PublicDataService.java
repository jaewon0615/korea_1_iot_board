package com.korit.ptest2.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.korit.ptest2.entity.PublicData;
import com.korit.ptest2.repository.PublicDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicDataService {

    @Autowired
    private PublicDataRepository publicDataRepository;

    public PublicData fetchAndSaveData() {
        try {
            // API 호출
            RestTemplate restTemplate = new RestTemplate();
            String apiUrl = "https://apis.data.go.kr/1471000/DrbEasyDrugInfoService/getDrbEasyDrugList?serviceKey=jptKXkEhoWS2pwVQ34adwBGaLMbSQxl8jipaqrcP3oFbUD%2BVSG73q0mvxhSxJ46NK3v%2BsGLTPy0bH0oTQmuSdQ%3D%3D&pageNo=1&numOfRows=10&type=json";
            String response = restTemplate.getForObject(apiUrl, String.class);

            // JSON 파싱
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(response);
            JsonNode items = rootNode.path("items");

            List<PublicData> publicDataList = new ArrayList<>();
            for (JsonNode item : items) {
                PublicData publicData = new PublicData();
                publicData.setEntpName(item.path("entpName").asText());
                publicData.setItemName(item.path("itemName").asText());
                publicData.setEfcyQesitm(item.path("efcyQesitm").asText());
                publicData.setUseMethodQesitm(item.path("useMethodQesitm").asText());
                publicData.setAtpnWarnQesitm(item.path("atpnWarnQesitm").asText());
                publicData.setAtpnQesitm(item.path("atpnQesitm").asText());
                publicData.setIntrcQesitm(item.path("intrcQesitm").asText());
                publicData.setSeQesitm(item.path("seQesitm").asText());
                publicData.setDepositMethodQesitm(item.path("depositMethodQesitm").asText());
                publicData.setOpenDe(item.path("openDe").asText());
                publicData.setUpdateDe(item.path("updateDe").asText());
                publicData.setItemImage(item.path("itemImage").asText());
                publicData.setBizrno(item.path("bizrno").asText());

                return publicData;
            }

            // 데이터 저장
            publicDataRepository.saveAll(publicDataList);
            System.out.println("데이터 저장 완료!");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("데이터 저장 중 오류 발생");
        }
        return null;
    }
}
