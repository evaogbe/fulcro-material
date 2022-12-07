(ns ogbe.fulcro.mui.icons.satellite
  #?(:cljs (:require
            ["@mui/icons-material/Satellite" :default Satellite]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-satellite
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Satellite)))