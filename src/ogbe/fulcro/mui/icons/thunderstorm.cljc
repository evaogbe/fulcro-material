(ns ogbe.fulcro.mui.icons.thunderstorm
  #?(:cljs (:require
            ["@mui/icons-material/Thunderstorm" :default Thunderstorm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-thunderstorm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Thunderstorm)))