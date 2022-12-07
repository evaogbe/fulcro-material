(ns ogbe.fulcro.mui.icons.route-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RouteRounded" :default RouteRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-route-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouteRounded)))