package nutdf21.push.api.jpa;

import nutdf21.push.api.vo.jpa.AppInfo;
//import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//public interface AppInfoRepository extends JpaRepository<AppInfo, Long> {
public interface AppInfoRepository{

    public List<AppInfo> findByName(String appId);

}