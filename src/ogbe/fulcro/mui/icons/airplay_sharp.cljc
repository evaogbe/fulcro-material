(ns ogbe.fulcro.mui.icons.airplay-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AirplaySharp" :default AirplaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplay-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplaySharp)))