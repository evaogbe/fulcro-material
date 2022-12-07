(ns ogbe.fulcro.mui.icons.local-airport
  #?(:cljs (:require
            ["@mui/icons-material/LocalAirport" :default LocalAirport]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-airport
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalAirport)))