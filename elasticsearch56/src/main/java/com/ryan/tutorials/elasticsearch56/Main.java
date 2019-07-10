package com.ryan.tutorials.elasticsearch56;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpHost;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;

import com.ryan.tutorials.elasticsearch56.model.Ticket;


public class Main {
    
    private static String m_elasticSearchHostname = "localhost";
    private static Integer m_elasticSearchPort = 9200;
    private static String m_elasticsearchIndex = "reqtracker_tickets";

    public static void addESRecord() throws IOException {
        boolean isWaitUntil = false;
        Ticket ticket = new Ticket();
        ticket.setTicketId("9070082");
        ticket.setAction("action type");

        String documentId = ticket.getTicketId();

        RestClient restClient = RestClient.builder(new HttpHost(m_elasticSearchHostname, m_elasticSearchPort, "http"))
                .build();
        RestHighLevelClient client = new RestHighLevelClient(restClient);

        String source = Util.objectToJsonString(ticket);

        IndexRequest request = new IndexRequest(m_elasticsearchIndex, "ticket", documentId);

        request.source(source, XContentType.JSON);
        if (isWaitUntil) {
            request.setRefreshPolicy(WriteRequest.RefreshPolicy.WAIT_UNTIL);
        }
        IndexResponse response = client.index(request);
        System.err.println("Ticket added in elasticsearch: " + response.getResult());
    }
    
    public static void getSingleDocument() {
        try (RestClient restClient = RestClient
                .builder(new HttpHost(m_elasticSearchHostname, m_elasticSearchPort, "http")).build()) {
            RestHighLevelClient client = new RestHighLevelClient(restClient);
            GetRequest request = new GetRequest(m_elasticsearchIndex, "ticket", "9070082");
            GetResponse response = client.get(request);

            System.err.println(response);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void getMultiDocument() {
        try (RestClient restClient = RestClient
                .builder(new HttpHost(m_elasticSearchHostname, m_elasticSearchPort, "http")).build()) {
            RestHighLevelClient client = new RestHighLevelClient(restClient);
            
            SearchRequest searchRequest = new SearchRequest(m_elasticsearchIndex);
            
            SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
            
            List<String> ticketIds = new ArrayList<>();
            ticketIds.add("9070082");
            ticketIds.add("9070083");
            
            searchSourceBuilder.query(QueryBuilders.termsQuery("ticketId", ticketIds)); 
            searchSourceBuilder.from(0); 
            searchSourceBuilder.size(5);
            
            searchRequest.source(searchSourceBuilder);
            
            SearchResponse response = client.search(searchRequest);
            System.err.println(response);
            
            SearchHit[] searchHits = response.getHits().getHits();
            for (SearchHit hit : searchHits) {
                System.err.println(hit.getSource());
            }
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
//        addESRecord();
        getMultiDocument();
        
        // TODO Auto-generated method stub
//        String recipientTo = "12312";
//        
//        Pattern pattern = Pattern.compile("[\\w\\.]+\\+(\\w+)@.+");
//        Matcher matcher = pattern.matcher(recipientTo);
//        
//        
//        if (matcher.find()) {
//            System.err.println(matcher.group(1));
//        } else {
//            System.err.println("nothing");
//        }
        
//        String text = "RE FW  [Peplink #9060153] Testing #23131 sd22";
//
//        Pattern subjectPattern = Pattern.compile("\\[Peplink #\\d+].+");
//        Pattern ticketIdPattern = Pattern.compile("\\[Peplink #\\d+]");
//        
//        
//        Matcher subjectMatcher = subjectPattern.matcher(text);
//        boolean matches = subjectMatcher.matches();
//        System.err.println(matches);
//
//        if (subjectMatcher.find()) {
//            System.err.println(subjectMatcher.start() + " ;" + subjectMatcher.end());
//            String subject = text.substring(subjectMatcher.start(), subjectMatcher.end());
//
//            System.err.println("subject : " + subject);
//            
//            Matcher ticketIdMatcher = ticketIdPattern.matcher(subject);
//
//            if (ticketIdMatcher.find()) {
//                String ticketId = subject.substring(ticketIdMatcher.start(), ticketIdMatcher.end());
//
//                System.err.println("ticketId : " + ticketId);
//                
//                String sub = subject.substring(ticketIdMatcher.end(), subject.length()).trim();
//                
//                System.err.println("subject clean : " + sub);
//            }
//            
//        }

//        String text = "[Peplink #9060153] Testing #23131 sd22";
//        
//        Pattern subjectPattern = Pattern.compile("Peplink #\\d+");
//        
//        Matcher subjectMatcher = subjectPattern.matcher(text);
//        
//        if(subjectMatcher.find()) {
//            System.err.println(subjectMatcher.start() + " " + subjectMatcher.end());
//        }
    }

}
