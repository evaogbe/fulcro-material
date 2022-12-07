(ns ogbe.fulcro.mui.icons.pause-rounded
  #?(:cljs (:require
            ["@mui/icons-material/PauseRounded" :default PauseRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseRounded)))