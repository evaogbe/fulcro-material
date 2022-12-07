(ns ogbe.fulcro.mui.icons.house-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HouseRounded" :default HouseRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-house-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HouseRounded)))