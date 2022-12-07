(ns ogbe.fulcro.mui.icons.ad-units
  #?(:cljs (:require
            ["@mui/icons-material/AdUnits" :default AdUnits]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ad-units
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AdUnits)))