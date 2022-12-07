(ns ogbe.fulcro.mui.icons.hotel-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HotelSharp" :default HotelSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hotel-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HotelSharp)))