(ns ogbe.fulcro.mui.icons.streetview-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StreetviewRounded" :default StreetviewRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-streetview-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StreetviewRounded)))