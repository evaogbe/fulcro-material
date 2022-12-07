(ns ogbe.fulcro.mui.icons.bungalow
  #?(:cljs (:require
            ["@mui/icons-material/Bungalow" :default Bungalow]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bungalow
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Bungalow)))