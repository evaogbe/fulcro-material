(ns ogbe.fulcro.mui.icons.railway-alert
  #?(:cljs (:require
            ["@mui/icons-material/RailwayAlert" :default RailwayAlert]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-railway-alert
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RailwayAlert)))