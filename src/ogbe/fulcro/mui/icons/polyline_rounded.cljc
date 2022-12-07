(ns ogbe.fulcro.mui.icons.polyline-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PolylineRounded" :default PolylineRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-polyline-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PolylineRounded)))