(ns ogbe.fulcro.mui.icons.map-rounded
  #?(:cljs (:require
            ["@mui/icons-material/MapRounded" :default MapRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-map-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MapRounded)))