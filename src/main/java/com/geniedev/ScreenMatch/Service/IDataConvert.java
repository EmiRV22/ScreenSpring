package com.geniedev.ScreenMatch.Service;

import model.DataSeries;

public interface IDataConvert {
   <T> T obtainData (String json, Class<T> claseData);
}
