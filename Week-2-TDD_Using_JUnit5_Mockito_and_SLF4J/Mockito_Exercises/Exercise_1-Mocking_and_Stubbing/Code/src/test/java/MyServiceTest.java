import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*; // Importing all static methods from Mockito

public class MyServiceTest {

    private MyService myService;
    private ExternalApi mockExternalApi; // This will be our mock object

    @Before
    public void setUp() {
        // Arrange: Creating a mock object for ExternalApi
        // This creates a "dummy" ExternalApi that we can control
        mockExternalApi = mock(ExternalApi.class);

        // Arrange: Initializing MyService with the mocked ExternalApi
        // MyService now depends on our controlled mock, not a real external service
        myService = new MyService(mockExternalApi);

        System.out.println("Setup: Mock ExternalApi created and MyService initialized.");
    }

    @Test
    public void testFetchDataFromExternalService() {
        // Arrange: Defines the expected behavior of the mock
        // When fetchData("some_query_parameter") is called on mockExternalApi,it should return "Mock Data"

        when(mockExternalApi.fetchData("some_query_parameter")).thenReturn("Mock Data");

        // Act: Calls the method on MyService that uses the external API
        String result = myService.fetchDataFromExternalService();

        // Assert: Verifies the result returned by MyService
        assertEquals("Mock Data", result);

        // Assert: Verifies that the fetchData method on the mock was called exactly once
        verify(mockExternalApi, times(1)).fetchData("some_query_parameter");

        System.out.println("testFetchDataFromExternalService passed. Result: " + result);
    }

    @Test
    public void testProcessData() {
        // Arrange: Defines the expected behavior for another call on the mock
        String inputQuery = "test_input";
        String rawDataFromMock = "raw test data";
        String expectedProcessedData = "Processed: RAW TEST DATA";

        when(mockExternalApi.fetchData(inputQuery)).thenReturn(rawDataFromMock);

        // Act: Calls the method that processes data using the external API
        String result = myService.processData(inputQuery);

        // Assert: Verifies the processed result
        assertEquals(expectedProcessedData, result);

        // Assert: Verifies that the fetchData method on the mock was called for this test
        verify(mockExternalApi, times(1)).fetchData(inputQuery);

        System.out.println("testProcessData passed. Result: " + result);
    }
}
