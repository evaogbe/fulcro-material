(ns ogbe.fulcro.mui.icons.route-sharp
  #?(:cljs (:require
            ["@mui/icons-material/RouteSharp" :default RouteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-route-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouteSharp)))