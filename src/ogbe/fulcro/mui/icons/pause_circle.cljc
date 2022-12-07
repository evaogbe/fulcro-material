(ns ogbe.fulcro.mui.icons.pause-circle
  #?(:cljs (:require
            ["@mui/icons-material/PauseCircle" :default PauseCircle]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-circle
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseCircle)))