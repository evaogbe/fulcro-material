(ns ogbe.fulcro.mui.icons.route-outlined
  #?(:cljs (:require
            ["@mui/icons-material/RouteOutlined" :default RouteOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-route-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouteOutlined)))