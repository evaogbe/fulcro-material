(ns ogbe.fulcro.mui.icons.pause-circle-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PauseCircleRounded" :default PauseCircleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-circle-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseCircleRounded)))