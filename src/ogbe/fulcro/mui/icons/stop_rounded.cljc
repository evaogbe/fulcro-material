(ns ogbe.fulcro.mui.icons.stop-rounded
  #?(:cljs (:require
            ["@mui/icons-material/StopRounded" :default StopRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-stop-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory StopRounded)))