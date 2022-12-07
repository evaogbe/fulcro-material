(ns ogbe.fulcro.mui.icons.pause-circle-outline
  #?(:cljs (:require
            ["@mui/icons-material/PauseCircleOutline" :default PauseCircleOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-pause-circle-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PauseCircleOutline)))