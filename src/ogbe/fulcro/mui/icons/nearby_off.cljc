(ns ogbe.fulcro.mui.icons.nearby-off
  #?(:cljs (:require
            ["@mui/icons-material/NearbyOff" :default NearbyOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-nearby-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NearbyOff)))