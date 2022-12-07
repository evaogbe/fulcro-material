(ns ogbe.fulcro.mui.icons.airplay
  #?(:cljs (:require
            ["@mui/icons-material/Airplay" :default Airplay]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplay
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Airplay)))