(ns ogbe.fulcro.mui.icons.airplay-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AirplayTwoTone" :default AirplayTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airplay-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirplayTwoTone)))