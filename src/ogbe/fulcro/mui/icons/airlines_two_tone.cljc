(ns ogbe.fulcro.mui.icons.airlines-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/AirlinesTwoTone" :default AirlinesTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-airlines-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AirlinesTwoTone)))