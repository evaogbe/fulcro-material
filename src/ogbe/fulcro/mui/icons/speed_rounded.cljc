(ns ogbe.fulcro.mui.icons.speed-rounded
  #?(:cljs (:require
            ["@mui/icons-material/SpeedRounded" :default SpeedRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-speed-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SpeedRounded)))