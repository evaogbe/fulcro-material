(ns ogbe.fulcro.mui.icons.air-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AirSharp" :default AirSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-air-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirSharp)))