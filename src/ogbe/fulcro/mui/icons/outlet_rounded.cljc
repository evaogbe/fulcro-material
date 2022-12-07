(ns ogbe.fulcro.mui.icons.outlet-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OutletRounded" :default OutletRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-outlet-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OutletRounded)))