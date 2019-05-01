package app;
import java.util.HashMap;

public class BusInfoClass{
    // 싱글톤객체
    // 
    private static BusInfoClass busInfo = new BusInfoClass();

    public static BusInfoClass getInstance(){
        if(busInfo == null){
            busInfo = new BusInfoClass();
        }
        return busInfo;
    }

    // 전체 경로정보 <RouteID, RouteClass Instance> 형식으로 저장
    private HashMap<String, RouteClass> RouteList = new HashMap<String, RouteClass>();
    // 전체 정류장 정보 <StationID, StationClass Instance> 형식으로 저장
    private HashMap<String, StationClass> StationList = new HashMap<String, StationClass>();

    // constructor
    private BusInfoClass(){
        System.out.println("hello");
    }

    // HashMap에 경로 추가
    public void addRoute(RouteClass instance){
        this.RouteList.put(instance.routeId, instance);
    }

    // HashMap에 정류장 추가
    public void addStation(StationClass instance){
        this.StationList.put(instance.stnd_bsst_id, instance);
    }

    // 특정  Route 정보 불러오기 
    // return 값은 Route class instance
    public RouteClass getRouteInfo(String routeId){
        return this.RouteList.get(routeId);
    }

    // 특정 Station 정보 불러오기
    // return 값은 Station class instance
    public StationClass getStationInfo(String stationId){
        return this.StationList.get(stationId);
    }
}