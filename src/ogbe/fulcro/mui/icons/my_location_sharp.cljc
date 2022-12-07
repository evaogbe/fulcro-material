(ns ogbe.fulcro.mui.icons.my-location-sharp
  #?(:cljs (:require
            ["@mui/icons-material/MyLocationSharp" :default MyLocationSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-my-location-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MyLocationSharp)))