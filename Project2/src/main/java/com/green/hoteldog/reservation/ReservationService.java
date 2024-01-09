package com.green.hoteldog.reservation;

import com.green.hoteldog.reservation.model.ResDogInfoVo;
import com.green.hoteldog.reservation.model.ResInfoDto;
import com.green.hoteldog.reservation.model.ResInfoVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ReservationService {
    private final ReservationMapper mapper;
    public List<ResInfoVo> getUserReservation(ResInfoDto dto){
        /*
        {[
            resPk : int
            , hotelNm : String
            , hotelCallnum : String
            , roadAddress : String
            , fromDate : String
            , toDate : String
            , cancle : int
            , dogInfo : [
                    resDogPk : int
                    , sizePk : int
                    , age : int
                    , information : String
                    ]
        ]}
         */
        List<ResDogInfoVo> resDogInfoVoList=mapper.getDogInfoReservation();
        List<ResInfoVo> resInfoVos=mapper.getUserReservation(dto);



        return null;
    }
}
