(ns ogbe.fulcro.mui.icons.hourglass-empty
  #?(:cljs (:require
            ["@mui/icons-material/HourglassEmpty" :default HourglassEmpty]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hourglass-empty
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HourglassEmpty)))