(ns ogbe.fulcro.mui.icons.my-location-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MyLocationRounded" :default MyLocationRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-my-location-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MyLocationRounded)))