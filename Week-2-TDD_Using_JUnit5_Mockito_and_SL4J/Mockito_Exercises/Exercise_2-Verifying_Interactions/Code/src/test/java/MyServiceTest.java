import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*; // Importing all static methods from Mockito

public class MyServiceTest {

    private MyService myService;
    private ExternalApi mockExternalApi; // mock object

    @Before
    public void setUp() {
        // Arrange: Creates a mock object for ExternalApi
        mockExternalApi = mock(ExternalApi.class);

        // Arrange: Initializes MyService with the mocked ExternalApi
        myService = new MyService(mockExternalApi);

        System.out.println("Setup: Mock ExternalApi created and MyService initialized.");
    }

    @Test
    public void testFetchDataFromExternalService_Verification() {
        // Arrange: No specific stubbing needed if we only care about verification
        // but adding one for completeness if the method returns a value.
        when(mockExternalApi.fetchData("test_query")).thenReturn("some data");

        // Act: Calls the method on MyService
        myService.fetchDataFromExternalService("test_query");

        // Assert/Verify: Ensures that fetchData was called exactly once with "test_query"
        // This is the core of verification.
        verify(mockExternalApi, times(1)).fetchData("test_query");

        // We can also verify that other methods were *not* called
        verifyNoMoreInteractions(mockExternalApi); // Verifies no other calls on this mock

        System.out.println("testFetchDataFromExternalService_Verification passed. " +
                "fetchData(\"test_query\") was called once.");
    }

    @Test
    public void testPerformAction_MultipleCallsVerification() {
        // Arrange: Prepare data for the action
        String dataId = "action_item";
        int callCount = 3;

        // Act: Calls the method that interacts with the mock multiple times
        myService.performAction(dataId, callCount);

        // Assert/Verify: Ensures fetchData was called 'callCount' times
        // We expect calls with "action_item-0", "action_item-1", "action_item-2"
        verify(mockExternalApi, times(1)).fetchData("action_item-0");
        verify(mockExternalApi, times(1)).fetchData("action_item-1");
        verify(mockExternalApi, times(1)).fetchData("action_item-2");

        // Verifies total number of calls to fetchData
        verify(mockExternalApi, times(callCount)).fetchData(anyString()); // Verifies any string argument for fetchData

        // Verifies no other interactions on the mock
        verifyNoMoreInteractions(mockExternalApi);

        System.out.println("testPerformAction_MultipleCallsVerification passed. " +
                "fetchData was called " + callCount + " times with expected arguments.");
    }

    @Test
    public void testFetchData_NoInteraction() {
        // Arrange: MyService is initialized, but no methods are called on it that would use the mock

        // Act: Does nothing that would interact with mockExternalApi

        // Assert/Verify: Ensures that no methods were called on the mock at all
        verifyNoInteractions(mockExternalApi);

        System.out.println("testFetchData_NoInteraction passed. No interactions with mockExternalApi.");
    }
}